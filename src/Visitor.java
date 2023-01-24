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
        System.out.println("hej instruction" + (ctx.expression()==null));
        if (ctx.expression()==null){
            writeToFile(";\n");
        }
        return "";
    }

    @Override
    public String visitMutability(SynthBeaverParser.MutabilityContext ctx) {
        //System.out.println("hej mut" + ctx.getText() + " " + ctx.getText().equals("val"));
        if (ctx.getText().equals("val")) {
            writeToFile("final");
        }
        return "test";
    }

    @Override
    public String visitDefinition(SynthBeaverParser.DefinitionContext ctx) {
        //System.out.println("hej def");
        visitMutability(ctx.mutability());
        return "test";
    }

    @Override
    public String visitWhile(SynthBeaverParser.WhileContext ctx) {
        writeToFile("while ( ");
        visitCondition(ctx.condition());
        writeToFile(" )");
        visitBody(ctx.body());
        return  "";
    }

    @Override
    public String visitBlock(SynthBeaverParser.BlockContext ctx) {
        writeToFile("{\n");
        if(ctx.instructions() != null)
            visitInstructions(ctx.instructions());
        writeToFile("}\n");
        return "";
    }

    @Override
    public String visitFor(SynthBeaverParser.ForContext ctx) {
        writeToFile("for (");
        if(ctx.init != null){
            visitInstruction(ctx.init);
        } else {
            writeToFile(";");
        }
        visitCondition(ctx.condition());
        writeToFile(";");
        visitExpression(ctx.looping);
        writeToFile(")\n");
        visitBody(ctx.body());
        return "";
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
