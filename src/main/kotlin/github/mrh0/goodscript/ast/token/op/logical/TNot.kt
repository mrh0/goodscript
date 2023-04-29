package github.mrh0.goodscript.ast.token.op.logical

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsOpTypeError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.logical.not.IRNotBool
import github.mrh0.goodscript.ir.logical.not.IRNotInt
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeBool
import github.mrh0.goodscript.types.numbers.GsTypeInt

class TNot(location: Loc, val expr: ITok) : Tok(location) {
    override fun toString(): String {
        return "TNot($expr)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val e = expr.process(cd);
        return when (e.first) {
            is GsTypeBool -> Pair(GsTypeBool, IRNotBool(location, e.second))
            is GsTypeInt -> Pair(GsTypeBool, IRNotInt(location, e.second))
            else -> throw GsOpTypeError(location, "!", e.first)
        }
    }
}
