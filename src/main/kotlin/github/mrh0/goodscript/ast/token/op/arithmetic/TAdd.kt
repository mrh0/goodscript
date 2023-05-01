package github.mrh0.goodscript.ast.token.op.arithmetic

import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsOpTypeError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.arithmetic.add.IRAddIntInt
import github.mrh0.goodscript.ir.arithmetic.add.IRAddNumbers
import github.mrh0.goodscript.ir.arithmetic.add.IRAddStringWithAny
import github.mrh0.goodscript.types.numbers.GsTypeInt
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeString
import github.mrh0.goodscript.types.numbers.GsTypeFloat
import github.mrh0.goodscript.types.numbers.GsTypeNumber

class TAdd(location: Loc, val left: ITok, val right: ITok) : Tok(location) {
    override fun toString(): String {
        return "($left + $right)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val l = left.process(cd);
        val r = right.process(cd);
        return when {
            // Numbers
            l.first is GsTypeInt && r.first is GsTypeInt -> Pair(GsTypeInt, IRAddIntInt(location, l.second, r.second))
            l.first is GsTypeNumber || r.first is GsTypeNumber -> Pair(GsTypeFloat, IRAddNumbers(location, l.second, r.second))
            // Strings
            l.first is GsTypeString || r.first is GsTypeString -> Pair(GsTypeString, IRAddStringWithAny(location, l.second, r.second))
            else -> throw GsOpTypeError(location, "+", l.first, r.first)
        }
    }
}
