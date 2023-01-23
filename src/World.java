import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class World {
    public static void main(String[] args) {
        // Input to be parsed
        String input = "var myVar: Int = 10";

        // Create an instance of the lexer and parser
        SynthBeaverLexer lexer = new SynthBeaverLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SynthBeaverParser parser = new SynthBeaverParser(tokens);
        ParseTree tree = parser.definition();
        ParseTreeWalker walker = new ParseTreeWalker();
        SynthBeaverListener listener= new Listener();
        walker.walk(listener, tree);

    }
}


