package github.mrh0.goodscript.ast

import github.mrh0.goodscript.antlr.GoodscriptBaseVisitor
import github.mrh0.goodscript.antlr.GoodscriptParser
import github.mrh0.goodscript.ast.token.*
import github.mrh0.goodscript.ast.token.branch.TInlineIf
import github.mrh0.goodscript.ast.token.branch.TStatementIf
import github.mrh0.goodscript.ast.token.data.*
import github.mrh0.goodscript.ast.token.function.TArgument
import github.mrh0.goodscript.ast.token.function.TExprCall
import github.mrh0.goodscript.ast.token.function.TFunc
import github.mrh0.goodscript.ast.token.function.TStatementCall
import github.mrh0.goodscript.ast.token.loop.TStatementBreak
import github.mrh0.goodscript.ast.token.loop.TStatementContinue
import github.mrh0.goodscript.ast.token.loop.TStatementWhile
import github.mrh0.goodscript.ast.token.op.arithmetic.TAdd
import github.mrh0.goodscript.ast.token.op.arithmetic.TNegate
import github.mrh0.goodscript.ast.token.op.arithmetic.TSub
import github.mrh0.goodscript.ast.token.op.compare.TEquals
import github.mrh0.goodscript.ast.token.op.compare.TNotEquals
import github.mrh0.goodscript.ast.token.op.logical.TNot
import github.mrh0.goodscript.ast.token.op.logical.TNotNot
import github.mrh0.goodscript.ast.token.type.TTypeByName
import github.mrh0.goodscript.ast.use.TUseAllFromModule
import github.mrh0.goodscript.ast.use.TUseFromModule
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Token
import java.io.File


class Visitor(private val file: File) : GoodscriptBaseVisitor<ITok>() {

    fun <T : ParserRuleContext, O : ITok?> visit(list: MutableList<T>): MutableList<O> {
        val t: MutableList<O> = mutableListOf()
        for (pt in list) t.add(visit(pt) as O)
        return t
    }

    fun <T : Token?> tvisit(list: MutableList<T>): MutableList<String> {
        val t: MutableList<String> = mutableListOf()
        for (pt in list) pt?.text
        return t
    }

    fun <T : ParserRuleContext, O : ITok?> cvisit(rule: T?): O {
        return if (rule == null) throw Exception("Undefined rule.") else visit(rule) as O
    }

    fun loc(ctx: ParserRuleContext) = Loc(ctx.start, file)

    // Program
    override fun visitProgram(ctx: GoodscriptParser.ProgramContext): ITok = TProgram(loc(ctx), visit(ctx.functions), visit(ctx.use()))

    // Use
    override fun visitUseFromModule(ctx: GoodscriptParser.UseFromModuleContext): ITok {
        return TUseFromModule(loc(ctx), ctx.exports.map { it.text }, ctx.from.text.substring(1, ctx.from.text.length-1))
    }

    override fun visitUseAllFromModule(ctx: GoodscriptParser.UseAllFromModuleContext): ITok {
        return TUseAllFromModule(loc(ctx), ctx.from.text.substring(1, ctx.from.text.length-1))
    }

    // Types
    override fun visitTypeByName(ctx: GoodscriptParser.TypeByNameContext): ITok = TTypeByName(loc(ctx), ctx.text)

    // Functions
    override fun visitFunc(ctx: GoodscriptParser.FuncContext): ITok {
        return TFunc(loc(ctx), cvisit(ctx.body), ctx.funcPrefix()?.text ?: "", ctx.name.text, visit(ctx.args), visit(ctx.returnType))
    }

    override fun visitBlock(ctx: GoodscriptParser.BlockContext): ITok = TBlock(loc(ctx), visit(ctx.statements))

    override fun visitStatementReturn(ctx: GoodscriptParser.StatementReturnContext): ITok {
        return TStatementReturn(loc(ctx), visit(ctx.expr()))
    }

    override fun visitArgumentTyped(ctx: GoodscriptParser.ArgumentTypedContext): ITok {
        return TArgument(loc(ctx), ctx.NAME().text, visit(ctx.type()) as TTypeByName)
    }

    override fun visitFunctionCallNoArgs(ctx: GoodscriptParser.FunctionCallNoArgsContext): ITok = TStatementCall(loc(ctx), ctx.NAME().text, arrayListOf())
    override fun visitFunctionCallWithArgs(ctx: GoodscriptParser.FunctionCallWithArgsContext): ITok = TStatementCall(loc(ctx), ctx.NAME().text, visit(ctx.args))

    override fun visitStatementCallFunction(ctx: GoodscriptParser.StatementCallFunctionContext): ITok = visit(ctx.functionCall())
    override fun visitStatementCallFunctionReturn(ctx: GoodscriptParser.StatementCallFunctionReturnContext): ITok = TStatementReturn(loc(ctx), visit(ctx.functionCall()))

