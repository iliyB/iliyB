public class Utils {

    public boolean CheckType(Value t, Value s)
    {
        String type_t = t.isType();
        String type_s = s.isType();
        if (type_s.equals(type_t))
        {
            return true;
        }
        else if ((type_s.equals("INTEGER") || type_s.equals("BOOL")) && (type_t.equals("INTEGER") || type_t.equals("BOOL")))
        {
            return  true;
        }
        else return false;
    }

    public boolean CheckMultDiv(Value t)
    {
        if ((t.isType() == "BOOL") && (t.isType() == "STRING")) return false;
        else return true;
    }

    public Value Mult(Value t, Value s) {
        String type_t = t.isType();
        String type_s = s.isType();
        Value value = new Value();
        if (type_t.equals("INTEGER") && type_s.equals("INTEGER")) value.set(t.INTEGER * s.INTEGER);
        else if (type_t.equals("INTEGER") && type_s.equals("FLOAT")) value.set(t.INTEGER * s.FLOAT);
        else if (type_t.equals("FLOAT") && type_s.equals("INTEGER")) value.set(t.FLOAT * s.INTEGER);
        else value.set(t.FLOAT * s.FLOAT);
        return value;
    }

    public Value Div(Value t, Value s) {
        String type_t = t.isType();
        String type_s = s.isType();
        Value value = new Value();
        if (type_t.equals("INTEGER") && type_s.equals("INTEGER")) value.set(t.INTEGER / s.INTEGER);
        else if (type_t.equals("INTEGER") && type_s.equals("FLOAT")) value.set(t.INTEGER / s.FLOAT);
        else if (type_t.equals("FLOAT") && type_s.equals("INTEGER")) value.set(t.FLOAT / s.INTEGER);
        else value.set(t.FLOAT / s.FLOAT);
        return value;
    }


    public Value Sum(Value s, Value t) {
        String type_t = t.isType();
        String type_s = s.isType();
        Value value = new Value();
        if (type_t.equals("BOOL"))
        {
            value.set(t.BOOL & s.BOOL);
        }
        else if (type_t.equals("STRING"))
        {
            value.set(t.STRING + s.STRING);
        }
        else
        {
            if (type_s.equals("INTEGER") && (type_t.equals("INTEGER"))) value.set(s.INTEGER + t.INTEGER);
            else if (type_s.equals("INTEGER") && (type_t.equals("FLOAT"))) value.set(s.INTEGER + t.FLOAT);
            else if (type_s.equals("FLOAT") && (type_t.equals("FLOAT"))) value.set(s.FLOAT + t.FLOAT);
            else value.set(s.FLOAT + s.INTEGER);
        }
        return value;
    }

    public Value Sub(Value s, Value t) {
        String type_t = t.isType();
        String type_s = s.isType();
        Value value = new Value();
        if (type_t.equals("BOOL"))
        {
            value.set(t.BOOL & s.BOOL);
        }
        else if (type_t.equals("STRING"))
        {
            value.set(t.STRING + s.STRING);
        }
        else
        {
            if (type_s.equals("INTEGER") && (type_t.equals("INTEGER"))) value.set(s.INTEGER - t.INTEGER);
            else if (type_s.equals("INTEGER") && (type_t.equals("FLOAT"))) value.set(s.INTEGER - t.FLOAT);
            else if (type_s.equals("FLOAT") && (type_t.equals("FLOAT"))) value.set(s.FLOAT - t.FLOAT);
            else value.set(s.FLOAT - s.INTEGER);
        }
        return value;
    }
}
