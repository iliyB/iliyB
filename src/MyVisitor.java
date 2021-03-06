import org.antlr.v4.runtime.CommonToken;

import java.awt.*;
import java.util.HashMap;
import java.util.Stack;

public class MyVisitor  extends HelloBaseVisitor<Object> {
    HashMap<String, Value> current_variables = new HashMap<>();
    HashMap<String, Value> global_variables = new HashMap<>();
    HashMap<String, HelloParser.BlockContext> function = new HashMap<>();
    HashMap<String, Integer> print_string = new HashMap<>();
    boolean global = false;
    String procedure = "";



    private Value getVariable(String variableName) throws Exception {

        if (global) {
            if (global_variables.containsKey(variableName)) {
                return global_variables.get(variableName);
            }
        }
        else {
            if (current_variables.containsKey(variableName)) {
                return current_variables.get(variableName);
            }
            else if (global_variables.containsKey(variableName)) {
                return global_variables.get(variableName);
            }
        }
        throw  new Exception("Variable " + variableName + " is not identified");
    }

    private void setVariable(String variableName, Value value) throws Exception {
        value.setIdent(variableName);
        if (global) {
            if (global_variables.containsKey(variableName)) {
                Value cur_value = global_variables.get(variableName);
                if (cur_value.getType().equals(value.getType())) {
                    global_variables.replace(variableName, value);
                    /*
                    System.out.println("\nvar - " + variableName);
                    System.out.println("val - " + value.getValue().toString());
                    System.out.println("ref - " + value.getRef());
                    */
                    switch (value.getType()) {
                        case "INTEGER":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_int(variableName, value.getRef(),global);
                            }
                            else {
                                GenerateLLVM.assign_int(variableName, value.getValue().toString(),global);
                            }
                            break;
                        case "FLOAT":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_double(variableName, value.getRef(),global);
                            }
                            else {
                                GenerateLLVM.assign_double(variableName, value.getValue().toString(),global);
                            }
                            break;
                        case "BOOLEAN":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_bool(variableName, value.getRef(),global);
                            }
                            else {
                                GenerateLLVM.assign_bool(variableName, value.getValue().toString(),global);
                            }
                            break;
                        default:
                            throw  new Exception("Variable" + variableName + " has a wrong type");
                    }
                }
                else throw  new Exception("Variable" + variableName + " has a different type");
            }
        }
        else {
            if (current_variables.containsKey(variableName)) {
                Value cur_value = current_variables.get(variableName);
                if (cur_value.getType().equals(value.getType())) {
                    current_variables.replace(variableName, value);
                    switch (value.getType()) {
                        case "INTEGER":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_int(variableName, value.getRef(),global);
                            }
                            else {
                                GenerateLLVM.assign_int(variableName, value.getValue().toString(),global);
                            }
                            break;
                        case "FLOAT":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_double(variableName, value.getRef(),global);
                            }
                            else {
                                GenerateLLVM.assign_double(variableName, value.getValue().toString(),global);
                            }
                            break;
                        case "BOOLEAN":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_bool(variableName, value.getRef(),global);
                            }
                            else {
                                GenerateLLVM.assign_bool(variableName, value.getValue().toString(),global);
                            }
                            break;
                        default:
                            throw  new Exception("Variable" + variableName + " has a wrong type");
                    }
                }
                else throw  new Exception("Variable" + variableName + " has a different type");
            }
            else if (global_variables.containsKey(variableName)) {
                Value cur_value = global_variables.get(variableName);
                if (cur_value.getType().equals(value.getType())) {
                    global_variables.replace(variableName, value);
                    switch (value.getType()) {
                        case "INTEGER":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_int(variableName, value.getRef(),true);
                            }
                            else {
                                GenerateLLVM.assign_int(variableName, value.getValue().toString(),true);
                            }
                            break;
                        case "FLOAT":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_double(variableName, value.getRef(),true);
                            }
                            else {
                                GenerateLLVM.assign_double(variableName, value.getValue().toString(),true);
                            }
                            break;
                        case "BOOLEAN":
                            if (value.checkRef()) {
                                GenerateLLVM.assign_bool(variableName, value.getRef(),true);
                            }
                            else {
                                GenerateLLVM.assign_bool(variableName, value.getValue().toString(),true);
                            }
                            break;
                        default:
                            throw  new Exception("Variable" + variableName + " has a wrong type");
                    }
                }
                else throw  new Exception("Variable" + variableName + " has a different type");
            }
            else throw  new Exception("Variable" + variableName + " is not identified");
        }
    }

    private void callProcedure(String ident) throws Exception{
        if (function.containsKey(ident)) {
            GenerateLLVM.call(ident);
            //visit(function.get(ident));
        }
        else throw new Exception("Procedure" + ident + " is not identified");
    }

    @Override
    public Object visitProgramm(HelloParser.ProgrammContext context) {
        visitChildren(context);
        System.out.println("Complete");;
        GenerateLLVM.generate();
        OptimizationLLVM.optimization();
        return null;
    }

    @Override
    public Object visitBlock(HelloParser.BlockContext context) {
        if (context.parent.getChildCount() == 2) global = true;
        else global = false;
        if (!global) current_variables = new HashMap<>();
        visitChildren(context);
        return null;
    }

    @Override
    public Object visitProcedure(HelloParser.ProcedureContext context) {
        String ident = context.IDENT().getText();
        function.put(ident, context.block());
        procedure = ident;
        global = false;
        GenerateLLVM.function_start(ident);
        visit(context.block());
        GenerateLLVM.function_end();
        global = true;
        procedure = "";
        return null;
    }

    @Override
    public Object visitVars(HelloParser.VarsContext context) {
        visitChildren(context);
        return null;
    }


    //declare

    @Override
    public Object visitDeclare_int_with_value(HelloParser.Declare_int_with_valueContext context) {
        String variableName = context.IDENT().getText();
        String valueVar = context.INTEGER().getText();
        Value value = new Value(variableName, "INTEGER", Integer.parseInt(valueVar));
        if (global) global_variables.put(variableName, value);
        else current_variables.put(variableName, value);
        if (global) GenerateLLVM.declare_global_int(variableName, valueVar);
        else {
            GenerateLLVM.declare_alloca_int(variableName);
            GenerateLLVM.assign_int(variableName, valueVar, global);
        }
        return null;
    }

    @Override
    public Object visitDeclare_int_without_value(HelloParser.Declare_int_without_valueContext context) {
        String variableName = context.IDENT().getText();
        Value value = new Value(variableName, "INTEGER");
        if (global) global_variables.put(variableName, value);
        else current_variables.put(variableName, value);
        if (global) GenerateLLVM.declare_global_int(variableName, "0");
        else GenerateLLVM.declare_alloca_int(variableName);
        return null;
    }

    @Override
    public Object visitDeclare_float_with_value(HelloParser.Declare_float_with_valueContext context) {
        String variableName = context.IDENT().getText();
        String valueVar = context.FLOAT().getText();
        Value value = new Value(variableName, "FLOAT", Float.parseFloat(valueVar));
        if (global) global_variables.put(variableName, value);
        else current_variables.put(variableName, value);
        if (global) GenerateLLVM.declare_global_double(variableName, valueVar);
        else {
            GenerateLLVM.declare_alloca_double(variableName);
            GenerateLLVM.assign_double(variableName, valueVar, global);
        }
        return null;
    }

    @Override
    public Object visitDeclare_float_without_value(HelloParser.Declare_float_without_valueContext context) {
        String variableName = context.IDENT().getText();
        Value value = new Value(variableName, "FLOAT");
        if (global) global_variables.put(variableName, value);
        else current_variables.put(variableName, value);
        if (global) GenerateLLVM.declare_global_double(variableName, "0.0");
        else GenerateLLVM.declare_alloca_double(variableName);
        return null;
    }

    @Override
    public Object visitDeclare_bool_with_value(HelloParser.Declare_bool_with_valueContext context) {
        String variableName = context.IDENT().getText();
        String valueVar = context.BOOL().getText();
        Value value = new Value(variableName, "BOOLEAN", Boolean.parseBoolean(valueVar));
        if (global) global_variables.put(variableName, value);
        else current_variables.put(variableName, value);
        if (global) GenerateLLVM.declare_global_bool(variableName, valueVar);
        else {
            GenerateLLVM.declare_alloca_bool(variableName);
            GenerateLLVM.assign_bool(variableName, valueVar, global);
        }
        return null;
    }

    @Override
    public  Object visitDeclare_bool_without_value(HelloParser.Declare_bool_without_valueContext context) {
        String variableName = context.IDENT().getText();
        Value value = new Value(variableName, "BOOLEAN");
        if (global) global_variables.put(variableName, value);
        else current_variables.put(variableName, value);
        if (global) GenerateLLVM.declare_global_bool(variableName, "false");
        else GenerateLLVM.declare_alloca_bool(variableName);
        return null;
    }

    @Override
    public Object visitDeclare_string(HelloParser.Declare_stringContext context) {
        String variableName = context.IDENT().getText();
        String valueVar = context.STRING().getText();
        valueVar = Utils.removeChatAt(valueVar, 0);
        valueVar = Utils.removeChatAt(valueVar, valueVar.length() - 1);
        Value value = new Value(variableName, "STRING", valueVar);
        if (global) global_variables.put(variableName, value);
        else current_variables.put(variableName, value);
        GenerateLLVM.declare_string(variableName, valueVar, global, procedure);
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
        try {
            setVariable(variableName, value);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Object visitPrint_expr(HelloParser.Print_exprContext context) {
        Value value = (Value) visit(context.expr());
        //System.out.println(value.getValue().toString());
            switch (value.getType()) {
                case "INTEGER":
                    if (value.checkRef()) {
                        GenerateLLVM.print_int(value.getRef());
                    }
                    else {
                        GenerateLLVM.print_int(value.getValue().toString());
                    }
                    break;
                case "FLOAT":
                    if (value.checkRef()) {
                        GenerateLLVM.print_double(value.getRef());
                    }
                    else {
                        GenerateLLVM.print_double(value.getValue().toString());
                    }
                    break;
                case "BOOLEAN":
                    if (value.checkRef()) {
                        GenerateLLVM.print_bool(value.getRef());
                    }
                    else {
                        GenerateLLVM.print_bool(value.getValue().toString());
                    }
                    break;
                case "STRING":
                    boolean global_variable = false;
                    if (current_variables.containsKey(value.getIdent())) global_variable = false;
                    else if (global_variables.containsKey(value.getIdent())) global_variable = true;
                    GenerateLLVM.print_string(value.getIdent(), value.getValue().toString().length(), global_variable, procedure);
                    break;
            }
        return null;
    }

    @Override
    public Object visitPrint_string(HelloParser.Print_stringContext context) {
        String text = context.STRING().getText();
        text = Utils.removeChatAt(text, 0);
        text = Utils.removeChatAt(text, text.length() - 1);
        //System.out.println(text);
        if (print_string.containsKey(text)) {
            int pos = print_string.get(text);
            GenerateLLVM.print(text, pos);
        }
        else {
            int pos = GenerateLLVM.print(text);
            print_string.put(text, pos);
        }
        return  null;
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
        if (value.checkRef()) {
            GenerateLLVM.if_start(value.getRef());
        }
        else {
            GenerateLLVM.if_start(value.getValue().toString());
        }
        visit(context.statement());
        GenerateLLVM.if_end();
        /*
        if (Boolean.parseBoolean(value.getValue().toString())) {
            visit(context.statement());
        }
        */
        return null;
    }

    @Override
    public Object visitWhile_(HelloParser.While_Context context) {
        //Value value = (Value) visit(context.condition());
        /*
        while (Boolean.parseBoolean(value.getValue().toString())) {
            visit(context.statement());
            value = (Value) visit(context.condition());
        }
        */
        GenerateLLVM.while_start();
        Value value = (Value) visit(context.condition());
        if (value.checkRef()) {
            GenerateLLVM.while_condition(value.getRef());
        }
        else {
            GenerateLLVM.while_condition(value.getValue().toString());
        }
        visit(context.statement());
        GenerateLLVM.while_end();
        return null;
    }

    @Override
    public Object visitBreak_(HelloParser.Break_Context context) {
        GenerateLLVM.Break();
        return null;
    }

    @Override
    public Object visitContinue_(HelloParser.Continue_Context context) {
        GenerateLLVM.Continue();
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
        try {
            Utils.CheckBoolean(value);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return Utils.Denial(value);
    }

    @Override
    public Object visitCondition_and(HelloParser.Condition_andContext context) {
        Value left = (Value) visit(context.condition());
        Value right = (Value) visit(context.term_cond());
        return Utils.And(left, right);
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
        return Utils.Denial(value);
    }

    @Override
    public Object visitTerm_cond_or(HelloParser.Term_cond_orContext context) {
        Value left = (Value) visit(context.term_cond());
        Value right = (Value) visit(context.factor_cond());
        return Utils.Or(left, right);
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
        try {
            Utils.CheckBoolean(value);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return Utils.Denial(value);
    }

    @Override
    public Object visitFactor_condition(HelloParser.Factor_conditionContext context) {
        return (Value) visit(context.condition());
    }

    @Override
    public Object visitFactor_cond_expr(HelloParser.Factor_cond_exprContext context) {
        Value result = (Value) visit(context.expr());
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
    public Object visitExpr_bool(HelloParser.Expr_boolContext context) {
        return new Value("", "BOOLEAN", Boolean.parseBoolean(context.BOOL().getText()));
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
        return new Value("", "FLOAT", Float.parseFloat(context.FLOAT().getText()));
    }



    @Override
    public Object visitFactor_integer(HelloParser.Factor_integerContext context) {
        return new Value("", "INTEGER", Integer.parseInt(context.INTEGER().getText()));
    }



    @Override
    public Object visitFactor_ident(HelloParser.Factor_identContext context) {
        try {
            Value value = getVariable(context.IDENT().getText());
            boolean global_;
            if (global) global_ = true;
            else if (current_variables.containsKey(value.getIdent()))  global_ = false;
            else if (global_variables.containsKey(value.getIdent())) global_ = true;
            else global_ = false;
            switch (value.getType()) {
                case "INTEGER":
                    value.setRef(GenerateLLVM.load_int(value.getIdent(), global_));
                    break;
                case "FLOAT":
                    value.setRef(GenerateLLVM.load_double(value.getIdent(), global_));
                    break;
                case "BOOLEAN":
                    value.setRef(GenerateLLVM.load_bool(value.getIdent(), global_));
                    break;
            }
            return value;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
