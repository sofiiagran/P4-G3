grammar TL;

program:
    block EOF
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
    | funcDec+
    ;


functionsBlock:
    FUNCTIONS BEGIN (declaration initialization)* funcDec+ END
    ;

funcDec:
    FUNC funcID=funcName (LPAREN (param=funcOutputParam)? RPAREN)? BEGIN funcBody* (returnExp)? END
    ;

funcOutputParam:
     declaration
    | (declaration (COMMA (declaration))* )
    ;

funcInputParam:
    var | (var (COMMA var)* )
    ;

funcName:
    ID
    ;

funcCall:
    (RUN)? funcID=funcName (LPAREN (param=funcInputParam)? RPAREN)?
    ;


declaration:
    numberDec=numberDecl
    | textDec=textDecl
    | boolDec=boolDecl
    | numberListDecl
    | textListDecl
    | collectionDecl
    | collectionInstanceDecl
    ;

numberDecl:
    NUMBER numberID=ID
    ;
textDecl:
    TEXT textID=ID
    ;
boolDecl:
    BOOLEAN boolID=ID
    ;
numberListDecl:
     NUMBER LIST ID
     ;

numberListInit:
     (NUMBER LIST)? assignID=ID ASSIGN (numberValue | ID) (COMMA (numberValue | ID))+
     ;

textListDecl:
     TEXT LIST ID
     ;

textListInit:
     (TEXT LIST)? assignID=ID ASSIGN (TEXT_VAL | ID) (COMMA  (TEXT_VAL | ID))+
     ;


initialization:
    textInit
    | numberInit
    | booleanInit
    | numberListInit
    | textListInit
    | collectionInit
    ;

funcBody:
    statement+
    | expression+
    | declaration+
    | initialization+
    | funcDec+
    ;

statement:
    ifThenStatement
    | ifThenElseStatement
    | repeatStatement
    | repeatUntilStatement
    | whileStatement
    ;

ifThenStatement:
    IF condition (BEGIN | THEN) statementBody+ END
    ;
ifThenElseStatement:
    IF condition (BEGIN | THEN) ifBody=statementBody* END (ELSE_IF condition  BEGIN elseIfBody=statementBody* END)*
    (ELSE BEGIN elseBody=statementBody* END)?
    ;
repeatStatement:
    REPEAT (numberVal=numberValue) TIMES (BEGIN | THEN) statementBody* END
    ;
repeatUntilStatement:
    REPEAT_UNTIL condition (BEGIN | THEN) statementBody* END
    ;
whileStatement:
    WHILE condition (DO | BEGIN) statementBody* END
    ;

statementBody:
    statement+
    | declaration+
    | initialization+
    | expression+
    | funcDec+
    ;

condition:
    ((var  conOp=conditionalOperation (val | var)) | (var) | (NOT var) )
    ((AND | OR)  (var conOp=conditionalOperation (val | var)) | (var) | (NOT var) )*                      #con1
    | var                                                                                                 #con2
    | NOT var                                                                                             #con3
    ;


expression:
      mathExp
    | funcCall
    | printExp
    | askExp
    | assignment
    | increment
    | decrement
    ;

returnExp:
    RETURN (returnVal=val | returnVar=var)
    ;

printExp:
    PRINT (TEXT_VAL | numberValue  | var ) ( (ADD (TEXT_VAL | numberValue  | var ))+ )?
    ;

askExp:
    ASK NUMBER askID=ID (TEXT_VAL | numberValue  | var) ( (ADD (TEXT_VAL | numberValue  | var ))+ )? #numberQuestion
    |ASK TEXT askID=ID (TEXT_VAL | numberValue  | var) ( (ADD (TEXT_VAL | numberValue  | var ))+ )?  #textQuestion
    ;


mathExp :
    assignID=var ASSIGN (numberValue | var)
        (mathOp1=mathematicalOperation1 (numberValue | var))+

    | assignID=var mathOp2=mathematicalOperation2 (numberValue | var)
    (mathOp1=mathematicalOperation1 (numberValue | var))*
    ;

