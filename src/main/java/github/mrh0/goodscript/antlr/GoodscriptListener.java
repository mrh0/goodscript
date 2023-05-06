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
	 * Enter a parse tree produced by the {@code exprInlineIf}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInlineIf(GoodscriptParser.ExprInlineIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprInlineIf}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInlineIf(GoodscriptParser.ExprInlineIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprHere}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprHere(GoodscriptParser.ExprHereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprHere}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprHere(GoodscriptParser.ExprHereContext ctx);
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
	 * Enter a parse tree produced by the {@code exprAs}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAs(GoodscriptParser.ExprAsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAs}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAs(GoodscriptParser.ExprAsContext ctx);
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
	 * Enter a parse tree produced by the {@code exprAccessor}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAccessor(GoodscriptParser.ExprAccessorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAccessor}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAccessor(GoodscriptParser.ExprAccessorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIs}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIs(GoodscriptParser.ExprIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIs}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIs(GoodscriptParser.ExprIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTuple}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTuple(GoodscriptParser.ExprTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTuple}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTuple(GoodscriptParser.ExprTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCallFunction}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCallFunction(GoodscriptParser.ExprCallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCallFunction}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCallFunction(GoodscriptParser.ExprCallFunctionContext ctx);
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
	 * Enter a parse tree produced by the {@code exprAccessName}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAccessName(GoodscriptParser.ExprAccessNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAccessName}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAccessName(GoodscriptParser.ExprAccessNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIsNot}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIsNot(GoodscriptParser.ExprIsNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIsNot}
	 * labeled alternative in {@link GoodscriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIsNot(GoodscriptParser.ExprIsNotContext ctx);
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
	 * Enter a parse tree produced by the {@code typeUnion}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeUnion(GoodscriptParser.TypeUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeUnion}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeUnion(GoodscriptParser.TypeUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeTuple}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeTuple(GoodscriptParser.TypeTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeTuple}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeTuple(GoodscriptParser.TypeTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeByName}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeByName(GoodscriptParser.TypeByNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeByName}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeByName(GoodscriptParser.TypeByNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeCallSignature}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeCallSignature(GoodscriptParser.TypeCallSignatureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeCallSignature}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeCallSignature(GoodscriptParser.TypeCallSignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeNest}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeNest(GoodscriptParser.TypeNestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeNest}
	 * labeled alternative in {@link GoodscriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeNest(GoodscriptParser.TypeNestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentTyped}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentTyped(GoodscriptParser.ArgumentTypedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentTyped}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentTyped(GoodscriptParser.ArgumentTypedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentPrimitive}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentPrimitive(GoodscriptParser.ArgumentPrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentPrimitive}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentPrimitive(GoodscriptParser.ArgumentPrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentWildcard}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentWildcard(GoodscriptParser.ArgumentWildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentWildcard}
	 * labeled alternative in {@link GoodscriptParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentWildcard(GoodscriptParser.ArgumentWildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoodscriptParser#orderExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderExpression(GoodscriptParser.OrderExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoodscriptParser#orderExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderExpression(GoodscriptParser.OrderExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallWithArgs}
	 * labeled alternative in {@link GoodscriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallWithArgs(GoodscriptParser.FunctionCallWithArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallWithArgs}
	 * labeled alternative in {@link GoodscriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallWithArgs(GoodscriptParser.FunctionCallWithArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallNoArgs}
	 * labeled alternative in {@link GoodscriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallNoArgs(GoodscriptParser.FunctionCallNoArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallNoArgs}
	 * labeled alternative in {@link GoodscriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallNoArgs(GoodscriptParser.FunctionCallNoArgsContext ctx);
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
	 * Enter a parse tree produced by the {@code statementDefineDestructureTuple}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefineDestructureTuple(GoodscriptParser.StatementDefineDestructureTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefineDestructureTuple}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefineDestructureTuple(GoodscriptParser.StatementDefineDestructureTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefineConst}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefineConst(GoodscriptParser.StatementDefineConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefineConst}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefineConst(GoodscriptParser.StatementDefineConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefineConstDestructureTuple}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefineConstDestructureTuple(GoodscriptParser.StatementDefineConstDestructureTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefineConstDestructureTuple}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefineConstDestructureTuple(GoodscriptParser.StatementDefineConstDestructureTupleContext ctx);
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
	 * Enter a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(GoodscriptParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBreak}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(GoodscriptParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinue(GoodscriptParser.StatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementContinue}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinue(GoodscriptParser.StatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(GoodscriptParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(GoodscriptParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(GoodscriptParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(GoodscriptParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementForIn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementForIn(GoodscriptParser.StatementForInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementForIn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementForIn(GoodscriptParser.StatementForInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementCallFunction}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementCallFunction(GoodscriptParser.StatementCallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementCallFunction}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementCallFunction(GoodscriptParser.StatementCallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementCallFunctionReturn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementCallFunctionReturn(GoodscriptParser.StatementCallFunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementCallFunctionReturn}
	 * labeled alternative in {@link GoodscriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementCallFunctionReturn(GoodscriptParser.StatementCallFunctionReturnContext ctx);
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
	 * Enter a parse tree produced by the {@code useModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUseModule(GoodscriptParser.UseModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUseModule(GoodscriptParser.UseModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useAllFromModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUseAllFromModule(GoodscriptParser.UseAllFromModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useAllFromModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUseAllFromModule(GoodscriptParser.UseAllFromModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useFromModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUseFromModule(GoodscriptParser.UseFromModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useFromModule}
	 * labeled alternative in {@link GoodscriptParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUseFromModule(GoodscriptParser.UseFromModuleContext ctx);
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