import java.io.FileWriter;
import java.io.IOException;

public class Listener extends SynthBeaverBaseListener {
    private FileWriter fileWriter;

    public Listener() {
        try {
            fileWriter = new FileWriter("resource/output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterDefinition(SynthBeaverParser.DefinitionContext ctx) {
        super.enterDefinition(ctx);
    }

    @Override
    public void enterStart(SynthBeaverParser.StartContext ctx) {
        System.out.println("enter start");
    }

    @Override
    public void exitStart(SynthBeaverParser.StartContext ctx) {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitDefinition(SynthBeaverParser.DefinitionContext ctx) {
        try {
            if (ctx.mutability().getText().equals("val")) {
                fileWriter.write("final ");
            }
            if (ctx.type().getText().equals("Unarf")) {
                fileWriter.write("Function <Double, Double> " + " ");
            } else {
                fileWriter.write(ctx.type().getText() + " ");
            }
            fileWriter.write(ctx.name().getText() + " = ");
            fileWriter.write(ctx.expression().getText() + ";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void exitInstruction(SynthBeaverParser.InstructionContext ctx) {
        if (ctx.definition()==null &&ctx.expression()!=null && ctx.expression().operator()!=null){
            System.out.println(">"+ctx.getText());
        }
    }
    @Override
    public void exitPlay(SynthBeaverParser.PlayContext ctx) {
        try {
            fileWriter.write("play ("+ctx.arguments().getText()+");");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
