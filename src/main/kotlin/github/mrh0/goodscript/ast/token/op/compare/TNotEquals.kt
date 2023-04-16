package github.mrh0.goodscript.ast.token.op.compare

import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsOpTypeError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.compare.equals.IREqualsIntInt
import github.mrh0.goodscript.ir.compare.not_equals.IRNotEqualsIntInt
import github.mrh0.goodscript.types.GsTypeInt
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
            else -> throw GsOpTypeError(location, "!=", l.first, r.first)
        }
    }
}
