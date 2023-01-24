// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SynthBeaverParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SynthBeaverVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SynthBeaverParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(SynthBeaverParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(SynthBeaverParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(SynthBeaverParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#mutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutability(SynthBeaverParser.MutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(SynthBeaverParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(SynthBeaverParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(SynthBeaverParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(SynthBeaverParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SynthBeaverParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SynthBeaverParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SynthBeaverParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SynthBeaverParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SynthBeaverParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SynthBeaverParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(SynthBeaverParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(SynthBeaverParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SynthBeaverParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#play}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlay(SynthBeaverParser.PlayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(SynthBeaverParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#argumentsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsDef(SynthBeaverParser.ArgumentsDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#argumentDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentDef(SynthBeaverParser.ArgumentDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SynthBeaverParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SynthBeaverParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SynthBeaverParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SynthBeaverParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SynthBeaverParser.ConditionContext ctx);
}