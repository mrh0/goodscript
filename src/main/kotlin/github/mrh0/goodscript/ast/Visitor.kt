package github.mrh0.goodscript.ast

import github.mrh0.goodscript.antlr.GoodscriptBaseVisitor
import github.mrh0.goodscript.antlr.GoodscriptParser
import github.mrh0.goodscript.ast.nodes.*
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Token


class Visitor : GoodscriptBaseVisitor<ITok>() {

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
        return TProgram(visit(ctx.functions))
    }

    override fun visitFunc(ctx: GoodscriptParser.FuncContext): ITok {
        return TFunction(cvisit(ctx.body));
    }

    override fun visitStatementAssignment(ctx: GoodscriptParser.StatementAssignmentContext): ITok {
        return TStatement() //TODO
    }

    override fun visitBlock(ctx: GoodscriptParser.BlockContext): ITok {
        return TBlock(visit(ctx.statements));
    }

}