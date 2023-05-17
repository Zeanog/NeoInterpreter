tree grammar NeoTreePass1;

options {
	language=CSharp3;
	tokenVocab=Neo;
	//output=AST;
	ASTLabelType=CommonTree;
}

@header {
using Neo;
using System;
using System.Collections.Generic;
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
	int 	numParams = 0;
	int	stackFrameSize = 0;
}
	:	^(FUNCTION_DEF f=ID (c=parameters {numParams = c;})? (numDecls=body {stackFrameSize = numDecls;})?) { ProgramDef.Instance.FunctionDefs.Create($f.text, numParams, stackFrameSize); }
	;
	
body returns[int retNumDeclarations]
@init {
	int numDecls = 0;
}
	:	^(FUNCTION_BODY (s=statement { numDecls += s; })+) { $retNumDeclarations = numDecls; }
	;
	
parameters returns[int retNumParams]
@init {
	int numParams = 0;
}
@after {
	$retNumParams = numParams;
}
	:	^(PARAMS (param {++numParams;})+)
	;
	
param
	:	^(PARAM ID ID) { }	
	;
	
////////////////////////////////////////////////

functionCall
	:	^(FUNCTION_CALL f=ID {} arguments?) {
	}
	;
	
arguments
	:	^(FUNCTION_ARGUMENTS argument+)
	;
	
argument
	:	^(FUNCTION_ARGUMENT value) {
		}
	;

//////////////////////////////////////////////////

program
	:	^(PROGRAM (statement)+)
	;
	
statement returns[int retNumDeclarations]
@init {
	int numDeclarations = 0;
}
@after {
	$retNumDeclarations = numDeclarations;
}
	:	declaration { numDeclarations++; }
	|	assignment
	|	functionCall
	;
	
declaration
	:	^(DECLARATION ID v=ID) {
				}
	;
	
assignment
	:	^(ASSIGNMENT v=ID addSubExp) {
				}
	;
	
addSubExp
	:  mulDivExp
  	|  ^('+' mulDivExp mulDivExp) {
  		}
  	|  ^('-' mulDivExp mulDivExp) {
  		}
  	;

mulDivExp
	:  unaryExp
  	|  ^('*' unaryExp unaryExp) {
  		}
 	|  ^('/' unaryExp unaryExp) {
 		}
  	;
	
unaryExp
  	:  ^(UNARY value) {
  			}
	|  value
  	;
  	
value
	:	^(VARIABLE ID) {}
	|	^(LITERAL TYPE_INT INT) {
					}
	|	^(LITERAL TYPE_FLOAT FLOAT) { 
					}
	|	^(PARENEXP addSubExp)
	;