grammar Hello;

//Основан на грамматике pl0
//------------------------------------------------------------------------------
//GRAMMAR
//------------------------------------------------------------------------------
programm    :     block '.';

block       :     ((consts? vars?) | (vars? consts?)) procedure* statement ';'?;

procedure   :     PROCEDURE IDENT ';' block;
vars        :     VAR IDENT ('=' (INTEGER | FLOAT | BOOL | STRING))? (',' IDENT ('=' (INTEGER | FLOAT | BOOL | STRING))?)* ';';
consts      :     CONST IDENT '=' (INTEGER | FLOAT | BOOL | STRING) (',' IDENT '=' (INTEGER | FLOAT | BOOL | STRING))* ';';

statement   :     region | call | assign | while_ | if_ | print | break_ | continue_;

region      :     BEGIN statement  (';' statement)* ';'? END;
call        :     CALL IDENT;
assign      :     IDENT ASSIGN expr;
while_      :     WHILE condition DO statement;
if_         :     IF condition THEN statement;
print       :     PRINT '(' expr (',' expr)* ')';
break_      :     BREAK;
continue_   :     CONTINUE;


condition   :     term_cond
                  | '(' condition ')'
                  | DENIAL condition
                  | condition AND term_cond;

term_cond   :     factor_cond
                  | DENIAL term_cond
                  | '(' term_cond ')'
                  | term_cond OR factor_cond;

factor_cond :     '(' expr COMPARE expr ')'
                  | '(' expr ')'
                  | DENIAL factor_cond;

expr        :     term
                  | expr ('+' | '-') term
                  | BOOL
                  | STRING;
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
ASSIGN      :     ':=';
DENIAL      :     '!';
COMPARE     :     '==' | '>=' | '<='  | '>' | '<' | '!=';
CALL        :     'CALL';
CONST       :     'CONST';
PRINT       :     'PRINT';
BREAK       :     'BREAK';
CONTINUE    :     'CONTINUE';
AND         :     'AND';
OR          :     'OR';


BOOL        :     'true' | 'false';
IDENT       :     LETTERS(LETTERS|NUMBER)*;
ERROR_IDENT :     NUMBER(LETTERS)(LETTERS|NUMBER)*; // должна быть обработка ошибки
FLOAT       :     '-'? NUMBER'.'NUMBER;
INTEGER     :     '-'? NUMBER;
STRING      :     '"' ~["\r]* '"';
NUMBER      :     [0-9]+;
LETTERS     :     [A-Za-z]+;
MANY_COMMENT:     '/*' .*? '*/' -> skip; // многострочный комментарий
LINE_COMMENT:     '//' ~[\n\r]* -> skip; // однострочный комментарий
WS          :     [ \n\t\r]+ -> skip;
