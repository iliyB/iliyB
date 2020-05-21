public class Utils {
    private static String Int = "INTEGER";
    private static String Flo = "FLOAT";

    public static boolean CheckType(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        if ((type1.equals(Int) || type1.equals(Flo)) && (type2.equals(Int) || type2.equals(Flo))) {
            return true;
        } else return false;
    }

    public static Value Div(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) / Integer.parseInt(v2.toString()), false);
        } else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) / Float.parseFloat(v2.toString()), false);
        } else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) / Float.parseFloat(v2.toString()), false);
        } else
            value = value = new Value("", Flo, Float.parseFloat(v1.toString()) / Integer.parseInt(v2.toString()), false);

        return value;
    }

    public static Value Mult(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) * Integer.parseInt(v2.toString()), false);
        } else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) * Float.parseFloat(v2.toString()), false);
        } else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) * Float.parseFloat(v2.toString()), false);
        } else
            value = value = new Value("", Flo, Float.parseFloat(v1.toString()) * Integer.parseInt(v2.toString()), false);

        return value;
    }

    public static Value Sub(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) - Integer.parseInt(v2.toString()), false);
        } else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) - Float.parseFloat(v2.toString()), false);
        } else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) - Float.parseFloat(v2.toString()), false);
        } else
            value = value = new Value("", Flo, Float.parseFloat(v1.toString()) - Integer.parseInt(v2.toString()), false);

        return value;
    }

    public static Value Sum(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) + Integer.parseInt(v2.toString()), false);
        } else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) + Float.parseFloat(v2.toString()), false);
        } else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) + Float.parseFloat(v2.toString()), false);
        } else
            value = value = new Value("", Flo, Float.parseFloat(v1.toString()) + Integer.parseInt(v2.toString()), false);

        return value;
    }
}
