package github.mrh0.goodscript.ast

import github.mrh0.goodscript.antlr.GoodscriptBaseVisitor
import github.mrh0.goodscript.antlr.GoodscriptParser
import github.mrh0.goodscript.ast.nodes.*
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

    override fun visitProgram(ctx: GoodscriptParser.ProgramContext): ITok {
        return TProgram(visit(ctx.functions), ctx.start, file)
    }

    override fun visitFunc(ctx: GoodscriptParser.FuncContext): ITok {
        return TFunction(cvisit(ctx.body), ctx.name.text, tvisit(ctx.args), ctx.start, file);
    }

    override fun visitBlock(ctx: GoodscriptParser.BlockContext): ITok {
        return TBlock(visit(ctx.statements), ctx.start, file);
    }

    override fun visitExprNest(ctx: GoodscriptParser.ExprNestContext): ITok {
        return visit(ctx.expr());
    }

    override fun visitStatementShortcall(ctx: GoodscriptParser.StatementShortcallContext): ITok {
        return visit(ctx.shortcall())
    }

    override fun visitExprShortcall(ctx: GoodscriptParser.ExprShortcallContext): ITok {
        return visit(ctx.shortcall())
    }

    override fun visitShortcallArg(ctx: GoodscriptParser.ShortcallArgContext): ITok {
        return TShortCallArg(ctx.name.text, visit(ctx.next), ctx.start, file)
    }

    override fun visitShortcallNoArg(ctx: GoodscriptParser.ShortcallNoArgContext): ITok {
        return TShortCallNoArg(ctx.name.text, ctx.start, file)
    }

    override fun visitNumberInt(ctx: GoodscriptParser.NumberIntContext): ITok {
        return TInteger(Integer.valueOf(ctx.text), ctx.start, file)
    }
}