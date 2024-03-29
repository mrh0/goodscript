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
	 * Visit a parse tree produced by the {@code primitiveNumber}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveNumber(GoodscriptParser.PrimitiveNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveBool}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveBool(GoodscriptParser.PrimitiveBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveString}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveString(GoodscriptParser.PrimitiveStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveChar}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveChar(GoodscriptParser.PrimitiveCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveAtom}
	 * labeled alternative in {@link GoodscriptParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveAtom(GoodscriptParser.PrimitiveAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GoodscriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#unOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnOp(GoodscriptParser.UnOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#binOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(GoodscriptParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaNoArgs}
	 * labeled alternative in {@link GoodscriptParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaNoArgs(GoodscriptParser.LambdaNoArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaArgs}
	 * labeled alternative in {@link GoodscriptParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaArgs(GoodscriptParser.LambdaArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNest}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNest(GoodscriptParser.ExprNestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInlineIf}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInlineIf(GoodscriptParser.ExprInlineIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprHere}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprHere(GoodscriptParser.ExprHereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNamed}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNamed(GoodscriptParser.ExprNamedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLambda}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLambda(GoodscriptParser.ExprLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAs}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAs(GoodscriptParser.ExprAsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBinOp}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBinOp(GoodscriptParser.ExprBinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAccessor}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAccessor(GoodscriptParser.ExprAccessorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIs}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIs(GoodscriptParser.ExprIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTuple}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTuple(GoodscriptParser.ExprTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprCallFunction}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCallFunction(GoodscriptParser.ExprCallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPrimitive}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrimitive(GoodscriptParser.ExprPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAccessName}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAccessName(GoodscriptParser.ExprAccessNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIsNot}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIsNot(GoodscriptParser.ExprIsNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprUnOp}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnOp(GoodscriptParser.ExprUnOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeUnion}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeUnion(GoodscriptParser.TypeUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeTuple}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTuple(GoodscriptParser.TypeTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeByName}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeByName(GoodscriptParser.TypeByNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeCallSignature}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCallSignature(GoodscriptParser.TypeCallSignatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeNest}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNest(GoodscriptParser.TypeNestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentTyped}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentTyped(GoodscriptParser.ArgumentTypedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentPrimitive}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentPrimitive(GoodscriptParser.ArgumentPrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argumentWildcard}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentWildcard(GoodscriptParser.ArgumentWildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#orderExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExpression(GoodscriptParser.OrderExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallWithArgs}
	 * labeled alternative in {@link GoodscriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallWithArgs(GoodscriptParser.FunctionCallWithArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallNoArgs}
	 * labeled alternative in {@link GoodscriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallNoArgs(GoodscriptParser.FunctionCallNoArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefine}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefine(GoodscriptParser.StatementDefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefineDestructureTuple}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefineDestructureTuple(GoodscriptParser.StatementDefineDestructureTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefineConst}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefineConst(GoodscriptParser.StatementDefineConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefineConstDestructureTuple}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefineConstDestructureTuple(GoodscriptParser.StatementDefineConstDestructureTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssignment}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(GoodscriptParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(GoodscriptParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(GoodscriptParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(GoodscriptParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(GoodscriptParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementForIn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementForIn(GoodscriptParser.StatementForInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementCallFunction}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementCallFunction(GoodscriptParser.StatementCallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementCallFunctionReturn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementCallFunctionReturn(GoodscriptParser.StatementCallFunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(GoodscriptParser.StatementReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseModule(GoodscriptParser.UseModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useAllFromModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseAllFromModule(GoodscriptParser.UseAllFromModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useFromModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseFromModule(GoodscriptParser.UseFromModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoodscriptParser#funcPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncPrefix(GoodscriptParser.FuncPrefixContext ctx);
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