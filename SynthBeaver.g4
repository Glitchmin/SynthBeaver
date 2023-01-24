grammar SynthBeaver;
start : instructions EOF;

instructions : instruction+;

instruction : (definition | control | expression | play) ';'?;

definition : mutability name ':' type '=' expression;

mutability: 'val' | 'var';

control : for | while | if;

while : 'while' '(' condition ')' body ;

for   : 'for' '(' init=instruction? condition ';' looping=expression ')' body ;

if : 'if' '(' condition ')' body ('else' elseBody=body)?; //todo

block :  '{' instructions? '}' ;

body : block | instruction;

expression : function | lhs=expression operator rhs=expression | name | literal;

operator: '=' | OP ;

function : name '(' arguments ')';

literal : number | lambda | boolLiteral;

boolLiteral : 'true' | 'false';

//todo
lambda : name '->' (expression | block);

arguments : expression (',' expression)*;

//todo
play : '!!!' arguments '!!!';

//todo
functionDef : 'def' name '(' argumentsDef ')' '->' type body;

//todo
argumentsDef : argumentDef (',' argumentDef)*;

//todo
argumentDef : name ':' type;

name : ID;

type : ID;

number: NUMBER ;

condition : expression;


NUMBER : [0-9]+;
ID : [a-zA-Z.]+;
OP : [-+/*^<>=][=]? ;
WS: [ \t\r\n]+ -> skip;
ANYTHING: .+?;
Semi
   : (';' | ([\r\n])+) -> skip
   ;
LINE_COMMENT
   :   '//' (~[\r\n])* -> skip
   ;
COMMENT
  :   '/*' (COMMENT | .)* '*/' -> skip
  ;