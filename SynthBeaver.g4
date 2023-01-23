grammar SynthBeaver;
start : instructions EOF;

instructions : instruction+;

instruction : (definition | control | expression | play) ';'?;

control : 'for' '(' expression ';' condition ';' expression ')' body
| 'while' '(' condition ')' body
| justIf;

definition : mutability name ':' type '=' expression;

mutability: 'val' | 'var';

justIf : 'if' '(' condition ')' body
| 'if' '(' condition ')' body 'else' body;

body : '{' instructions '}' | instruction;

expression : function | expression operator expression | name | literal;

operator: '=' | OP ;

function : name '(' arguments ')';

literal : NUMBER | lambda;

lambda : name '->' body;

arguments : argument (',' argument)*;

argument : expression;

play : '!!!' arguments '!!!';

functionDef : 'def' name '(' argumentsDef ')' '->' type body;

argumentsDef : argumentDef (',' argumentDef)*;

argumentDef : name ':' type;

name : ID;

type : ID;

condition : EXPRESSION;



NUMBER : [0-9]+;
ID : [a-zA-Z.]+;
OP : [-+/*^<>=][=]? ;
EXPRESSION : [a-zA-Z0-9]+;
WS: [ \t\r\n]+ -> skip;
ANYTHING: .+?;
LINE_COMMENT
   :   '//' (~[\r\n])* -> skip
   ;
COMMENT
  :   '/*' (COMMENT | .)* '*/' -> skip
  ;
//GARBAGE: ~[\r\n]+;