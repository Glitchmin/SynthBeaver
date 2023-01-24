grammar SynthBeaver;
start : instructions EOF;

instructions : instruction+;

instruction : statement | functionDef ;

statement : noSemiStatement ';'?;

noSemiStatement : definition | control | expression | play ;

definition : mutability name ':' type '=' expression;

mutability: 'val' | 'var';

control : for | while | if;

while : 'while' '(' condition ')' body ;

for   : 'for' '(' init=noSemiStatement? ';' condition ';' looping=expression ')' body ;

if : 'if' '(' condition ')' ifBody=body ('else' elseBody=body)?;

block :  '{' instructions? '}' ;

body : block | instruction;

expression : function | lhs=expression operator rhs=expression | name | literal;

operator: '=' | OP ;

function : name '(' arguments ')';

literal : number | lambda | boolLiteral;

boolLiteral : 'true' | 'false';

lambda : name '->' (expression | block);

arguments : expression (',' expression)*;

//todo
play : '!!!' arguments '!!!';

functionDef : 'def' name '(' argumentsDef ')' '->' type body;

argumentsDef : argumentDef (',' argumentDef)*;

argumentDef : mutability name ':' type;

name : ID;

type : ID;

number: NUMBER ;

condition : expression;


NUMBER : [0-9]+'.'?[0-9]*;
ID : [a-zA-Z][a-zA-Z.0-9_]*;
OP : [-+/*^<>=][=]? ;
WS: [ \t\r\n]+ -> skip;
Semi
   : (';' | ([\r\n])+) -> skip
   ;
LINE_COMMENT
   :   '//' (~[\r\n])* -> skip
   ;
COMMENT
  :   '/*' (COMMENT | .)* '*/' -> skip
  ;