import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class MyListener extends HelloBaseListener {
    private Map<String,Value> variables;
    public MyListener()
    {
        variables = new HashMap<>();
    }


    @Override
    public void exitConsts(HelloParser.ConstsContext context)
    {
        for (int i = 1; i < context.getChildCount() - 1; i += 4) {
            CommonToken token = (CommonToken) context.getChild(i).getPayload();
            if (token.getType() == HelloParser.IDENT) {
                String variableName = token.getText();
                CommonToken variableToken = (CommonToken) context.getChild(i + 2).getPayload();
                switch (variableToken.getType()) {
                    case HelloParser.INTEGER:
                        int variable_int = Integer.parseInt(variableToken.getText());
                        Value value_int = new Value();
                        value_int.set(variable_int);
                        value_int.setConst();
                        variables.put(variableName, value_int);
                        break;
                    case HelloParser.FLOAT:
                        float variable_float = Float.parseFloat(variableToken.getText());
                        Value value_float = new Value();
                        value_float.set(variable_float);
                        value_float.setConst();
                        variables.put(variableName, value_float);
                        break;
                    case HelloParser.BOOL:
                        boolean variable_bool = Boolean.parseBoolean(variableToken.getText());
                        Value value_bool = new Value();
                        value_bool.set(variable_bool);
                        value_bool.setConst();
                        variables.put(variableName, value_bool);
                        break;
                    case HelloParser.STRING:
                        String variable_string = variableToken.getText();
                        Value value_string = new Value();
                        value_string.set(variable_string);
                        value_string.setConst();
                        variables.put(variableName, value_string);
                        break;
                }
            }
        }

        System.out.println(variables.entrySet());
    }


    @Override
    public void exitVars(HelloParser.VarsContext context)
    {
        for (int i = 1; i < context.getChildCount() - 1; i++)
        {
            CommonToken token = (CommonToken) context.getChild(i).getPayload();
            if (token.getType() == HelloParser.IDENT)
            {
                String variableName = token.getText();
                CommonToken nextToken = (CommonToken) context.getChild(i + 1).getPayload();
                if (nextToken.getType() == HelloParser.T__2)
                {
                    CommonToken variableToken  = (CommonToken) context.getChild(i + 2).getPayload();
                    switch (variableToken.getType())
                    {
                        case HelloParser.INTEGER:
                            int variable_int = Integer.parseInt(variableToken.getText());
                            Value value_int = new Value();
                            value_int.set(variable_int);
                            variables.put(variableName, value_int);
                            break;
                        case HelloParser.FLOAT:
                            float variable_float = Float.parseFloat(variableToken.getText());
                            Value value_float = new Value();
                            value_float.set(variable_float);
                            variables.put(variableName, value_float);
                            break;
                        case HelloParser.BOOL:
                            boolean variable_bool = Boolean.parseBoolean(variableToken.getText());
                            Value value_bool = new Value();
                            value_bool.set(variable_bool);
                            variables.put(variableName, value_bool);
                            break;
                        case HelloParser.STRING:
                            String variable_string = variableToken.getText();
                            Value value_string = new Value();
                            value_string.set(variable_string);
                            variables.put(variableName, value_string);
                            break;
                    }
                    i += 3;
                }
                else
                {
                    variables.put(variableName, new Value());
                    i += 1;
                }
            }
        }
        System.out.println(variables.entrySet());
    }

    /*
    @Override
    public void exitAssign(HelloParser.AssignContext context)
    {
        String variableName = context.IDENT().getText();
        String value = context.expr().getText();
    }
     */

    public static void main(String[] args)
    {
        try
        {
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName("C:\\Users\\iliy-\\IntelliJIDEAProjects\\Hello\\src\\test.hello");
            HelloLexer lexer = new HelloLexer((input));
            HelloParser parser = new HelloParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());
            parser.programm();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
