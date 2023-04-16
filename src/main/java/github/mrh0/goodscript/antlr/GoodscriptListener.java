// Generated from W:/Development/GitHub/goodscript/src/main/antlr4\Goodscript.g4 by ANTLR 4.10.1
package github.mrh0.goodscript.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoodscriptParser}.
 */
public interface GoodscriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code numberInt}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberInt(GoodscriptParser.NumberIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberInt}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberInt(GoodscriptParser.NumberIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberFloat(GoodscriptParser.NumberFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberFloat(GoodscriptParser.NumberFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberHex(GoodscriptParser.NumberHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberHex(GoodscriptParser.NumberHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberBin(GoodscriptParser.NumberBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link GoodscriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberBin(GoodscriptParser.NumberBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveNumber}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveNumber(GoodscriptParser.PrimitiveNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveNumber}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveNumber(GoodscriptParser.PrimitiveNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveBool}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveBool(GoodscriptParser.PrimitiveBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveBool}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveBool(GoodscriptParser.PrimitiveBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveString}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveString(GoodscriptParser.PrimitiveStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveString}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveString(GoodscriptParser.PrimitiveStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveChar}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveChar(GoodscriptParser.PrimitiveCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveChar}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveChar(GoodscriptParser.PrimitiveCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveAtom}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveAtom(GoodscriptParser.PrimitiveAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveAtom}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveAtom(GoodscriptParser.PrimitiveAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#unOp}.
	 * @param ctx the parse tree
	 */
	void enterUnOp(GoodscriptParser.UnOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#unOp}.
	 * @param ctx the parse tree
	 */
	void exitUnOp(GoodscriptParser.UnOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#binOp}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(GoodscriptParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#binOp}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(GoodscriptParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNest}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNest(GoodscriptParser.ExprNestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNest}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNest(GoodscriptParser.ExprNestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBinOp}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBinOp(GoodscriptParser.ExprBinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBinOp}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBinOp(GoodscriptParser.ExprBinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPrimitive}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrimitive(GoodscriptParser.ExprPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPrimitive}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrimitive(GoodscriptParser.ExprPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNamed}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNamed(GoodscriptParser.ExprNamedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNamed}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNamed(GoodscriptParser.ExprNamedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnOp}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnOp(GoodscriptParser.ExprUnOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnOp}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnOp(GoodscriptParser.ExprUnOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefine}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefine(GoodscriptParser.StatementDefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefine}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefine(GoodscriptParser.StatementDefineContext ctx);
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
	 * Enter a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(GoodscriptParser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(GoodscriptParser.StatementReturnContext ctx);
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
	 * Enter a parse tree produced by {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(GoodscriptParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(GoodscriptParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#funcPrefix}.
	 * @param ctx the parse tree
	 */
	void enterFuncPrefix(GoodscriptParser.FuncPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#funcPrefix}.
	 * @param ctx the parse tree
	 */
	void exitFuncPrefix(GoodscriptParser.FuncPrefixContext ctx);
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