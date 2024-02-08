package github.mrh0.goodscript.ast.token.op.compare

import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.compare.not_equals.IRNotEqualsFallback
import github.mrh0.goodscript.ir.compare.not_equals.IRNotEqualsIntInt
import github.mrh0.goodscript.types.numbers.GsTypeInt
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeBool

class TNotEquals(location: Loc, private val left: ITok, private val right: ITok) : Tok(location) {
    override fun toString(): String {
        return "($left != $right)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val l = left.process(cd);
        val r = right.process(cd);
        return when {
            l.first is GsTypeInt && r.first is GsTypeInt -> Pair(GsTypeBool, IRNotEqualsIntInt(location, l.second, r.second))
            else -> Pair(GsTypeBool, IRNotEqualsFallback(location, l.second, r.second))
        }
    }
}
