import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName("C:\\Users\\iliy-\\IntelliJIDEAProjects\\HelloLang\\src\\test.hello");
            HelloLexer lexer = new HelloLexer((input));
            HelloParser parser = new HelloParser(new CommonTokenStream(lexer));
            //parser.addParseListener(new MyListener());
            //parser.programm();
            ParseTree tree = parser.programm();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
