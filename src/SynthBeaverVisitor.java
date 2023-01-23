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
	 * Visit a parse tree produced by {@link SynthBeaverParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(SynthBeaverParser.DefinitionContext ctx);
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
}