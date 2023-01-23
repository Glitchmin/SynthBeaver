grammar SynthBeaver;
start : instructions EOF;

instructions : instruction instructions?;

instruction : ((definition | control | expression | play)? (';' | '\r'? '\n')) | comment;

comment: '/*' ANYTHING '*/' ;

control : 'for' '(' expression ';' condition ';' expression ')' body
| 'while' '(' condition ')' body
| justIf;

definition : mutability name ':' type '=' expression;

mutability: 'val' | 'var';

justIf : 'if' '(' condition ')' body
| 'if' '(' condition ')' body 'else' body;

body : '{' instructions '}' | instruction;

expression : function | expression OP expression | name | literal;

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
OP : [-+/*^=<>][=]? ;
EXPRESSION : [a-zA-Z0-9]+;
WS: [ \t]+ -> skip;
ANYTHING: .+?;
//GARBAGE: ~[\r\n]+;