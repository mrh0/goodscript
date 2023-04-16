package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRStatementDefine
import github.mrh0.goodscript.ir.IRStatementReturn
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsValueNone

class TStatementDefine(location: Loc, private val varName: String, private val expr: ITok) : Tok(location) {
    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val ir = expr.process(cd)
        val index = cd.ctx().define(location, ir.first, GsValueNone, varName)
        return Pair(ir.first, IRStatementDefine(location, index, ir.second))
    }

    override fun toString(): String {
        return "TDefine($expr)"
    }
}