//Пример кода языка

CONST max = 100, db = true;
VAR x, y, b;

PROCEDURE proc1;
VAR i;
BEGIN
	i := 4;
	x := 20;
	WHILE i < x DO
	BEGIN
		IF max / i * i == max THEN
			BEGIN
				x := x - 1;
			END;
		i := i + 1;
	END;
	PRINT (i, x);
END;

BEGIN
	b := false;
	y := 2;
	x := 2;
	WHILE !(y != x) DO
	BEGIN
		y := y + 1;
		IF x == 2 THEN
			BEGIN
				x := y + 1;
			END;
	END;
	IF y != x THEN
		BEGIN
		b := true;
		END;
	IF b THEN
		BEGIN
		CALL proc1;
		IF (b == db) THEN
			BEGIN
				x := y;
			END;
		END;
END.
