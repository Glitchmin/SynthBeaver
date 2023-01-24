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
        writeToFile(";\n");
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

//    @Override
//    public String visitExpression(SynthBeaverParser.ExpressionContext ctx) {
//        return super.visitExpression(ctx);
//    }

    @Override
    public String visitFunction(SynthBeaverParser.FunctionContext ctx) {
        visitName(ctx.name());
        writeToFile(" ( ");
        visitArguments(ctx.arguments());
        writeToFile(" ) ");
        return "";
    }

    @Override
    public String visitArguments(SynthBeaverParser.ArgumentsContext ctx) {
        for(int i = 0; i < ctx.expression().size(); i++){
            if(i > 0)
                writeToFile(", ");
            visitExpression(ctx.expression(i));
        }
        return "";
    }

    @Override
    public String visitOperator(SynthBeaverParser.OperatorContext ctx) {
        writeToFile(" " + ctx.getText() + " ");
        return "";
    }

    @Override
    public String visitNumber(SynthBeaverParser.NumberContext ctx) {
        writeToFile(" " + ctx.getText() + " ");
        return "";
    }

    @Override
    public String visitBoolLiteral(SynthBeaverParser.BoolLiteralContext ctx) {
        writeToFile(" " + ctx.getText() + " ");
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
