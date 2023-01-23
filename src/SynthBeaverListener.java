// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SynthBeaverParser}.
 */
public interface SynthBeaverListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SynthBeaverParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SynthBeaverParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(SynthBeaverParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(SynthBeaverParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SynthBeaverParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SynthBeaverParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(SynthBeaverParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(SynthBeaverParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(SynthBeaverParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(SynthBeaverParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#justIf}.
	 * @param ctx the parse tree
	 */
	void enterJustIf(SynthBeaverParser.JustIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#justIf}.
	 * @param ctx the parse tree
	 */
	void exitJustIf(SynthBeaverParser.JustIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SynthBeaverParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SynthBeaverParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SynthBeaverParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SynthBeaverParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SynthBeaverParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SynthBeaverParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SynthBeaverParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SynthBeaverParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(SynthBeaverParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(SynthBeaverParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SynthBeaverParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SynthBeaverParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SynthBeaverParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SynthBeaverParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#play}.
	 * @param ctx the parse tree
	 */
	void enterPlay(SynthBeaverParser.PlayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#play}.
	 * @param ctx the parse tree
	 */
	void exitPlay(SynthBeaverParser.PlayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(SynthBeaverParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(SynthBeaverParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#argumentsDef}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDef(SynthBeaverParser.ArgumentsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#argumentsDef}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDef(SynthBeaverParser.ArgumentsDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#argumentDef}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDef(SynthBeaverParser.ArgumentDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#argumentDef}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDef(SynthBeaverParser.ArgumentDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SynthBeaverParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SynthBeaverParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SynthBeaverParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SynthBeaverParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SynthBeaverParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SynthBeaverParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SynthBeaverParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SynthBeaverParser.ConditionContext ctx);
}