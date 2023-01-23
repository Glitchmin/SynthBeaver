grammar SynthBeaver;


definition : 'var' name ':' type '=' NUMBER;

name : ID;

type : ID;

NUMBER : [0-9]+;
ID : [a-zA-Z]+;
OP : [-+/*] ;
WS: [ \t\r\n]+ -> skip;