import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class World {

    public static void main(String[] args) {
        // Input to be parsed
        String fileContent = "";
        try {
            fileContent = Files.readString(Paths.get("resource/example.sbv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(fileContent + "<-");

        // Create an instance of the lexer and parser
        SynthBeaverLexer lexer = new SynthBeaverLexer(CharStreams.fromString(fileContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SynthBeaverParser parser = new SynthBeaverParser(tokens);
        ParseTree tree = parser.start();
// Create a visitor
        Visitor visitor = new Visitor();
        visitor.visit(tree);

    }
}


