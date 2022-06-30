lexer grammar LexerT;

BEGIN: '<Emerald>';
END: '</Emerald>';

VAR: 'var';
CONS: 'cons';

IF: 'if';
WHILE: 'while';
FOR: 'for';

//some v
SCAN: 'scan';
PRINTLN: 'println';

//math functions
SUMA: 'suma';
SIN: 'sin';
COS: 'cos';

//operators
OP_MOD: '%';
OP_SUM: '+';
OP_RES: '-';
OP_MUL: '*';
OP_DIV: '/';
OP_MAY: '>';
OP_MEN: '<';
OP_MAYI: '>=';
OP_MENI: '<=';
OP_IGU: '==';
OP_DIS: '!=';
OP_ASI: '=';


//TIPOS DE DATOS
INT: 'int';
STRING: 'String';
BOOL: 'bool';
CONST: 'const';

//BRACKETs
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';

//AND and or
AND: '&&';
OR: '||';
NOT: '!';

NOMBRE: [a-zA-Z_][a-zA-Z0-9_]*;           // match lower-case identifiers
NUMERO: [0-9]+;
BOOLEAN: 'true' | 'false';
PUNTOCOMA: ';';
COMA: ',';
WS:[ \t\r\n]+ -> skip;
