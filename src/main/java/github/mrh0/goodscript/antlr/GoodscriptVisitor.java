// Generated from C:/Development/goodscript/src/main/antlr4\Goodscript.g4 by ANTLR 4.10.1
package github.mrh0.goodscript.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GoodscriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GoodscriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GoodscriptParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(GoodscriptParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GoodscriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#shortcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortcall(GoodscriptParser.ShortcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssignment}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(GoodscriptParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementShortcall}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementShortcall(GoodscriptParser.StatementShortcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GoodscriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GoodscriptParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GoodscriptParser.ProgramContext ctx);
}