package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRFunc
import github.mrh0.goodscript.ir.IRProgram
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone

class TProgram(location: Loc, val functions: MutableList<TFunc>) : Tok(location) {
    override fun process(i: CompileData): Pair<GsTypeBase, IIR> {
        val irs = functions.map { it.process(i).second as IRFunc }
        return Pair(GsTypeNone, IRProgram(location, irs))
    }

    override fun toString(): String {
        return "TProgram$functions"
    }
}