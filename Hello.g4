grammar Hello;

//Бедняцкий И.С. ИСБ-117
//Основан на грамматике pl0
//------------------------------------------------------------------------------
//GRAMMAR
//------------------------------------------------------------------------------
programm    :     block '.';

block       :     ((consts? vars?) | (vars? consts?)) procedure* statement ';'?;

procedure   :     PROCEDURE IDENT ';' block;
vars        :     VAR IDENT (',' IDENT)* ';';
consts      :     CONST IDENT '=' (INTEGER | FLOAT) (',' IDENT '=' (INTEGER | FLOAT))* ';';

statement   :     region | call | assign | while_ | if_ | print;

region      :     BEGIN statement  (';' statement)* ';'? END;
call        :     CALL IDENT;
assign      :     IDENT ASSIGN expr;
while_      :     WHILE condition DO statement;
if_         :     IF condition THEN statement;
print       :     PRINT '(' expr ')';                       //Вместо WRITE sq (как в pl0)
                                                            //PRINT (sq)

condition   :     expr COMPARE expr
                  | '(' condition ')';

expr        :     term
                  | expr ('+' | '-') term;
term        :     factor
                  | term ('/' | '*') factor;
factor      :     IDENT | INTEGER | FLOAT | '(' expr ')';

//------------------------------------------------------------------------------
//LEXER
//------------------------------------------------------------------------------


BEGIN       :     'BEGIN';
END         :     'END';
VAR         :     'VAR';
PROCEDURE   :     'PROCEDURE';
WHILE       :     'WHILE';
DO          :     'DO';
IF          :     'IF';
THEN        :     'THEN';
ASSIGN      :     ':=';                                     //Знак присвоения
COMPARE     :     '==' | '>=' | '<='  | '>' | '<' | '!=';   //Знаки сравнения
CALL        :     'CALL';
CONST       :     'CONST';
PRINT       :     'PRINT';

IDENT       :     LETTERS(LETTERS|NUMBER)*;
ERROR_IDENT :     NUMBER(LETTERS)(LETTERS|NUMBER)*; // должна быть обработка ошибки
FLOAT       :     '-'? NUMBER'.'NUMBER;
INTEGER     :     '-'? NUMBER;
NUMBER      :     [0-9]+;
LETTERS     :     [A-Za-z]+;
MANY_COMMENT:     '/*' .*? '*/' -> skip; // многострочный комментарий
LINE_COMMENT:     '//' ~[\n\r]* -> skip; // однострочный комментарий
WS          :     [ \n\t\r]+ -> skip;

//Принимает ключевые слова только в верхнем регистре
//Далее написаны адаптированные примеры antlr/grammars pl0 для текущего парсера
/* Example 1
VAR x, squ;

PROCEDURE square;
BEGIN
   squ:= x * x;
END;

BEGIN //Основной блок
   x := 1;
   WHILE x <= 10 DO
   BEGIN
      CALL square;
      x := x + 1;
   END
END.
*/

/* Example 2
CONST max = 100;
VAR arg, ret;

PROCEDURE isprime;
VAR i;
BEGIN
	ret := 1;
	i := 2;
	WHILE i < arg DO
	BEGIN
		IF arg / i * i == arg THEN
		BEGIN
			ret := 0;
			i := arg;
		END;
		i := i + 1
	END;
END;

PROCEDURE primes;
BEGIN
	arg := 2;
	WHILE arg < max DO
	BEGIN
		CALL isprime;
		IF ret == 1 THEN PRINT (arg);
		arg := arg + 1;
	END;
END;

CALL primes
.
*/
