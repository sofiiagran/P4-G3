grammar TL;

program:
    (prototypes)? block EOF
    ;

prototypes:
    (ID funcOutputParam)+
    ;

block:
    startBlock (functionsBlock)?
    ;

startBlock:
    START BEGIN startBody* END
    ;

startBody:
    declaration+
    | initialization+
    | expression+
    | statement+
    ;


functionsBlock:
    FUNCTIONS BEGIN funcBlockBody* END
    ;

funcBlockBody:
    declaration+
    | initialization+
    | funcDec+
    ;

funcDec:
    FUNC funcID=funcName (funcOutputParam)? BEGIN funcBody* END
    ;

funcOutputParam:
    LPAREN ( (declaration | ID) | ( (declaration | ID) COMMA (declaration | ID) )* ) RPAREN
    ;

funcInputParam:
    LPAREN (ID | (ID COMMA ID)* ) RPAREN
    ;
funcName:
    ID
    ;

funcCall:
    (RUN)? funcID=ID (funcInputParam)?
    ;

declaration:
    NUMBER ID #numberDec
    | TEXT ID #textDec
    | BOOLEAN ID #boolDec
    ;


initialization:
    textInit+
    | numberInit+
    | booleanInit+
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
    IF condition (BEGIN | THEN) statementBody END
    ;
ifThenElseStatement:
    IF condition (BEGIN | THEN) statementBody END (ELSE_IF  BEGIN statementBody END)* ELSE BEGIN statementBody END
    ;
repeatStatement:
    REPEAT (NUMBER_VAL | ID ) TIMES (BEGIN | THEN) statementBody END
    ;
repeatUntilStatement:
    REPEAT_UNTIL condition (BEGIN | THEN) statementBody END
    ;
whileStatement:
    WHILE condition (DO | BEGIN) statementBody END
    ;

statementBody:
    expression* declaration* statement*
    ;

condition:
    leftCon=val rightCondition                      #con1
    | ID                                            #con2
    | NOTEQUAL ID                                   #con3
    ;

rightCondition:
    (op=conditionalOperation rightCon=val)+
    ;


expression:
    funcCall+
    | funcDec+
    | returnExp+
    | printExp+
    | askExp+
    | mathExpr+
    ;



returnExp:
    RETURN returnBody
    ;
returnBody:
    val
    ;

printExp:
    PRINT printBody
    ;

printBody:
    (val) ( (ADD (val))+)?
    ;


askExp: ASK askID=ID printBody
    ;

answerVal:
    askID=ID DOT ANSWER
    ;

<<<<<<< Updated upstream
mathExpr:
     left = value ((op = mathematicalOperation) right = value+ )+ #mathExp
    ;

value:
    var | NUMBER_VAL
=======
mathExp:
    ID ASSIGN left=val (mathOp=mathematicalOperation1 right=val)+       #mathExp1
    | left=val mathOp=mathematicalOperation2 right=val                  #mathExp2
>>>>>>> Stashed changes
    ;

textInit:
    (TEXT)? var1ID=ID ASSIGN (TEXT_VAL | var2ID=ID)
    ;

numberInit:
    (NUMBER)? var1ID=ID ASSIGN (NUMBER_VAL | var2ID=ID)
    ;

booleanInit:
    (BOOLEAN)? var1ID=ID ASSIGN (BOOL_LITERAL | var2ID=ID)
    ;

val:
    textVal=TEXT_VAL
    | numberVal=NUMBER_VAL
    | boolVal=BOOL_LITERAL
    | variable=ID
    ;

conditionalOperation:
             conOpLT=LT
			 | conOpGT=GT
			 | conOpEQ=EQUAL
			 | conOpNEQ=NOTEQUAL
			 | conOpLE=LE
			 | conOpGE=GE
			 ;

<<<<<<< Updated upstream
mathematicalOperation:
			   ASSIGN
			 | ADD
			 | SUB
			 | MUL
			 | DIV
=======
mathematicalOperation1:
			 | mathOpADD=ADD
			 | mathOpSUB=SUB
			 | mathOpMUL=MUL
			 | mathOpDIV=DIV
>>>>>>> Stashed changes
			 ;
mathematicalOperation2:
    		 | mathOpADD=ADD_ASSIGN
    	     | mathOpSUB=SUB_ASSIGN
    		 | mathOpMUL=MUL_ASSIGN
    	     | mathOpDIV=DIV_ASSIGN
    		 ;



/***** LEXER RULES  *****/

// list of reserved keywords



START : 'start';
FUNCTIONS : 'functions';
FUNC : 'function';

//blocks
BEGIN: 'begin' ;
END: 'end';

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
ANSWER: 'answer';

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