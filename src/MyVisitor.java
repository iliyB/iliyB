import org.antlr.v4.runtime.CommonToken;

import java.util.HashMap;
import java.util.Stack;

public class MyVisitor  extends HelloBaseVisitor<Object> {
    HashMap<String, Value> current_variables = new HashMap<>();
    Stack <HashMap<String, Value>> stack_variables = new Stack<>();
    HashMap<String, HelloParser.BlockContext> function = new HashMap<>();
    boolean global = false;



    private Value getVariable(String variableName) throws Exception {
        if (current_variables.containsKey(variableName)) {
            return current_variables.get(variableName);
        }
        for (HashMap<String, Value> cv: stack_variables) {
            if (cv.containsKey(variableName)) {
                return cv.get(variableName);
            }
        }
        throw  new Exception("Variable " + variableName + " is not identified");
    }

    private void setVariable(String variableName, Value value) throws Exception {
        value.setIdent(variableName);
        if (current_variables.containsKey(variableName)) {
            Value val = current_variables.get(variableName);
            if (val.isConst()) throw new Exception("You cannot change the value of a constant " + variableName);
            else current_variables.replace(variableName, value);
        }
        else
        for (HashMap<String, Value> cv: stack_variables) {
            if (cv.containsKey(variableName)) {
                Value val = cv.get(variableName);
                if (val.isConst()) throw new Exception("You cannot change the value of a constant " + variableName);
                else cv.replace(variableName, value);
            }
            else throw  new Exception("Variable" + variableName + " is not identified");
        }
    }

    private void callProcedure(String ident) throws Exception{
        if (function.containsKey(ident)) {
            visit(function.get(ident));
        }
        else throw new Exception("Procedure" + ident + " is not identified");
    }

    @Override
    public Object visitProgramm(HelloParser.ProgrammContext context) {
        visitChildren(context);
        System.out.println();
        System.out.println();
        System.out.println(GenerateLLVM.generate());
        return null;
    }

    @Override
    public Object visitBlock(HelloParser.BlockContext context) {
        boolean stack = false;
        if (!current_variables.isEmpty()) {
            stack_variables.push(current_variables);
            stack = true;
        }
        current_variables = new HashMap<>();
        if (context.parent.getChildCount() == 2) global = true;
        else global = false;
        visitChildren(context);
        if (stack) current_variables = stack_variables.pop();
        else current_variables.clear();


        return null;
    }

