package github.mrh0.goodscript.ast

import github.mrh0.goodscript.antlr.GoodscriptBaseVisitor
import github.mrh0.goodscript.antlr.GoodscriptParser
import github.mrh0.goodscript.ast.token.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Token
import java.io.File


class Visitor(val file: File) : GoodscriptBaseVisitor<ITok>() {

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

    override fun visitFunc(ctx: GoodscriptParser.FuncContext): ITok {
        return TFunc(loc(ctx), cvisit(ctx.body), ctx.funcPrefix().text, ctx.name.text, tvisit(ctx.args))
    }

    override fun visitBlock(ctx: GoodscriptParser.BlockContext): ITok {
        return TBlock(loc(ctx), visit(ctx.statements));
    }

    override fun visitStatementReturn(ctx: GoodscriptParser.StatementReturnContext): ITok {
        return TStatementReturn(loc(ctx), visit(ctx.expr()))
    }

    override fun visitExprNest(ctx: GoodscriptParser.ExprNestContext): ITok {
        return visit(ctx.expr())
    }

    override fun visitNumberInt(ctx: GoodscriptParser.NumberIntContext): ITok {
        return TInteger(loc(ctx), Integer.valueOf(ctx.text))
    }

    override fun visitExprBinOp(ctx: GoodscriptParser.ExprBinOpContext): ITok {
        return when (ctx.binOp().text) {
            "+" -> TAdd(loc(ctx), visit(ctx.left), visit(ctx.right))
            else -> throw NotImplementedError("Binary Operator '${ctx.binOp().text}' is not implemented.")
        }
    }
}