package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsTypeError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.binop.add.IRAddIntInt
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.types.GsTypeBase

class TAdd(location: Loc, val left: ITok, val right: ITok) : Tok(location) {
    override fun toString(): String {
        return "($left + $right)"
    }

    override fun process(i: CompileData): Pair<GsTypeBase, IIR> {
        val l = left.process(i);
        val r = right.process(i);
        return when {
            l.first is GsTypeInt && r.first is GsTypeInt -> Pair(GsTypeInt, IRAddIntInt(location, l.second, r.second))
            else -> throw GsTypeError("+", l.first, r.first)
        }
    }
}
