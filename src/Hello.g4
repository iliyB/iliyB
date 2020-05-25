grammar Hello;

programm    :      block '.';

block       :      vars? procedure* statement ';'?;

procedure   :      PROCEDURE IDENT ';' block;
vars        :      vars var
            |      var var
            |      var;

var         :      VAR (declare_bool | declare_int | declare_float | declare_string) (',' (declare_bool | declare_int | declare_float | declare_string))*  ';';

statement   :      region | call | assign | while_ | if_ | print | break_ | continue_;

region      :      BEGIN statement  (';' statement)* ';'? END;
call        :      CALL IDENT;
assign      :      IDENT ASSIGN expr;
while_      :      WHILE condition DO statement;
if_         :      IF condition THEN statement;
print       :      PRINT '(' expr ')'#print_expr
            |      PRINT '(' STRING ')' #print_string;
break_      :      BREAK;
continue_   :      CONTINUE;

condition   :      term_cond #condition_term
            |      DENIAL condition #condition_denial
            |      condition AND term_cond #condition_and;

term_cond   :      factor_cond  #term_cond_factor
            |      DENIAL term_cond #term_cond_denial
            |      term_cond OR factor_cond #term_cond_or;

factor_cond :      '(' expr op = COMPARE expr ')' #factor_cond_compare
            |      '(' expr ')' #factor_cond_expr
            |      '(' condition ')' #factor_condition
            |      '(' term_cond ')' #factor_cond_term
            |       DENIAL factor_cond #factor_cond_denial;

declare_string:    DECLARE_STRING IDENT '=' STRING;

declare_bool:      DECLARE_BOOLEAN IDENT '=' BOOL #declare_bool_with_value
            |      DECLARE_BOOLEAN IDENT #declare_bool_without_value;

declare_float:     DECLARE_FLOAT IDENT '=' FLOAT #declare_float_with_value
            |      DECLARE_FLOAT IDENT #declare_float_without_value;

declare_int :      DECLARE_INT IDENT '=' INTEGER #declare_int_with_value
            |      DECLARE_INT IDENT #declare_int_without_value;

expr        :      term #expr_term
            |      expr op = ('+' | '-') term #expr_op
            |      BOOL #expr_bool;

term        :      factor #term_factor
            |      term op = ('/' | '*') factor #term_op;

factor      :      IDENT #factor_ident
            |      INTEGER #factor_integer
            |      FLOAT #factor_float
            |      '(' expr ')' #factor_expr;

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

DECLARE_INT :      'int';
DECLARE_FLOAT:     'double';
DECLARE_BOOLEAN:   'boolean';
DECLARE_STRING:    'string';

BOOL        :     'true' | 'false';
IDENT       :     LETTERS(LETTERS|NUMBER)*;
ERROR_IDENT :     NUMBER(LETTERS)(LETTERS|NUMBER)*; // должна быть обработка ошибки
FLOAT       :     MINUS? NUMBER'.'NUMBER;
INTEGER     :     MINUS? NUMBER;
MINUS       :     '-';
STRING      :     '"' ~["\r]* '"';
NUMBER      :     [0-9]+;
LETTERS     :     [A-Za-z]+;
MANY_COMMENT:     '/*' .*? '*/' -> skip; // многострочный комментарий
LINE_COMMENT:     '//' ~[\n\r]* -> skip; // однострочный комментарий
WS          :     [ \n\t\r]+ -> skip;