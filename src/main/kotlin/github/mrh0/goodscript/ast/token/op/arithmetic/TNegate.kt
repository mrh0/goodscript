package github.mrh0.goodscript.ast.token.op.arithmetic

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsOpTypeError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.binop.arithmetic.negate.IRNegateInt
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeInt

class TNegate(location: Loc, val expr: ITok) : Tok(location) {
    override fun toString(): String {
        return "TNegate($expr)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val e = expr.process(cd);
        return when (e.first) {
            is GsTypeInt -> Pair(GsTypeInt, IRNegateInt(location, e.second))
            else -> throw GsOpTypeError("-", e.first)
        }
    }
}
