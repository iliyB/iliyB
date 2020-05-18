

public class Value {
    public String TYPE;
    public boolean CONST = false;
    public boolean defined = false;

    public String STRING;
    public boolean BOOL;
    public int INTEGER;
    public float FLOAT;


    public boolean isDefined()
    {
        return this.defined;
    }

    public void setConst()
    {
        this.CONST = true;
    }

    public boolean isConst() {
        return this.CONST;
    }

    public String isType() {
        return this.TYPE;
    }


    public void set(boolean BOOL)
    {
        this.TYPE = "BOOL";
        this.BOOL = BOOL;
        if (!this.defined)  this.defined = true;
    }

    public void set(String STRING)
    {
        this.TYPE = "STRING";
        this.STRING = STRING;
        if (!this.defined)  this.defined = true;
    }

    public void set(int INTEGER)
    {
        this.TYPE = "INTEGER";
        this.INTEGER = INTEGER;
        if (!this.defined)  this.defined = true;
    }

    public void set(float FLOAT)
    {
        this.TYPE = "FLOAT";
        this.FLOAT = FLOAT;
        if (!this.defined)  this.defined = true;
    }


}
