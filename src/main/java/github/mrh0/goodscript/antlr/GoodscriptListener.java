// Generated from C:/Development/goodscript/src/main/antlr4\Goodscript.g4 by ANTLR 4.10.1
package github.mrh0.goodscript.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoodscriptParser}.
 */
public interface GoodscriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GoodscriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GoodscriptParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(GoodscriptParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(GoodscriptParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GoodscriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GoodscriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#shortcall}.
	 * @param ctx the parse tree
	 */
	void enterShortcall(GoodscriptParser.ShortcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#shortcall}.
	 * @param ctx the parse tree
	 */
	void exitShortcall(GoodscriptParser.ShortcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementAssignment}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment(GoodscriptParser.StatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementAssignment}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment(GoodscriptParser.StatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementShortcall}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementShortcall(GoodscriptParser.StatementShortcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementShortcall}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementShortcall(GoodscriptParser.StatementShortcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GoodscriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GoodscriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(GoodscriptParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(GoodscriptParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GoodscriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GoodscriptParser.ProgramContext ctx);
}