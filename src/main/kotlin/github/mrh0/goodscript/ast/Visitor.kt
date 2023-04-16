package github.mrh0.goodscript.ast

import github.mrh0.goodscript.antlr.GoodscriptBaseVisitor
import github.mrh0.goodscript.antlr.GoodscriptParser
import github.mrh0.goodscript.ast.token.*
import github.mrh0.goodscript.ast.token.branch.TStatementIf
import github.mrh0.goodscript.ast.token.data.TBoolean
import github.mrh0.goodscript.ast.token.data.TInteger
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

    override fun visitProgram(ctx: GoodscriptParser.ProgramContext): ITok {
        return TProgram(loc(ctx), visit(ctx.functions))
    }

    // Functions
    override fun visitFunc(ctx: GoodscriptParser.FuncContext): ITok {
        return TFunc(loc(ctx), cvisit(ctx.body), ctx.funcPrefix().text, ctx.name.text, tvisit(ctx.args))
    }

    override fun visitBlock(ctx: GoodscriptParser.BlockContext): ITok {
        return TBlock(loc(ctx), visit(ctx.statements));
    }

    override fun visitStatementReturn(ctx: GoodscriptParser.StatementReturnContext): ITok {
        return TStatementReturn(loc(ctx), visit(ctx.expr()))
    }

    // Expressions
    override fun visitExprNest(ctx: GoodscriptParser.ExprNestContext): ITok {
        return visit(ctx.expr())
    }

    // Primitives
    override fun visitNumberInt(ctx: GoodscriptParser.NumberIntContext): ITok {
        return TInteger(loc(ctx), Integer.valueOf(ctx.text))
    }

    override fun visitPrimitiveBool(ctx: GoodscriptParser.PrimitiveBoolContext): ITok {
        return TBoolean(loc(ctx), ctx.BOOL().text == "true")
    }

    // Ops
    override fun visitExprBinOp(ctx: GoodscriptParser.ExprBinOpContext): ITok {
        return when (ctx.binOp().text) {
            "+" -> TAdd(loc(ctx), visit(ctx.left), visit(ctx.right))
            "-" -> TSub(loc(ctx), visit(ctx.left), visit(ctx.right))

            "==" -> TEquals(loc(ctx), visit(ctx.left), visit(ctx.right))
            "!=" -> TNotEquals(loc(ctx), visit(ctx.left), visit(ctx.right))
            else -> throw NotImplementedError("Binary Operator '${ctx.binOp().text}' is not implemented.")
        }
    }

    override fun visitExprUnOp(ctx: GoodscriptParser.ExprUnOpContext): ITok {
        return when (ctx.unOp().text) {
            "-" -> TNegate(loc(ctx), visit(ctx.expr()))
            "!!" -> TNotNot(loc(ctx), visit(ctx.expr()))
            "!", "not" -> TNot(loc(ctx), visit(ctx.expr()))
            else -> throw NotImplementedError("Unary Operator '${ctx.unOp().text}' is not implemented.")
        }
    }

    // Variable
    override fun visitStatementDefine(ctx: GoodscriptParser.StatementDefineContext): ITok {
        return TStatementDefine(loc(ctx), ctx.NAME().text, visit(ctx.expr()))
    }

    override fun visitExprNamed(ctx: GoodscriptParser.ExprNamedContext): ITok {
        return TNamed(loc(ctx), ctx.NAME().text)
    }

    override fun visitStatementAssignment(ctx: GoodscriptParser.StatementAssignmentContext): ITok {
        return TStatementAssign(loc(ctx), ctx.NAME().text, visit(ctx.expr()))
    }

    // Branches
    override fun visitStatementIf(ctx: GoodscriptParser.StatementIfContext): ITok {
        return TStatementIf(loc(ctx), visit(ctx.conditions), visit(ctx.bodies), if(ctx.elseBody == null) null else visit(ctx.elseBody))
    }

    // Loops
    override fun visitStatementWhile(ctx: GoodscriptParser.StatementWhileContext): ITok {
        return TStatementWhile(loc(ctx), visit(ctx.condition), visit(ctx.body), if(ctx.elseBody == null) null else visit(ctx.elseBody))
    }

    override fun visitStatementContinue(ctx: GoodscriptParser.StatementContinueContext): ITok {
        return TStatementContinue(loc(ctx))
    }

    override fun visitStatementBreak(ctx: GoodscriptParser.StatementBreakContext): ITok {
        return TStatementBreak(loc(ctx))
    }
}