    override fun visitExprCallFunction(ctx: GoodscriptParser.ExprCallFunctionContext): ITok = TExprCall(loc(ctx), ctx.NAME().text, visit(ctx.args))

    // Expressions
    override fun visitExprNest(ctx: GoodscriptParser.ExprNestContext): ITok = visit(ctx.expr())
    override fun visitExprHere(ctx: GoodscriptParser.ExprHereContext): ITok = THere(loc(ctx))

    // Primitives
    override fun visitNumberInt(ctx: GoodscriptParser.NumberIntContext): ITok = TInteger(loc(ctx), Integer.valueOf(ctx.text))
    override fun visitNumberBin(ctx: GoodscriptParser.NumberBinContext): ITok = TInteger(loc(ctx), ctx.text.substring(2).toInt(2))
    override fun visitNumberHex(ctx: GoodscriptParser.NumberHexContext): ITok = TInteger(loc(ctx), Integer.decode(ctx.text))
    override fun visitNumberFloat(ctx: GoodscriptParser.NumberFloatContext): ITok = TFloat(loc(ctx), ctx.text.toDouble())
    override fun visitPrimitiveBool(ctx: GoodscriptParser.PrimitiveBoolContext): ITok = TBoolean(loc(ctx), ctx.BOOL().text == "true")
    override fun visitPrimitiveString(ctx: GoodscriptParser.PrimitiveStringContext): ITok = TString(loc(ctx), ctx.text.substring(1, ctx.text.length-1))
    override fun visitPrimitiveAtom(ctx: GoodscriptParser.PrimitiveAtomContext): ITok = TAtom(loc(ctx), ctx.text.substring(1).lowercase())

    //Natives
    override fun visitExprTuple(ctx: GoodscriptParser.ExprTupleContext): ITok = TTuple(loc(ctx), visit(ctx.values))

    // Ops
    override fun visitExprBinOp(ctx: GoodscriptParser.ExprBinOpContext): ITok = when (ctx.binOp().text) {
        "+" -> TAdd(loc(ctx), visit(ctx.left), visit(ctx.right))
        "-" -> TSub(loc(ctx), visit(ctx.left), visit(ctx.right))

        "==" -> TEquals(loc(ctx), visit(ctx.left), visit(ctx.right))
        "!=" -> TNotEquals(loc(ctx), visit(ctx.left), visit(ctx.right))
        else -> throw NotImplementedError("Binary Operator '${ctx.binOp().text}' is not implemented.")
    }

    override fun visitExprUnOp(ctx: GoodscriptParser.ExprUnOpContext): ITok = when (ctx.unOp().text) {
        "-" -> TNegate(loc(ctx), visit(ctx.expr()))
        "!!" -> TNotNot(loc(ctx), visit(ctx.expr()))
        "!", "not" -> TNot(loc(ctx), visit(ctx.expr()))
        else -> throw NotImplementedError("Unary Operator '${ctx.unOp().text}' is not implemented.")
    }

    // Variable
    override fun visitStatementDefine(ctx: GoodscriptParser.StatementDefineContext): ITok = TStatementDefine(loc(ctx), ctx.NAME().text, visit(ctx.expr()))
    override fun visitStatementAssignment(ctx: GoodscriptParser.StatementAssignmentContext): ITok = TStatementAssign(loc(ctx), ctx.NAME().text, visit(ctx.expr()))
    override fun visitExprNamed(ctx: GoodscriptParser.ExprNamedContext): ITok = TNamed(loc(ctx), ctx.NAME().text)

    // Branches
    override fun visitStatementIf(ctx: GoodscriptParser.StatementIfContext): ITok {
        return TStatementIf(loc(ctx), visit(ctx.conditions), visit(ctx.bodies), if(ctx.elseBody == null) null else visit(ctx.elseBody))
    }

    override fun visitExprInlineIf(ctx: GoodscriptParser.ExprInlineIfContext): ITok {
        return TInlineIf(loc(ctx), visit(ctx.condition), visit(ctx.body), visit(ctx.elseBody))
    }

    // Loops
    override fun visitStatementWhile(ctx: GoodscriptParser.StatementWhileContext): ITok {
        return TStatementWhile(loc(ctx), visit(ctx.condition), visit(ctx.body), if(ctx.elseBody == null) null else visit(ctx.elseBody))
    }

    override fun visitStatementContinue(ctx: GoodscriptParser.StatementContinueContext): ITok = TStatementContinue(loc(ctx))
    override fun visitStatementBreak(ctx: GoodscriptParser.StatementBreakContext): ITok = TStatementBreak(loc(ctx))
}