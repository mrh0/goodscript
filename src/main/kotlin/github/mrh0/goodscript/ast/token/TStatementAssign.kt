package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRStatementAssign
import github.mrh0.goodscript.types.GsTypeBase

class TStatementAssign(location: Loc, private val varName: String, private val expr: ITok) : Tok(location) {
    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val ir = expr.process(cd)
        val index = cd.ctx().assign(varName, ir.first)
        return Pair(ir.first, IRStatementAssign(location, index, ir.second))
    }

    override fun toString(): String {
        return "TAssign($expr)"
    }
}