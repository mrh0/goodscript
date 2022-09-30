package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Index
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsTypeError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.binop.add.IRAddIntInt
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.types.GsType

class TAdd(location: Loc, val left: ITok, val right: ITok) : Tok(location) {
    override fun toString(): String {
        return "?+?"
    }

    override fun process(i: Index): Pair<GsType, IIR> {
        val l = left.process(i);
        val r = right.process(i);
        return when {
            l.first is GsTypeInt && r.first is GsTypeInt -> Pair(GsTypeInt, IRAddIntInt(location))
            else -> throw GsTypeError("+", l.first, r.first)
        }
    }
}
