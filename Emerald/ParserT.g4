grammar ParserT;
import LexerT;

program: BEGIN
 	statement*
END;

//linea de codigo
statement: var_declaracion | var_asignacion | println | repetir | para | control | sin | cos | suma
| scan;

//condiciones ciclos
var: NOMBRE | BOOLEAN | NUMERO;
cons: NOMBRE | BOOLEAN | NUMERO;
type: INT | STRING | BOOL;
operadores: OP_SUM|OP_MOD|OP_SUM|OP_RES|OP_MUL|OP_DIV|OP_ASI;
comparadores: OP_MAY|OP_MEN|OP_MAYI|OP_MENI|OP_IGU|OP_DIS;
condicion: var comparadores* var;
paso: var OP_SUM OP_SUM | var OP_RES OP_RES;

//asignaciones
var_asignacion : NOMBRE OP_ASI var PUNTOCOMA?;
var_declaracion : type NOMBRE PUNTOCOMA;
cons_declaration : CONST type NOMBRE OP_ASI var PUNTOCOMA;

//escribir y leer
println: PRINTLN PARENTHESIS_OPEN var PARENTHESIS_CLOSE PUNTOCOMA;
scan: SCAN PARENTHESIS_OPEN var PARENTHESIS_CLOSE PUNTOCOMA; 

//ciclos
repetir: WHILE PARENTHESIS_OPEN condicion* PARENTHESIS_CLOSE BRACKET_OPEN 
		statement* BRACKET_CLOSE;

para: FOR PARENTHESIS_OPEN var_asignacion PUNTOCOMA condicion PUNTOCOMA paso PARENTHESIS_CLOSE 
BRACKET_OPEN 
statement* 
BRACKET_CLOSE;

suma: SUMA PARENTHESIS_OPEN NUMERO COMA NUMERO PARENTHESIS_CLOSE PUNTOCOMA;

sin: SIN PARENTHESIS_OPEN NUMERO PARENTHESIS_CLOSE PUNTOCOMA;

cos: COS PARENTHESIS_OPEN NUMERO PARENTHESIS_CLOSE PUNTOCOMA;

//estructuras de control
control: IF PARENTHESIS_OPEN condicion PARENTHESIS_CLOSE BRACKET_OPEN statement* BRACKET_CLOSE;