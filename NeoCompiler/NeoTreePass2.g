tree grammar NeoTreePass2;

options {
	language=CSharp3;
	tokenVocab=Neo;
	//output=AST;
	ASTLabelType=CommonTree;
}

@header {
using Neo;
using System;
}

@members {
public void	Process() {
		file();
	}
}

file	:	
	|	^(FILE script)
	;
	
script 	:	^(SCRIPT functionDefs (program)?) {}
	|	^(SCRIPT program) {}
	;
	
functionDefs
	:	^(FUNCTION_DEFS functionDef+)
	;
	
functionDef
@init {
	FunctionDef funcDef;
	IMemoryDecorator memory = new MemoryDecorator_StackInterface();
}
@after {
	funcDef.PostBodyParse();
}
	:	^(FUNCTION_DEF f=ID {funcDef = ProgramDef.Instance.FunctionDefs[$f.text];} (parameters[funcDef, memory])? {funcDef.PreBodyParse();} (body[funcDef, memory])?)
	;

body [FunctionDef funcDef, IMemoryDecorator memory]
	:	^(FUNCTION_BODY (statement[memory, funcDef.InstructionStream])+)
	;
	
parameters [FunctionDef funcDef, IMemoryDecorator memory]
	:	^(PARAMS (param[funcDef, memory])+)
	;
	
param [FunctionDef funcDef, IMemoryDecorator memory]
	:	^(PARAM t=ID v=ID) {
		memory.AllocateStorage( $v.text, $t.text, funcDef );
	}
	;
	
////////////////////////////////////////////////

functionCall [List<Instruction> instructionStream]
@init {
	FunctionDef funcDef;
}
	:	^(FUNCTION_CALL f=ID {
				funcDef = ProgramDef.Instance.FunctionDefs[$f.text];
				instructionStream.Add( new PushFrameInstruction(new LiteralValue(funcDef.StackFrameSize)) );
			} arguments[instructionStream]?) {
			Value retAddr = new LiteralValue(instructionStream.Count + 2);
			instructionStream.Add( new PushInstruction(retAddr) );
			instructionStream.Add( new CallInstruction(new LiteralValue(funcDef.StartAddress)) );
			instructionStream.Add( new PopFrameInstruction() );
		}
	;
	
arguments [List<Instruction> instructionStream]
	:	^(FUNCTION_ARGUMENTS (argument[instructionStream])+)
	;
	
argument [List<Instruction> instructionStream]
	:	^(FUNCTION_ARGUMENT v=value[instructionStream]) {
		instructionStream.Add( new PushInstruction(v) );
	}
	;

//////////////////////////////////////////////////

program
@init {
	IMemoryDecorator memory = new MemoryDecorator_HeapInterface();
}
	:	^(PROGRAM (statement[memory, CPU.Instance.InstructionStream])+) {
		CPU.Instance.InstructionStream.Add( new EndofProgramInstruction() );
	}
	;
	
statement [IMemoryDecorator memory, List<Instruction> instructionStream]
	:	declaration[memory]
	|	assignment[instructionStream]
	|	functionCall[instructionStream]
	;

declaration [IMemoryDecorator memory]
	:	^(DECLARATION t=ID v=ID) {
		memory.AllocateStorage( $v.text, $t.text );
	}
	;
	
assignment [List<Instruction> instructionStream]
	:	^(ASSIGNMENT v=ID exp=addSubExp[instructionStream]) {
		Value var = ProgramDef.Instance.SymbolTable[$v.text];
		instructionStream.Add( new CopyInstruction(var, exp) );
	}
	;
	
addSubExp [List<Instruction> instructionStream] returns[Value ret]
	:  exp=mulDivExp[instructionStream] {
		ret = exp;
	}
  	|  ^('+' lhs=mulDivExp[instructionStream] rhs=mulDivExp[instructionStream]) {
  		instructionStream.Add( new AddInstruction(lhs, rhs, ret) );
  	}
  	|  ^('-' lhs=mulDivExp[instructionStream] rhs=mulDivExp[instructionStream]) {
  		instructionStream.Add( new SubtractInstruction(lhs, rhs, ret) );
  	}
  	;

mulDivExp [List<Instruction> instructionStream] returns[Value ret]
	:  val=unaryExp[instructionStream] {
		ret = val;
	}
  	|  ^('*' lhs=unaryExp[instructionStream] rhs=unaryExp[instructionStream]) {
  		instructionStream.Add( new MultiplyInstruction(lhs, rhs, ret) );
  	}
 	|  ^('/' lhs=unaryExp[instructionStream] rhs=unaryExp[instructionStream]) {
 		instructionStream.Add( new DivideInstruction(lhs, rhs, ret) );
 	}
  	;
	
unaryExp [List<Instruction> instructionStream] returns[Value ret]
  	:  ^(UNARY v=value[instructionStream]) {
  		if( v.ValueType == typeof(int) ) {
	  		instructionStream.Add( new SubtractInstruction(Value.IntZero, v, ret) );
	  	} else if( v.ValueType == typeof(float) ) {
	  		instructionStream.Add( new SubtractInstruction(Value.FloatZero, v, ret) );
	  	} else {
	  		// Throw invalid type exception
	  	}
  	}
	|  v=value[instructionStream] {
		ret = v;
	}
  	;
  	
value [List<Instruction> instructionStream] returns[Value ret]
	:	^(VARIABLE v=ID) {
		try {
			ret = ProgramDef.Instance.SymbolTable[$v.text];
		} catch( KeyNotFoundException ex ) {
			Console.Write( string.Format("Symbol {0} wasn't declared before use", $v.text) );
		}
	}
	|	^(LITERAL TYPE_INT i=INT) {
		ret = new LiteralValue(int.Parse($i.text));
		
	}
	|	^(LITERAL TYPE_FLOAT f=FLOAT) { 
		ret = new LiteralValue(float.Parse($f.text));
	}
	|	^(PARENEXP e=addSubExp[instructionStream]) {
		ret = e;
	}
	;