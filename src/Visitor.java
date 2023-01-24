import java.io.FileWriter;
import java.io.IOException;

public class Visitor extends SynthBeaverBaseVisitor <String> {
    private FileWriter fileWriter;

    public Visitor() {
        try {
            fileWriter = new FileWriter("resource/output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeToFile(String text) {
        try {
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override public String visitInstruction(SynthBeaverParser.InstructionContext ctx){
        super.visitInstruction(ctx);
        if (ctx.expression()==null){
            writeToFile(";\n");
        }
        return "";
    }

    @Override
    public String visitMutability(SynthBeaverParser.MutabilityContext ctx) {
        System.out.println("hej mut");
        if (ctx.getText().equals("val")) {
            writeToFile("final ");
        }
        return "";
    }
    @Override
    public String visitType(SynthBeaverParser.TypeContext ctx) {
        if (ctx.getText().equals("Unarf")) {
            writeToFile("Function <Double, Double> ");
        } else {
            writeToFile(ctx.getText() + " ");
        }
        return "";
    }

    @Override
    public String visitName(SynthBeaverParser.NameContext ctx) {
        writeToFile(ctx.getText());
        return "";
    }

    @Override
    public String visitDefinition(SynthBeaverParser.DefinitionContext ctx) {
        System.out.println("hej def");
        visitMutability(ctx.mutability());
        visitType(ctx.type());
        visitName(ctx.name());
        writeToFile("=");
        visitExpression(ctx.expression());
        return "test";
    }

    @Override
    public String visitStart(SynthBeaverParser.StartContext ctx) {
        System.out.println("hej start");
        writeToFile("siemano");
        super.visitStart(ctx);
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "test";
    }
}
