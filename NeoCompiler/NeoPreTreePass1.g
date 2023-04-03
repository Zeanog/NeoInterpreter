tree grammar NeoPreTreePass1;

options {
	language=CSharp3;
	tokenVocab=Neo;
	output=AST;
	ASTLabelType=CommonTree;
}

@header {
using Neo;
using System;
}

@members {
public AstTreeRuleReturnScope<CommonTree, CommonTree> Process() {
	//TreeAdaptor = new CommonTreeAdaptor();
	return file();
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
	:	^(FUNCTION_DEF f=ID (c=parameters {})? (numDecls=body {})?) {}
	;
	
body
	:	^(FUNCTION_BODY (s=statement {})+) {  }
	;
	
parameters
	:	^(PARAMS (param {})+)
	;
	
param
	:	^(PARAM 'int' ID) -> ^(PARAM TYPE_INT ID)
	|	^(PARAM 'float' ID) -> ^(PARAM TYPE_FLOAT ID)
	;
	
////////////////////////////////////////////////

functionCall
	:	^(FUNCTION_CALL ID {} arguments?) {
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
	
statement
	:	declaration {}
	|	assignment
	|	functionCall
	;
	
declaration
	:	^(DECLARATION 'int' ID) -> ^(DECLARATION TYPE_INT ID) {
				}
	|	^(DECLARATION 'float' ID) -> ^(DECLARATION TYPE_FLOAT ID) {
				}
	;
	
assignment
	:	^(ASSIGNMENT ID addSubExp) {
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