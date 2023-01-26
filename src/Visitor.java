import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Visitor extends SynthBeaverBaseVisitor<String> {
    private FileWriter fileWriter;

    public Visitor() {
        try {
//            fileWriter = new FileWriter("resource/output.txt");
            fileWriter = new FileWriter("src/__BeaverClassRestrictedName.java");
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


    @Override
    public String visitStatement(SynthBeaverParser.StatementContext ctx) {
        super.visitStatement(ctx);
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
        return "";
    }

    @Override
    public String visitBlock(SynthBeaverParser.BlockContext ctx) {
        writeToFile("{\n");
        if (ctx.instructions() != null)
            visitInstructions(ctx.instructions());
        writeToFile("}\n");
        return "";
    }

    @Override
    public String visitFor(SynthBeaverParser.ForContext ctx) {
        writeToFile("for (");
        if (ctx.init != null) {
            visitNoSemiStatement(ctx.init);
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
    public String visitIf(SynthBeaverParser.IfContext ctx) {
        writeToFile("if ( ");
        visitCondition(ctx.condition());
        writeToFile(" ) ");
        visitBody(ctx.ifBody);
        if (ctx.elseBody != null) {
            writeToFile(" else ");
            visitBody(ctx.elseBody);
        }
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
    public String visitLambda(SynthBeaverParser.LambdaContext ctx) {
        visitName(ctx.name());
        writeToFile(" -> ");
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        } else {
            visitBlock(ctx.block());
        }
        return "";
    }

    @Override
    public String visitArguments(SynthBeaverParser.ArgumentsContext ctx) {
        for (int i = 0; i < ctx.expression().size(); i++) {
            if (i > 0)
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
    public String visitArgumentDef(SynthBeaverParser.ArgumentDefContext ctx) {
        visitType(ctx.type());
        visitName(ctx.name());
        return "";
    }

    @Override
    public String visitArgumentsDef(SynthBeaverParser.ArgumentsDefContext ctx) {
        boolean first = true;
        for (SynthBeaverParser.ArgumentDefContext argument : ctx.argumentDef()) {
            if (first) {
                first = false;
            } else {
                writeToFile(", ");
            }
            visitArgumentDef(argument);
        }
        return "";
    }

    @Override
    public String visitFunctionDef(SynthBeaverParser.FunctionDefContext ctx) {
        writeToFile("public static ");
        visitType(ctx.type());
        visitName(ctx.name());
        writeToFile("( ");
        if (Objects.equals(ctx.name().getText(), "main")) {
            writeToFile("String[] __args");
            if (!ctx.argumentsDef().getText().isEmpty()) {
                writeToFile(", ");
            }
        }
        visitArgumentsDef(ctx.argumentsDef());
        writeToFile(")");
        visitBody(ctx.body());

        return "";
    }

    @Override
    public String visitReturn(SynthBeaverParser.ReturnContext ctx) {
        writeToFile("return ");
        return super.visitReturn(ctx);
    }

    @Override
    public String visitPlay(SynthBeaverParser.PlayContext ctx) {
        writeToFile("__singMyBeaverRestrictedName(");
        super.visitPlay(ctx);
        writeToFile(")");
        return "";
    }

    @Override
    public String visitStart(SynthBeaverParser.StartContext ctx) {
        System.out.println("hej start");
        writeToFile("import javax.sound.sampled.AudioFormat;\n" +
                "import javax.sound.sampled.AudioSystem;\n" +
                "import javax.sound.sampled.DataLine;\n" +
                "import javax.sound.sampled.SourceDataLine;\n" +
                "import java.util.function.Function;\n" +
                "\n" +
                "public class __BeaverClassRestrictedName {\n" +
                "    public static void __singMyBeaverRestrictedName(\n" +
                "            int duration,\n" +
                "            Function<Double, Double> surfed,\n" +
                "            Function<Double, Double> freqFun,\n" +
                "            Function<Double, Double> amplitude,\n" +
                "            float sampleRate\n" +
                "    ) {\n" +
                "        try {\n" +
                "            AudioFormat audioFormat = new AudioFormat(sampleRate, 8, 1, true, true);\n" +
                "\n" +
                "            // Open a new audio stream\n" +
                "            DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);\n" +
                "            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);\n" +
                "            line.open(audioFormat);\n" +
                "            line.start();\n" +
                "\n" +
                "            // Create a buffer to hold the audio samples\n" +
                "            byte[] buffer = new byte[(int) (sampleRate * duration)];\n" +
                "\n" +
                "            double waveArg = 0;\n" +
                "            for (int i = 0; i < buffer.length; i++) {\n" +
                "                double time = (double) i / sampleRate;\n" +
                "                waveArg += 1 / sampleRate * freqFun.apply(time + 5);\n" +
                "//                if (i % (sampleRate / 10) == 0) {\n" +
                "//                    System.out.println(\"frequency = \" + frequency);\n" +
                "//                }\n" +
                "                buffer[i] = (byte) (surfed.apply(waveArg) * amplitude.apply(time));\n" +
                "            }\n" +
                "            // Write the samples to the audio stream\n" +
                "            line.write(buffer, 0, buffer.length);\n" +
                "\n" +
                "            // Close the audio stream\n" +
                "            line.drain();\n" +
                "            line.stop();\n" +
                "            line.close();\n" +
                "        } catch (Exception e) {\n" +
                "            e.printStackTrace();\n" +
                "        }\n" +
                "    }");
        super.visitStart(ctx);
        writeToFile("}\n");
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "test";
    }
}
