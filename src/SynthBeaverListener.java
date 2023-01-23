// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SynthBeaverParser}.
 */
public interface SynthBeaverListener extends ParseTreeListener {
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
}