    @Override
    public Object visitProcedure(HelloParser.ProcedureContext context) {
        String ident = context.IDENT().getText();
        function.put(ident, context.block());
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
                        if (global) {
                            GenerateLLVM.declare_global_i64(variableName, variableToken.getText());
                        }
                        else {
                            GenerateLLVM.declare_alloca_i64(variableName);
                            GenerateLLVM.assign_i64(variableName, variableToken.getText());
                        }
                        break;
                    case HelloParser.FLOAT:
                        value = new Value(variableName, "FLOAT", Float.parseFloat(variableToken.getText()), true);
                        current_variables.put(variableName, value);
                        if (global) {
                            GenerateLLVM.declare_global_double(variableName, variableToken.getText());
                        }
                        else {
                            GenerateLLVM.declare_alloca_double(variableName);
                            GenerateLLVM.assign_double(variableName, variableToken.getText());
                        }
                        break;
                    case HelloParser.BOOL:
                        value = new Value(variableName, "BOOLEAN", Boolean.parseBoolean(variableToken.getText()), true);
                        current_variables.put(variableName, value);
                        if (global) {
                            GenerateLLVM.declare_global_bool(variableName, variableToken.getText());
                        }
                        else {
                            GenerateLLVM.declare_alloca_bool(variableName);
                            GenerateLLVM.assign_bool(variableName, variableToken.getText());
                        }
                        break;
                    case HelloParser.STRING:
                        String val = variableToken.getText();
                        val = Utils.removeChatAt(val, 0);
                        val = Utils.removeChatAt(val, val.length() - 1);
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
                            if (global) {
                                GenerateLLVM.declare_global_i64(variableName, variableToken.getText());
                            }
                            else {
                                GenerateLLVM.declare_alloca_i64(variableName);
                                GenerateLLVM.assign_i64(variableName, variableToken.getText());
                            }
                            break;
                        case HelloParser.FLOAT:
                            value = new Value(variableName, "FLOAT", Float.parseFloat(variableToken.getText()), false);
                            current_variables.put(variableName, value);
                            if (global) {
                                GenerateLLVM.declare_global_double(variableName, variableToken.getText());
                            }
                            else {
                                GenerateLLVM.declare_alloca_double(variableName);
                                GenerateLLVM.assign_double(variableName, variableToken.getText());
                            }
                            break;
                        case HelloParser.BOOL:
                            value = new Value(variableName, "BOOLEAN", Boolean.parseBoolean(variableToken.getText()), false);
                            current_variables.put(variableName, value);
                            if (global) {
                                GenerateLLVM.declare_global_bool(variableName, variableToken.getText());
                            }
                            else {
                                GenerateLLVM.declare_alloca_bool(variableName);
                                GenerateLLVM.assign_bool(variableName, variableToken.getText());
                            }
                            break;
                        case HelloParser.STRING:
                            String val = variableToken.getText();
                            val = Utils.removeChatAt(val, 0);
                            val = Utils.removeChatAt(val, val.length() - 1);
                            value = new Value(variableName, "STRING", val, false);
                            current_variables.put(variableName, value);
                            break;
                    }
                    i += 3;
                }
                else
                {
                    current_variables.put(variableName, new Value(variableName));
                    if (global) GenerateLLVM.declare_global_i64(variableName, "0");
                    else GenerateLLVM.declare_alloca_i64(variableName);
                    i += 1;
                }
            }
        }
        return null;
    }

    //statements

    @Override
    public Object visitCall(HelloParser.CallContext context) {
        try {
            callProcedure(context.IDENT().getText());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object visitAssign(HelloParser.AssignContext context) {
        String variableName = context.IDENT().getText();
        Value value = (Value) visit(context.expr());
        //System.out.println(variableName + " = " + value.getValue().toString());
        try {
            setVariable(variableName, value);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object visitPrint(HelloParser.PrintContext context) {
        Value value = (Value) visit(context.expr());
        System.out.println(value.getValue().toString());
        if (value.getIdent().equals("")) {
            switch (value.getType()) {
                case "INTEGER":
                    GenerateLLVM.print_i64(value.getValue().toString());
                    break;
                case "FLOAT":
                    GenerateLLVM.print_double(value.getValue().toString());
                    break;
                case "BOOLEAN":
                    GenerateLLVM.print_bool(value.getValue().toString());
            }
        }
        else switch (value.getType()) {
            case "INTEGER":
                GenerateLLVM.print_declare_i64(value.getIdent());
                break;
            case "FLOAT":
                GenerateLLVM.print_declare_double(value.getIdent());
                break;
            case "BOOLEAN":
                GenerateLLVM.print_declare_bool(value.getIdent());
        }
        return null;
    }

    @Override
    public Object visitStatement(HelloParser.StatementContext context) {
        return visitChildren(context);
    }

    @Override
    public Object visitRegion(HelloParser.RegionContext context) {
        return visitChildren(context);
    }

    @Override
    public Object visitIf_(HelloParser.If_Context context) {
        Value value = (Value) visit(context.condition());
        if (Boolean.parseBoolean(value.getValue().toString())) {
            visit(context.statement());
        }
        return null;
    }

    @Override
    public Object visitWhile_(HelloParser.While_Context context) {
        Value value = (Value) visit(context.condition());
        while (Boolean.parseBoolean(value.getValue().toString())) {
            visit(context.statement());
            value = (Value) visit(context.condition());
        }
        return null;
    }

    @Override
    public Object visitBreak_(HelloParser.Break_Context context) {
        return null;
    }

    @Override
    public Object visitContinue_(HelloParser.Continue_Context context) {
        return null;
    }


    //condition

    @Override
    public Object visitCondition_term(HelloParser.Condition_termContext context) {
        return (Value) visit(context.term_cond());
    }

    @Override
    public Object visitCondition_denial(HelloParser.Condition_denialContext context) {
        Value value = (Value) visit(context.condition());
        //System.out.println(value.getType() + " " + value.getIdent() + " " + value.getValue());
        try {
            Utils.CheckBoolean(value);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        boolean val = Boolean.parseBoolean(value.getValue().toString());
        value.setValue(!val);
        return value;
    }

    @Override
    public Object visitCondition_and(HelloParser.Condition_andContext context) {
        Value left = (Value) visit(context.condition());
        Value right = (Value) visit(context.term_cond());
        return new Value("", Utils.Bool, ((Boolean.parseBoolean(left.getValue().toString())) && (Boolean.parseBoolean(right.getValue().toString()))), false);
    }


    //term_cond

    @Override
    public Object visitTerm_cond_factor(HelloParser.Term_cond_factorContext context) {
        return (Value) visit(context.factor_cond());
    }

    @Override
    public Object visitTerm_cond_denial(HelloParser.Term_cond_denialContext context) {
        Value value = (Value) visit(context.term_cond());
        //System.out.println(value.getType() + " " + value.getIdent() + " " + value.getValue());
        try {
            Utils.CheckBoolean(value);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        boolean val = Boolean.parseBoolean(value.getValue().toString());
        value.setValue(!val);
        return value;
    }

    @Override
    public Object visitTerm_cond_or(HelloParser.Term_cond_orContext context) {
        Value left = (Value) visit(context.term_cond());
        Value right = (Value) visit(context.factor_cond());
        return new Value("", Utils.Bool, (Boolean.parseBoolean(left.getValue().toString()) || Boolean.parseBoolean(right.getValue().toString())), false);
    }

    //factor_cond

    @Override
    public Object visitFactor_cond_term(HelloParser.Factor_cond_termContext context) {
        return (Value) visit(context.term_cond());
    }

    @Override
    public Object visitFactor_cond_compare(HelloParser.Factor_cond_compareContext context) {
        Value left = (Value) visit(context.expr(0));
        Value right = (Value) visit(context.expr(1));
        try {
            if (!Utils.CheckTypeAll(left, right)) return null;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        Value value;
        try {
            return Utils.Compare(context.op.getText(), left, right);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Object visitFactor_cond_denial(HelloParser.Factor_cond_denialContext context) {
        Value value = (Value) visit(context.factor_cond());
        //System.out.println(value.getType() + " " + value.getIdent() + " " + value.getValue());
        try {
            Utils.CheckBoolean(value);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        boolean val = Boolean.parseBoolean(value.getValue().toString());
        value.setValue(!val);
        return value;
    }

    @Override
    public Object visitFactor_condition(HelloParser.Factor_conditionContext context) {
        return (Value) visit(context.condition());
    }

    @Override
    public Object visitFactor_cond_expr(HelloParser.Factor_cond_exprContext context) {
        Value result = (Value) visit(context.expr());
        //System.out.println(result.getType() + " " + result.getIdent() + " " + result.getValue());
        try {
            Utils.CheckBoolean(result);
            return result;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //expr

    @Override
    public Object visitExpr_term(HelloParser.Expr_termContext context) {
        return (Value) visit(context.term());
    }

    @Override
    public Object visitExpr_string(HelloParser.Expr_stringContext context) {
        String str = context.STRING().getText();
        str = Utils.removeChatAt(str, 0);
        str = Utils.removeChatAt(str, str.length() - 1);
        return new Value("", "STRING", str, false);
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
                try {
                    if (Utils.CheckType(left, right)) return Utils.Sum(left, right);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "-":
                try {
                    if (Utils.CheckType(left, right)) return Utils.Sub(left, right);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                break;

        }
        return null;
    }

    //term

    @Override
    public Object visitTerm_op(HelloParser.Term_opContext context) {
        Value left = (Value) visit(context.term());
        Value right = (Value) visit(context.factor());
        switch (context.op.getText()) {
            case "/":
                try {
                    if (Utils.CheckType(left, right)) return Utils.Div(left, right);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "*":
                try {
                    if (Utils.CheckType(left, right)) return Utils.Mult(left, right);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                break;

        }
        return null;
    }

    @Override
    public Object visitTerm_factor(HelloParser.Term_factorContext context) {
        return (Value) visit(context.factor());
    }

    //factor

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
