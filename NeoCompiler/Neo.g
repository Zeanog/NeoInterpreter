grammar Neo;

options {
	language=CSharp3;
	output=AST;
	ASTLabelType=CommonTree;
	TokenLabelType=CommonToken;
}

tokens {
	FILE;
	SCRIPT;
	PROGRAM;
	DECLARATION;
	LITERAL;
	VARIABLE;
	UNARY;
	PARENEXP;
	FUNCTION_DEF;
	FUNCTION_DEFS;
	PARAM;
	PARAMS;
	TYPE_INT;
	TYPE_FLOAT;
	FUNCTION_CALL;
	FUNCTION_ARGUMENTS;
	FUNCTION_ARGUMENT;
	FUNCTION_BODY;
	ASSIGNMENT;
}

@members {
public AstParserRuleReturnScope<CommonTree, CommonToken> Process() {
	//TreeAdaptor = new CommonTreeAdaptor();
	return file();
}
}

file 
	:	script -> ^(FILE script)
	;
	
script	:	functionDefs? program? -> ^(SCRIPT functionDefs? program?)
	;
	
functionDefs
	:	(functionDef)+ -> ^(FUNCTION_DEFS functionDef+)
	;

functionDef:	ID ('(' parameters? ')' '{' body? '}') -> ^(FUNCTION_DEF ID parameters? body?)
	;
	
body	:	(statement)+ -> ^(FUNCTION_BODY statement+)
	;
	
parameters	:	param (',' param)* -> ^(PARAMS param+)
	;
	
param	:	(t=ID n=ID) -> ^(PARAM $t $n)
	;
	
////////////////////////////////////////////////

functionCall
	:	f=ID ('(' arguments? ')') -> ^(FUNCTION_CALL $f arguments?)
	;
	
arguments
	:	argument (',' argument)* -> ^(FUNCTION_ARGUMENTS argument+)
	;
	
argument:	value -> ^(FUNCTION_ARGUMENT value)
	;

////////////////////////////////////////////////

program
	:	statement+ -> ^(PROGRAM statement+)
	;
	
statement
	:	declaration ';' -> declaration
	|	assignment ';' -> assignment
	|	functionCall ';' -> functionCall
	;
	
declaration
	:	ID ID -> ^(DECLARATION ID ID)
	;
	
assignment
	:	(id=ID '=' exp=addSubExp) -> ^(ASSIGNMENT $id $exp)
	;

addSubExp
  	:  (mulDivExp -> mulDivExp) (
  		('+' rhs=mulDivExp) -> ^('+' $addSubExp $rhs)
	| 	('-' rhs=mulDivExp) -> ^('-' $addSubExp $rhs)
  	)*
	;

mulDivExp
  	:  (unaryExp -> unaryExp) (
  		('*' rhs=unaryExp) -> ^('*' $mulDivExp $rhs)
  	|	('/' rhs=unaryExp) -> ^('/' $mulDivExp $rhs)
  	)*
	;

unaryExp
  	:  '-' value -> ^(UNARY value)
	|  value
  	;
	
value
	:	ID -> ^(VARIABLE ID)
	|	INT_VALUE -> ^(LITERAL TYPE_INT INT_VALUE)
	|	FLOAT_VALUE -> ^(LITERAL TYPE_FLOAT FLOAT_VALUE)
	|	'(' e=addSubExp ')' -> ^(PARENEXP $e )
	;
	
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT_VALUE :	('0'..'9')+
    ;

FLOAT_VALUE
    :   (INT_VALUE '.' INT_VALUE)
    ;

COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n') {Skip();}
    |   ('/*' ( options {greedy=false;} : . )* '*/') {Skip();}
    ;

WS  :   (' '|'\t'|'\r'|'\n')+ {Skip();}
    ;