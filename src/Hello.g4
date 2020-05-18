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


condition   returns[Value value]:
                    t=term_cond {
                       $value = $t.value;
                    }
                  | '(' s=condition ')' {
                       $value = $s.value;
                  }
                  | DENIAL condition {
                        //??????
                  }
                  | condition AND term_cond {
                        //??????
                  };

term_cond   returns[Value value]:
                    f=factor_cond {
                        $value = $f.value;
                    }
                  | DENIAL s=term_cond {
                         //отрицание value?????
                  }
                  | '(' s=term_cond ')' {
                         $value = $s.value;
                  }
                  | s=term_cond OR f=factor_cond {
                         //??????????
                  };

factor_cond returns[Value value]:
                  '(' s1=expr COMPARE s2=expr ')' {
                        //проверка COMPARE
                        //проверка типов
                        //действие
                  }
                  | '(' s=expr ')' {
                        $value = $s.value;
                  }
                  | DENIAL f=factor_cond {
                        //отрицание value?????
                  };

expr        returns[Value value]:
                    s=term {
                        $value = $s.value;
                    }
                  | t=expr '+' s=term {
                        if (CheckType($t,$s))
                        {
                            $value = Sum($t,$s);
                        }
                        else
                        {
                            //исключение
                        }
                  }
                  | t=expr '-' s=term {
                        if (CheckType($t,$s))
                        {
                            $value = Sub($t,$s);
                        }
                        else
                        {
                            //исключение
                        }
                  }
                  | y=BOOL {
                        $value.set($y.boolean);
                  }
                  | y=STRING {
                        $value.set($y.toString);
                  };
term        returns[Value value]:
                    s=factor {
                        $value = $s.value;
                    }
                  | t=term '*' s=factor {
                        if (CheckType($t,$s))
                        {
                            if (CheckMultDiv($t))
                            {
                                $value = Mult($t,$s);
                            }
                            else
                            {
                                //исключение
                            }
                        }
                        else
                        {
                            //исключение
                        }
                  }
                  | t=term '/' s=factor {
                        if (CheckType($t,$s))
                        {
                            if (CheckMultDiv($t))
                            {
                                $value = Mult($t,$s);
                            }
                            else
                            {
                                //исключение
                            }
                        }
                        else
                        {
                            //исключение
                        }
                  };
factor      returns[Value value]:
                  s=IDENT   #factorIdent
                  | s=INTEGER {
                        $value.set($s.int);
                  }         #factor_
                  | s=FLOAT   {
                        //$value.set($s.float);
                  }         #factor_
                  | '(' s=expr ')' {
                        //$value = $s.value;
                  }        #factor_;


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
WS          :     [ \n\t\r]+ -> channel (HIDDEN);
