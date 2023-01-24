grammar SynthBeaver;
start : instructions EOF;

instructions : instruction+;

instruction : (definition | control | expression | play) ';'?;

control : 'for' '(' expression ';' condition ';' expression ')' body
        | 'while' '(' condition ')' body
        | if;

definition : mutability name ':' type '=' expression;

mutability: 'val' | 'var';

if : 'if' '(' condition ')' body
   | 'if' '(' condition ')' body 'else' body;

block :  '{' instructions? '}' ;

body : block | instruction;

expression : function | expression operator expression | name | literal;

operator: '=' | OP ;

function : name '(' arguments ')';

literal : NUMBER | lambda | boolLiteral;

boolLiteral : 'true' | 'false';

lambda : name '->' (expression | block);

arguments : argument (',' argument)*;

argument : expression;

play : '!!!' arguments '!!!';

functionDef : 'def' name '(' argumentsDef ')' '->' type body;

argumentsDef : argumentDef (',' argumentDef)*;

argumentDef : name ':' type;

name : ID;

type : ID;

condition : expression;



NUMBER : [0-9]+;
ID : [a-zA-Z.]+;
OP : [-+/*^<>=][=]? ;
WS: [ \t\r\n]+ -> skip;
ANYTHING: .+?;
LINE_COMMENT
   :   '//' (~[\r\n])* -> skip
   ;

Semi
   : (';' | ([\r\n])+) -> skip
   ;
COMMENT
  :   '/*' (COMMENT | .)* '*/' -> skip
  ;
//GARBAGE: ~[\r\n]+;