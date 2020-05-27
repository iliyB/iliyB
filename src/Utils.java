public class Utils {
    private static String Int = "INTEGER";
    private static String Flo = "FLOAT";
    public static String Bool = "BOOLEAN";
    private static String str = "STRING";

    public static boolean CheckType(Value v1, Value v2) throws  Exception {
        String type1 = v1.getType();
        String type2 = v2.getType();
        if ((type1.equals(Int) || type1.equals(Flo)) && (type2.equals(Int) || type2.equals(Flo))) {
            return true;
        } else {
            throw new Exception(v1.getValue().toString() + " and " + v2.getValue().toString() + " of different types");
        }
    }

    public static boolean CheckTypeAll(Value v1, Value v2) throws Exception {
        String type1 = v1.getType();
        String type2 = v2.getType();
        if (type1.equals(type2)) {
            return true;
        }
        else if ((type1.equals(Int) || type1.equals(Flo)) && (type2.equals(Int) || type2.equals(Flo))) {
            return true;
        } else {
            throw new Exception(v1.getValue().toString() + " and " + v2.getValue().toString() + " of different types");
        }
    }

    public static Value Compare(String op, Value left, Value right) throws Exception {
        String type_left = left.getType();
        String type_right = right.getType();
        Value value;
        switch (op) {
            case "==":
                if (type_left.equals(Bool)) {
                    value = new Value("", Bool, (Boolean.parseBoolean(left.getValue().toString()) == Boolean.parseBoolean(right.getValue().toString())));
                    if (left.checkRef() && right.checkRef()) {
                        value.setRef(GenerateLLVM.eq(left.getRef(), right.getRef(), Bool));
                    }
                    else if (left.checkRef()) {
                        value.setRef(GenerateLLVM.eq(left.getRef(), right.getValue().toString(), Bool));
                    }
                    else if (right.checkRef()) {
                        value.setRef(GenerateLLVM.eq(left.getValue().toString(), right.getRef(), Bool));
                    }
                    else {
                        value.setRef(GenerateLLVM.eq(left.getValue().toString(), right.getValue().toString(), Bool));
                    }
                }
                else {
                    value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) == Float.parseFloat(right.getValue().toString())));
                    if ((type_left.equals(Int)) && (type_right.equals(Int))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.eq(left.getRef(), right.getRef(), Int));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.eq(left.getRef(), right.getValue().toString(), Int));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.eq(left.getValue().toString(), right.getRef(), Int));
                        }
                        else {
                            value.setRef(GenerateLLVM.eq(left.getValue().toString(), right.getValue().toString(), Int));
                        }
                    }
                    else if ((type_left.equals(Int)) && (type_right.equals(Flo))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.eq(ref, right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.eq(ref, right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.eq(left.getValue().toString() + ".0", right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.eq(left.getValue().toString() + ".0", right.getValue().toString(), Flo));
                        }
                    }
                    else if ((type_left.equals(Flo)) && (type_right.equals(Flo))) { ;
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.eq(left.getRef(), right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.eq(left.getRef(), right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.eq(left.getValue().toString(), right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.eq(left.getValue().toString(), right.getValue().toString(), Flo));
                        }
                    }
                    else {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.eq(left.getRef(), ref, Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.eq(left.getRef(), right.getValue().toString() + ".0", Flo));
                        }
                        else if (right.checkRef()) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.eq(left.getValue().toString(), ref, Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.eq(left.getValue().toString(), right.getValue().toString() + ".0", Flo));
                        }
                    }
                }
                break;
            case "!=":
                if (type_left.equals(Bool)) {
                    value = new Value("", Bool, (Boolean.parseBoolean(left.getValue().toString()) != Boolean.parseBoolean(right.getValue().toString())));
                    if (left.checkRef() && right.checkRef()) {
                        value.setRef(GenerateLLVM.no_eq(left.getRef(), right.getRef(), Bool));
                    }
                    else if (left.checkRef()) {
                        value.setRef(GenerateLLVM.no_eq(left.getRef(), right.getValue().toString(), Bool));
                    }
                    else if (right.checkRef()) {
                        value.setRef(GenerateLLVM.no_eq(left.getValue().toString(), right.getRef(), Bool));
                    }
                    else {
                        value.setRef(GenerateLLVM.no_eq(left.getValue().toString(), right.getValue().toString(), Bool));
                    }
                }
                else {
                    value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) != Float.parseFloat(right.getValue().toString())));
                    if ((type_left.equals(Int)) && (type_right.equals(Int))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.no_eq(left.getRef(), right.getRef(), Int));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.no_eq(left.getRef(), right.getValue().toString(), Int));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.no_eq(left.getValue().toString(), right.getRef(), Int));
                        }
                        else {
                            value.setRef(GenerateLLVM.no_eq(left.getValue().toString(), right.getValue().toString(), Int));
                        }
                    }
                    else if ((type_left.equals(Int)) && (type_right.equals(Flo))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.no_eq(ref, right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.no_eq(ref, right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.no_eq(left.getValue().toString() + ".0", right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.no_eq(left.getValue().toString() + ".0", right.getValue().toString(), Flo));
                        }
                    }
                    else if ((type_left.equals(Flo)) && (type_right.equals(Flo))) { ;
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.no_eq(left.getRef(), right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.no_eq(left.getRef(), right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.no_eq(left.getValue().toString(), right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.no_eq(left.getValue().toString(), right.getValue().toString(), Flo));
                        }
                    }
                    else {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.no_eq(left.getRef(), ref, Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.no_eq(left.getRef(), right.getValue().toString() + ".0", Flo));
                        }
                        else if (right.checkRef()) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.no_eq(left.getValue().toString(), ref, Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.no_eq(left.getValue().toString(), right.getValue().toString() + ".0", Flo));
                        }
                    }
                }
                break;
            case ">=":
                if ((type_left.equals(Int)) || (type_left.equals(Flo))) {
                    value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) >= Float.parseFloat(right.getValue().toString())));
                    if ((type_left.equals(Int)) && (type_right.equals(Int))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.more_eq(left.getRef(), right.getRef(), Int));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.more_eq(left.getRef(), right.getValue().toString(), Int));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.more_eq(left.getValue().toString(), right.getRef(), Int));
                        }
                        else {
                            value.setRef(GenerateLLVM.more_eq(left.getValue().toString(), right.getValue().toString(), Int));
                        }
                    }
                    else if ((type_left.equals(Int)) && (type_right.equals(Flo))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.more_eq(ref, right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.more_eq(ref, right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.more_eq(left.getValue().toString() + ".0", right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.more_eq(left.getValue().toString() + ".0", right.getValue().toString(), Flo));
                        }
                    }
                    else if ((type_left.equals(Flo)) && (type_right.equals(Flo))) { ;
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.more_eq(left.getRef(), right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.more_eq(left.getRef(), right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.more_eq(left.getValue().toString(), right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.more_eq(left.getValue().toString(), right.getValue().toString(), Flo));
                        }
                    }
                    else {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.more_eq(left.getRef(), ref, Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.more_eq(left.getRef(), right.getValue().toString() + ".0", Flo));
                        }
                        else if (right.checkRef()) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.more_eq(left.getValue().toString(), ref, Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.more_eq(left.getValue().toString(), right.getValue().toString() + ".0", Flo));
                        }
                    }
                }
                else throw new Exception(">= can't accept bool and string types");
                break;
            case "<=":
                if ((type_left.equals(Int)) || (type_left.equals(Flo))) {
                    value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) <= Float.parseFloat(right.getValue().toString())));
                    if ((type_left.equals(Int)) && (type_right.equals(Int))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.less_eq(left.getRef(), right.getRef(), Int));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.less_eq(left.getRef(), right.getValue().toString(), Int));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.less_eq(left.getValue().toString(), right.getRef(), Int));
                        }
                        else {
                            value.setRef(GenerateLLVM.less_eq(left.getValue().toString(), right.getValue().toString(), Int));
                        }
                    }
                    else if ((type_left.equals(Int)) && (type_right.equals(Flo))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.less_eq(ref, right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.less_eq(ref, right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.less_eq(left.getValue().toString() + ".0", right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.less_eq(left.getValue().toString() + ".0", right.getValue().toString(), Flo));
                        }
                    }
                    else if ((type_left.equals(Flo)) && (type_right.equals(Flo))) { ;
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.less_eq(left.getRef(), right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.less_eq(left.getRef(), right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.less_eq(left.getValue().toString(), right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.less_eq(left.getValue().toString(), right.getValue().toString(), Flo));
                        }
                    }
                    else {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.less_eq(left.getRef(), ref, Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.less_eq(left.getRef(), right.getValue().toString() + ".0", Flo));
                        }
                        else if (right.checkRef()) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.less_eq(left.getValue().toString(), ref, Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.less_eq(left.getValue().toString(), right.getValue().toString() + ".0", Flo));
                        }
                    }
                }
                else throw new Exception("<= can't accept bool and string types");
                break;
            case ">":
                if ((type_left.equals(Int)) || (type_left.equals(Flo))) {
                    value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) > Float.parseFloat(right.getValue().toString())));
                    if ((type_left.equals(Int)) && (type_right.equals(Int))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.more(left.getRef(), right.getRef(), Int));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.more(left.getRef(), right.getValue().toString(), Int));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.more(left.getValue().toString(), right.getRef(), Int));
                        }
                        else {
                            value.setRef(GenerateLLVM.more(left.getValue().toString(), right.getValue().toString(), Int));
                        }
                    }
                    else if ((type_left.equals(Int)) && (type_right.equals(Flo))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.more(ref, right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.more(ref, right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.more(left.getValue().toString() + ".0", right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.more(left.getValue().toString() + ".0", right.getValue().toString(), Flo));
                        }
                    }
                    else if ((type_left.equals(Flo)) && (type_right.equals(Flo))) { ;
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.more(left.getRef(), right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.more(left.getRef(), right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.more(left.getValue().toString(), right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.more(left.getValue().toString(), right.getValue().toString(), Flo));
                        }
                    }
                    else {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.more(left.getRef(), ref, Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.more(left.getRef(), right.getValue().toString() + ".0", Flo));
                        }
                        else if (right.checkRef()) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.more(left.getValue().toString(), ref, Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.more(left.getValue().toString(), right.getValue().toString() + ".0", Flo));
                        }
                    }
                }
                else throw new Exception("> can't accept bool and string types");
                break;
            case "<":
                if ((type_left.equals(Int)) || (type_left.equals(Flo))) {
                    value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) < Float.parseFloat(right.getValue().toString())));
                    if ((type_left.equals(Int)) && (type_right.equals(Int))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.less(left.getRef(), right.getRef(), Int));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.less(left.getRef(), right.getValue().toString(), Int));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.less(left.getValue().toString(), right.getRef(), Int));
                        }
                        else {
                            value.setRef(GenerateLLVM.less(left.getValue().toString(), right.getValue().toString(), Int));
                        }
                    }
                    else if ((type_left.equals(Int)) && (type_right.equals(Flo))) {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.less(ref, right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            int ref = GenerateLLVM.translate_int_to_float(left.getRef());
                            value.setRef(GenerateLLVM.less(ref, right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.less(left.getValue().toString() + ".0", right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.less(left.getValue().toString() + ".0", right.getValue().toString(), Flo));
                        }
                    }
                    else if ((type_left.equals(Flo)) && (type_right.equals(Flo))) { ;
                        if ((left.checkRef()) && (right.checkRef())) {
                            value.setRef(GenerateLLVM.less(left.getRef(), right.getRef(), Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.less(left.getRef(), right.getValue().toString(), Flo));
                        }
                        else if (right.checkRef()) {
                            value.setRef(GenerateLLVM.less(left.getValue().toString(), right.getRef(), Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.less(left.getValue().toString(), right.getValue().toString(), Flo));
                        }
                    }
                    else {
                        if ((left.checkRef()) && (right.checkRef())) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.less(left.getRef(), ref, Flo));
                        }
                        else if (left.checkRef()){
                            value.setRef(GenerateLLVM.less(left.getRef(), right.getValue().toString() + ".0", Flo));
                        }
                        else if (right.checkRef()) {
                            int ref = GenerateLLVM.translate_int_to_float(right.getRef());
                            value.setRef(GenerateLLVM.less(left.getValue().toString(), ref, Flo));
                        }
                        else {
                            value.setRef(GenerateLLVM.less(left.getValue().toString(), right.getValue().toString() + ".0", Flo));
                        }
                    }
                }
                else throw new Exception("< can't accept bool and string types");
                break;
            default:
                throw new Exception("The op sign is not identified");
        }

        return value;
    }

    public static Value And(Value v1, Value v2) {
        Value value = new Value("", Utils.Bool, (Boolean.parseBoolean(v1.getValue().toString()) && Boolean.parseBoolean(v2.getValue().toString())));
        if ((v1.checkRef()) && (v2.checkRef())) {
            value.setRef(GenerateLLVM.and(v1.getRef(), v2.getRef()));
        }
        else if (v1.checkRef()) {
            value.setRef(GenerateLLVM.and(v1.getRef(), v2.getValue().toString()));
        }
        else if (v2.checkRef()) {
            value.setRef(GenerateLLVM.and(v1.getValue().toString(), v2.getRef()));
        }
        else {
            value.setRef(GenerateLLVM.and(v1.getValue().toString(), v2.getValue().toString()));
        }
        return value;
    }

    public static Value Or(Value v1, Value v2) {
        Value value = new Value("", Utils.Bool, (Boolean.parseBoolean(v1.getValue().toString()) || Boolean.parseBoolean(v2.getValue().toString())));
        if ((v1.checkRef()) && (v2.checkRef())) {
            value.setRef(GenerateLLVM.or(v1.getRef(), v2.getRef()));
        }
        else if (v1.checkRef()) {
            value.setRef(GenerateLLVM.or(v1.getRef(), v2.getValue().toString()));
        }
        else if (v2.checkRef()) {
            value.setRef(GenerateLLVM.or(v1.getValue().toString(), v2.getRef()));
        }
        else {
            value.setRef(GenerateLLVM.or(v1.getValue().toString(), v2.getValue().toString()));
        }
        return value;
    }

    public static Value Denial(Value value) {
        boolean val = Boolean.parseBoolean(value.getValue().toString());
        if (value.checkRef()) {
            value.setRef(GenerateLLVM.denial(value.getRef()));
        }
        else
        {
            value.setRef(GenerateLLVM.denial(value.getValue().toString()));
        }
        value.setValue(!val);
        return value;
    }

    public static Value Div(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) / Integer.parseInt(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                value.setRef(GenerateLLVM.div_int(v1.getRef(), v2.getRef()));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.div_int(v1.getRef(), v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.div_int(v1.getValue().toString(), v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.div_int(v1.getValue().toString(), v2.getValue().toString()));
            }
        }
        else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) / Float.parseFloat(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                int ref = GenerateLLVM.translate_int_to_float(v1.getRef());
                value.setRef(GenerateLLVM.div_double(ref, v2.getRef()));
            }
            else if (v1.checkRef()){
                int ref = GenerateLLVM.translate_int_to_float(v1.getRef());
                value.setRef(GenerateLLVM.div_double(ref, v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.div_double(v1.getValue().toString() + ".0", v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.div_double(v1.getValue().toString() + ".0", v2.getValue().toString()));
            }
        }
        else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) / Float.parseFloat(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                value.setRef(GenerateLLVM.div_double(v1.getRef(), v2.getRef()));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.div_double(v1.getRef(), v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.div_double(v1.getValue().toString(), v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.div_double(v1.getValue().toString(), v2.getValue().toString()));
            }
        }
        else {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) / Integer.parseInt(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                int ref = GenerateLLVM.translate_int_to_float(v2.getRef());
                value.setRef(GenerateLLVM.div_double(v1.getRef(), ref));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.div_double(v1.getRef(), v2.getValue().toString() + ".0"));
            }
            else if (v2.checkRef()) {
                int ref = GenerateLLVM.translate_int_to_float(v2.getRef());
                value.setRef(GenerateLLVM.div_double(v1.getValue().toString(), ref));
            }
            else {
                value.setRef(GenerateLLVM.div_double(v1.getValue().toString(), v2.getValue().toString() + ".0"));
            }
        }



        return value;
    }

    public static Value Mult(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) * Integer.parseInt(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                value.setRef(GenerateLLVM.mult_int(v1.getRef(), v2.getRef()));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.mult_int(v1.getRef(), v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.mult_int(v1.getValue().toString(), v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.mult_int(v1.getValue().toString(), v2.getValue().toString()));
            }
        }
        else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) * Float.parseFloat(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                int ref = GenerateLLVM.translate_int_to_float(v1.getRef());
                value.setRef(GenerateLLVM.mult_double(ref, v2.getRef()));
            }
            else if (v1.checkRef()){
                int ref = GenerateLLVM.translate_int_to_float(v1.getRef());
                value.setRef(GenerateLLVM.mult_double(ref, v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.mult_double(v1.getValue().toString() + ".0", v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.mult_double(v1.getValue().toString() + ".0", v2.getValue().toString()));
            }
        }
        else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) * Float.parseFloat(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                value.setRef(GenerateLLVM.mult_double(v1.getRef(), v2.getRef()));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.mult_double(v1.getRef(), v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.mult_double(v1.getValue().toString(), v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.mult_double(v1.getValue().toString(), v2.getValue().toString()));
            }
        }
        else {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) * Integer.parseInt(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                int ref = GenerateLLVM.translate_int_to_float(v2.getRef());
                value.setRef(GenerateLLVM.mult_double(v1.getRef(), ref));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.mult_double(v1.getRef(), v2.getValue().toString() + ".0"));
            }
            else if (v2.checkRef()) {
                int ref = GenerateLLVM.translate_int_to_float(v2.getRef());
                value.setRef(GenerateLLVM.mult_double(v1.getValue().toString(), ref));
            }
            else {
                value.setRef(GenerateLLVM.mult_double(v1.getValue().toString(), v2.getValue().toString() + ".0"));
            }
        }

        return value;
    }

    public static Value Sub(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) - Integer.parseInt(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                value.setRef(GenerateLLVM.sub_int(v1.getRef(), v2.getRef()));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.sub_int(v1.getRef(), v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.sub_int(v1.getValue().toString(), v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.sub_int(v1.getValue().toString(), v2.getValue().toString()));
            }
        }
        else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) - Float.parseFloat(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                int ref = GenerateLLVM.translate_int_to_float(v1.getRef());
                value.setRef(GenerateLLVM.sub_double(ref, v2.getRef()));
            }
            else if (v1.checkRef()){
                int ref = GenerateLLVM.translate_int_to_float(v1.getRef());
                value.setRef(GenerateLLVM.sub_double(ref, v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.sub_double(v1.getValue().toString() + ".0", v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.sub_double(v1.getValue().toString() + ".0", v2.getValue().toString()));
            }
        }
        else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) - Float.parseFloat(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                value.setRef(GenerateLLVM.sub_double(v1.getRef(), v2.getRef()));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.sub_double(v1.getRef(), v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.sub_double(v1.getValue().toString(), v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.sub_double(v1.getValue().toString(), v2.getValue().toString()));
            }
        }
        else {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) - Integer.parseInt(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                int ref = GenerateLLVM.translate_int_to_float(v2.getRef());
                value.setRef(GenerateLLVM.sub_double(v1.getRef(), ref));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.sub_double(v1.getRef(), v2.getValue().toString() + ".0"));
            }
            else if (v2.checkRef()) {
                int ref = GenerateLLVM.translate_int_to_float(v2.getRef());
                value.setRef(GenerateLLVM.sub_double(v1.getValue().toString(), ref));
            }
            else {
                value.setRef(GenerateLLVM.sub_double(v1.getValue().toString(), v2.getValue().toString() + ".0"));
            }
        }

        return value;
    }

    public static Value Sum(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) + Integer.parseInt(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                value.setRef(GenerateLLVM.sum_int(v1.getRef(), v2.getRef()));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.sum_int(v1.getRef(), v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.sum_int(v1.getValue().toString(), v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.sum_int(v1.getValue().toString(), v2.getValue().toString()));
            }
        }
        else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) + Float.parseFloat(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                int ref = GenerateLLVM.translate_int_to_float(v1.getRef());
                value.setRef(GenerateLLVM.sum_double(ref, v2.getRef()));
            }
            else if (v1.checkRef()){
                int ref = GenerateLLVM.translate_int_to_float(v1.getRef());
                value.setRef(GenerateLLVM.sum_double(ref, v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.sum_double(v1.getValue().toString() + ".0", v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.sum_double(v1.getValue().toString() + ".0", v2.getValue().toString()));
            }
        }
        else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) + Float.parseFloat(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                value.setRef(GenerateLLVM.sum_double(v1.getRef(), v2.getRef()));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.sum_double(v1.getRef(), v2.getValue().toString()));
            }
            else if (v2.checkRef()) {
                value.setRef(GenerateLLVM.sum_double(v1.getValue().toString(), v2.getRef()));
            }
            else {
                value.setRef(GenerateLLVM.sum_double(v1.getValue().toString(), v2.getValue().toString()));
            }
        }
        else {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) + Integer.parseInt(v2.toString()));
            if ((v1.checkRef()) && (v2.checkRef())) {
                int ref = GenerateLLVM.translate_int_to_float(v2.getRef());
                value.setRef(GenerateLLVM.sum_double(v1.getRef(), ref));
            }
            else if (v1.checkRef()){
                value.setRef(GenerateLLVM.sum_double(v1.getRef(), v2.getValue().toString() + ".0"));
            }
            else if (v2.checkRef()) {
                int ref = GenerateLLVM.translate_int_to_float(v2.getRef());
                value.setRef(GenerateLLVM.sum_double(v1.getValue().toString(), ref));
            }
            else {
                value.setRef(GenerateLLVM.sum_double(v1.getValue().toString(), v2.getValue().toString() + ".0"));
            }
        }

        return value;
    }

    public static void CheckBoolean(Value value) throws Exception {
        if (value.getType() != "BOOLEAN") {
            throw new Exception("The expression does not have the bool type");
        }
    }

    public static String removeChatAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