textInit:
    (TEXT)? var1ID=ID ASSIGN (TEXT_VAL)
    ;

numberInit:
    (NUMBER)? var1ID=ID ASSIGN (numberVal=numberValue)
    ;

booleanInit:
    (BOOLEAN)? var1ID=ID ASSIGN (BOOL_LITERAL)
    ;

val:
    textVal=TEXT_VAL
    | numberVal=numberValue
    | boolVal=BOOL_LITERAL
    ;

numberValue:
    double=NUMBER_VAL_DOUBLE
    | int=NUMBER_VAL_INT
    ;
collectionDecl:
    COLLECTION collectionName=COLLECTION_ID LPAREN declaration (COMMA declaration)* RPAREN
    ;
collectionInstanceDecl:
    collectionName=COLLECTION_ID instanceName=ID
    ;
collectionInit:
      collectionInstance=ID GET field=ID ASSIGN BOOL_LITERAL                                   #collectionInitBool
    | collectionInstance=ID GET field=ID ASSIGN TEXT_VAL                                       #collectionInitText
    | collectionInstance=ID GET field=ID ASSIGN numberValue                                    #collectionInitNumber
    | collectionInstance=ID GET field=ID ASSIGN variable=var                                   #collectionInitVar
    | collectionName=COLLECTION_ID instanceName=ID ASSIGN (val | var) (COMMA  (val | var ))* #collectionInitAll
    ;
increment:
    ID INC
    ;
decrement:
    ID DEC
    ;
assignment:
    var1ID=ID ASSIGN var2ID=ID                                   #assignID
    | assignID=ID ASSIGN askID=ID GET ANSWER                     #assignAnswer
    | assignID=ID ASSIGN indexID=ID GET NUMBER_VAL_INT           #assignList
    | assignID=ID ASSIGN instance=ID GET field=ID                #assignCollection
    ;
var:
    ID
    | dotVariable
    ;

conditionalOperation:
             conOpLT=LT
			 | conOpGT=GT
			 | conOpEQ=EQUAL
			 | conOpNEQ=NOTEQUAL
			 | conOpLE=LE
			 | conOpGE=GE
			 ;

mathematicalOperation1:
			 | mathOpADD=ADD
			 | mathOpSUB=SUB
			 | mathOpMUL=MUL
			 | mathOpDIV=DIV
			 ;
mathematicalOperation2:
    		 | mathOpADD=ADD_ASSIGN
    	     | mathOpSUB=SUB_ASSIGN
    		 | mathOpMUL=MUL_ASSIGN
    	     | mathOpDIV=DIV_ASSIGN
    		 ;

dotVariable:
      askID=ID GET ANSWER
    | listID=ID GET (NUMBER_VAL_INT)
    | instanceName=ID GET field=ID
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
LIST : 'list';
COLLECTION : 'Collection';
QUESTION: 'question';

//operation keywords
PRINT : 'print';
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
ANSWER: 'answer';
GET: 'get';
RUN: 'run';
NOT: 'not';

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
GT : '>'| 'is greater than';
LT : '<'| 'is less than';
EQUAL : '==' | '?=' | 'equals';
LE : '<=' | 'is less or equal to' ;
GE : '>=' | 'is greater or equal to';
NOTEQUAL : '!=' | 'is not';
AND : '&&' | 'and';
OR : '||' | 'or';
INC : '++' | 'is increased by one' ;
DEC : '--' | 'is decreased by one' ;
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BOOL_LITERAL : 'true' | 'false';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';


// definition of letter and strings, based on JAVA v9
fragment
Letter
	:	[a-zA-Z_]
	;

fragment
LetterOrDigit
	:	[a-zA-Z0-9_]
	|	NUMBER_VAL_DOUBLE
	|   NUMBER_VAL_INT
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

NUMBER_VAL_INT: '-'?[0-9]+ ;
NUMBER_VAL_DOUBLE: '-'?('0'|[1-9][0-9]*)('.'[0-9]+)? ;


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

COLLECTION_ID :
    [A-Z] (LetterOrDigit)*
    ;

ID  : (Letter (LetterOrDigit)* )+
	;
