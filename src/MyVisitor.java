import org.antlr.v4.runtime.CommonToken;

import java.util.HashMap;
import java.util.Stack;

public class MyVisitor  extends HelloBaseVisitor<Object> {
    //HashMap<String, Value> global_variables = new HashMap<>();
    HashMap<String, Value> current_variables = new HashMap<>();
    Stack <HashMap<String, Value>> stack_variables = new Stack<>();


    private static String removeChatAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    private Value getVariable(String variableName) throws Exception {
        if (current_variables.containsKey(variableName)) {
            return current_variables.get(variableName);
        }
        for (HashMap<String, Value> cv: stack_variables) {
            if (cv.containsKey(variableName)) {
                return cv.get(variableName);
            }
        }
        throw  new Exception("Variable" + variableName + "not identified");
    }

    @Override
    public Object visitBlock(HelloParser.BlockContext context) {
        boolean stack = false;
        if (!current_variables.isEmpty()) {
            stack_variables.push(current_variables);
            stack = true;
        }
        current_variables = new HashMap<>();
        visitChildren(context);
        if (stack) current_variables = stack_variables.pop();
        else current_variables.clear();
        return null;
    }

    @Override
    public Object visitConsts(HelloParser.ConstsContext context) {
        for (int i = 1; i < context.getChildCount() - 1; i += 4) {
            CommonToken token = (CommonToken) context.getChild(i).getPayload();
            if (token.getType() == HelloParser.IDENT) {
                String variableName = token.getText();
                CommonToken variableToken = (CommonToken) context.getChild(i + 2).getPayload();
                Value value;
                switch (variableToken.getType()) {
                    case HelloParser.INTEGER:
                        value = new Value(variableName, "INTEGER", Integer.parseInt(variableToken.getText()), true);
                        current_variables.put(variableName, value);
                        break;
                    case HelloParser.FLOAT:
                        value = new Value(variableName, "FLOAT", Float.parseFloat(variableToken.getText()), true);
                        current_variables.put(variableName, value);
                        break;
                    case HelloParser.BOOL:
                        value = new Value(variableName, "BOOLEAN", Boolean.parseBoolean(variableToken.getText()), true);
                        current_variables.put(variableName, value);
                        break;
                    case HelloParser.STRING:
                        String val = variableToken.getText();
                        val = removeChatAt(val, 0);
                        val = removeChatAt(val, val.length() - 1);
                        value = new Value(variableName, "STRING", val, true);
                        current_variables.put(variableName, value);
                        break;
                }
            }
        }
        //System.out.println(current_variables.entrySet());
        return null;
    }

    @Override
    public Object visitVars(HelloParser.VarsContext context) {
        for (int i = 1; i < context.getChildCount() - 1; i++) {
            CommonToken token = (CommonToken) context.getChild(i).getPayload();
            if (token.getType() == HelloParser.IDENT) {
                String variableName = token.getText();
                CommonToken nextToken = (CommonToken) context.getChild(i + 1).getPayload();
                if (nextToken.getType() == HelloParser.T__2) {
                    CommonToken variableToken = (CommonToken) context.getChild(i + 2).getPayload();
                    Value value;
                    switch (variableToken.getType()) {
                        case HelloParser.INTEGER:
                            value = new Value(variableName, "INTEGER", Integer.parseInt(variableToken.getText()), false);
                            current_variables.put(variableName, value);
                            break;
                        case HelloParser.FLOAT:
                            value = new Value(variableName, "FLOAT", Float.parseFloat(variableToken.getText()), false);
                            current_variables.put(variableName, value);
                            break;
                        case HelloParser.BOOL:
                            value = new Value(variableName, "BOOLEAN", Boolean.parseBoolean(variableToken.getText()), false);
                            current_variables.put(variableName, value);
                            break;
                        case HelloParser.STRING:
                            String val = variableToken.getText();
                            val = removeChatAt(val, 0);
                            val = removeChatAt(val, val.length() - 1);
                            value = new Value(variableName, "STRING", val, false);
                            current_variables.put(variableName, value);
                            break;
                    }
                    i += 3;
                }
                else
                {
                    current_variables.put(variableName, new Value(variableName));
                    i += 1;
                }
            }
        }
        return null;
    }



    @Override
    public Object visitExpr_string(HelloParser.Expr_stringContext context) {
        return new Value("", "STRING", context.STRING().getText(), false);
    }

    @Override
    public Object visitExpr_bool(HelloParser.Expr_boolContext context) {
        return new Value("", "BOOLEAN", Boolean.parseBoolean(context.BOOL().getText()), false);
    }

    @Override
    public Object visitExpr_op(HelloParser.Expr_opContext context) {
        Value left = (Value) visit(context.expr());
        Value right = (Value) visit(context.term());
        switch (context.op.getText()) {
            case "+":
                if (Utils.CheckType(left, right))
                {
                    return Utils.Sum(left, right);
                }
                break;
            case "-":
                if (Utils.CheckType(left, right))
                {
                    return Utils.Sub(left, right);
                }

        }
        return null;
    }

    @Override
    public Object visitTerm_op(HelloParser.Term_opContext context) {
        Value left = (Value) visit(context.term());
        Value right = (Value) visit(context.factor());
        switch (context.op.getText()) {
            case "/":
                if (Utils.CheckType(left, right))
                {
                    return Utils.Div(left, right);
                }
                break;
            case "*":
                if (Utils.CheckType(left, right))
                {
                    return Utils.Mult(left, right);
                }

        }
        return null;
    }

    @Override
    public Object visitTerm_factor(HelloParser.Term_factorContext context) {
        return (Value) visit(context.factor());
    }

    @Override
    public Object visitFactor_expr(HelloParser.Factor_exprContext context) {
        return (Value) visit(context.expr());
    }

    @Override
    public Object visitFactor_float(HelloParser.Factor_floatContext context) {
        return new Value("", "FLOAT", Float.parseFloat(context.FLOAT().getText()), false);
    }

    @Override
    public Object visitFactor_integer(HelloParser.Factor_integerContext context) {
        return new Value("", "INTEGER", Integer.parseInt(context.INTEGER().getText()), false);
    }

    @Override
    public Object visitFactor_ident(HelloParser.Factor_identContext context) {
        try {
            return getVariable(context.IDENT().getText());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
