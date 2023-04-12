grammar TL;

program:
    block EOF
    ;

block:
    startBlock (functionsBlock)?
    ;

startBlock:
    START LBRACE startBody* RBRACE
    ;

startBody:
    declaration+
    | initialization+
    | expression+
    | statement+
    ;


functionsBlock:
    FUNCTIONS LBRACE funcBlockBody* RBRACE
    ;

funcBlockBody:
    declaration+
    | initialization+
    | funcDec+
    ;

funcDec:
    FUNC funcID=funcName (funcOutputParam)? LBRACE funcBody* RBRACE
    ;

funcName:
    ID
    ;

funcOutputParam:
    LPAREN ( (declaration | var) | ( (declaration | var) COMMA (declaration | var) )* ) RPAREN
    ;

funcInputParam:
    LPAREN (var | (var COMMA var)* ) RPAREN
    ;


funcCall:
    (RUN)? funcID=funcName (funcInputParam)?
    ;

declaration:
    dt=dataType var
    ;

initialization:
    textInit+
    | numberInit+
    | booleanInit+
    ;

dataType:
    dtNumber=NUMBER
    | dtText=TEXT
    | dtBoolean=BOOLEAN
    ;

funcBody:
    statement+
    | expression+
    | declaration+
    | initialization+
    ;

statement:
    ifThenStatement+
    | ifThenElseStatement+
    | repeatStatement+
    | repeatUntilStatement+
    | whileStatement+
    ;

ifThenStatement:
    IF condition THEN statementBody+
    ;
ifThenElseStatement:
    IF condition THEN statementBody+ ELSE_IF* statementBody* ELSE statementBody
    ;
repeatStatement:
    REPEAT NUMBER_VAL TIMES statementBody+
    ;
repeatUntilStatement:
    REPEAT_UNTIL condition statementBody+
    ;
whileStatement:
    WHILE condition DO statementBody+
    ;

statementBody:
    expression+
    | declaration+
    ;

condition:
    (var | val) operation (AND operation | OR operation)*
    ;

expression:
    funcCall+
    | funcDec+
    | returnExp+
    | printExp+
    | askExp+
    | mathExp+
    ;

operation:
    ( conditionalOperation (val |  var) )
    ;

returnExp:
    RETURN var
    ;

printExp:
    PRINT (TEXT_VAL | var | NUMBER_VAL) ( (ADD (TEXT_VAL | var | NUMBER_VAL))+)?

    ;

askExp: ASK askID=var (TEXT_VAL | var | NUMBER_VAL) ( (ADD (TEXT_VAL | var | NUMBER_VAL))+)?;

mathExp:
    (var | NUMBER_VAL) (mathematicalOperation (var  | NUMBER_VAL)+ )+
    ;

textInit:
    (TEXT)? var ASSIGN TEXT_VAL
    ;

numberInit:
    (NUMBER)? var ASSIGN NUMBER_VAL
    ;

booleanInit:
    (BOOLEAN)? var ASSIGN BOOL_LITERAL
    ;

var:
    varID=ID
    ;

val:
    textVal=TEXT_VAL
    | numberVal=NUMBER_VAL
    | boolVal=BOOL_LITERAL
    ;

conditionalOperation:
             conOp=LT
			 | conOp=GT
			 | conOp=EQUAL
			 | conOp=NOTEQUAL
			 | conOp=LE
			 | conOp=GE
			 ;

mathematicalOperation:
			 mathOp=ASSIGN
			 | mathOp=ADD
			 | mathOp=SUB
			 | mathOp=MUL
			 | mathOp=DIV
			 ;


/***** LEXER RULES  *****/

// list of reserved keywords

START : 'start';
FUNCTIONS : 'functions';
FUNC : 'function';

// datatypes
BOOLEAN : 'truthvalue';
NUMBER : 'number';
TEXT : 'text';

//operation keywords
PRINT : 'print';
LIST : 'list';
WHILE : 'while';
REPEAT : 'repeat';
REPEAT_UNTIL : 'repeat until';
IF : 'if';
ELSE : 'else';
ELSE_IF : 'else if';
THEN : 'then';
DO : 'do';
TIMES: 'times';
RETURN: 'return';
ASK: 'ask';
RUN: 'run';
ALWAYS: 'always';

// Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';
QUOTE : '"';

// Operators

ASSIGN : '=';
GT : '>';
LT : '<';
EQUAL : '==' | '=?' ;
LE : '<=' | 'less or equal to' ;
GE : '>=' | 'greater or equal to';
NOTEQUAL : '!=' | 'not equal to' | 'is not';
AND : '&&' | 'and';
OR : '||' | 'or';
INC : '++' | 'increase by one' ;
DEC : '--' | 'decrease by one' ;
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
CARET : '^';
MOD : '%';
BOOL_LITERAL : 'true' | 'false';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';

// definition of letter and strings, based on JAVA v9
fragment
Letter
	:	[a-zA-Z$_]
	|	~[\u0000-\u007F\uD800-\uDBFF]
	|   [\uD800-\uDBFF] [\uDC00-\uDFFF]
	;

fragment
LetterOrDigit
	:	[a-zA-Z0-9$_]
		~[\u0000-\u007F\uD800-\uDBFF]
	|	NUMBER_VAL
	;

fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
SingleCharacter
	:	~['\\\r\n]
	;

// String Literals
fragment
StringCharacters
	:	StringCharacter+
	;
fragment
StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;

// Escape Sequences for Character and String Literals
fragment
EscapeSequence
	:	'\\' 'u005c'? [btnfr"'\\]
	|	OctalEscape
    |   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
	;

fragment
OctalEscape
	:	'\\' 'u005c'? OctalDigit
	|	'\\' 'u005c'? OctalDigit OctalDigit
	|	'\\' 'u005c'? ZeroToThree OctalDigit OctalDigit
	;

fragment
ZeroToThree
	:	[0-3]
	;

// This is not in the spec but prevents having to preprocess the input
fragment
UnicodeEscape
    :   '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;


// text and number values
TEXT_VAL
	:	'"' StringCharacters? '"'
	;

NUMBER_VAL: '-'?('0'|[1-9][0-9]*)('.'[0-9]+)? ;

// whitespace and comments

WS: (' '|'\t' | NEWLINE)+ -> skip;

NEWLINE : ('\r\n'|'\n'|'\r');

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;

// If none of the expressions above match
// it checks if it is an ID (which has to have at least one letter and cannot start with a number)

ID
	:	(Letter LetterOrDigit*)+
	;