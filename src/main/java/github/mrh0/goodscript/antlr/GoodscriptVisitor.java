// Generated from W:/Development/GitHub/goodscript/src/main/antlr4\Goodscript.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by the {@code numberInt}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInt(GoodscriptParser.NumberIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFloat(GoodscriptParser.NumberFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberHex(GoodscriptParser.NumberHexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBin(GoodscriptParser.NumberBinContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(GoodscriptParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNest}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNest(GoodscriptParser.ExprNestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprShortcall}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprShortcall(GoodscriptParser.ExprShortcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPrimitive}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrimitive(GoodscriptParser.ExprPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprOpBin}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOpBin(GoodscriptParser.ExprOpBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shortcallArg}
	 * labeled alternative in {@link GoodscriptParser#shortcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortcallArg(GoodscriptParser.ShortcallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shortcallNoArg}
	 * labeled alternative in {@link GoodscriptParser#shortcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortcallNoArg(GoodscriptParser.ShortcallNoArgContext ctx);
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
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(GoodscriptParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GoodscriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(GoodscriptParser.UseContext ctx);
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