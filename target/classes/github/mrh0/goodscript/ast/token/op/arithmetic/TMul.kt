package github.mrh0.goodscript.ast.token.op.arithmetic

import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsOpTypeError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.arithmetic.add.IRAddIntInt
import github.mrh0.goodscript.ir.arithmetic.add.IRAddStringWithAny
import github.mrh0.goodscript.types.numbers.GsTypeInt
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeString

class TMul(location: Loc, val left: ITok, val right: ITok) : Tok(location) {
    override fun toString(): String {
        return "($left * $right)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val l = left.process(cd);
        val r = right.process(cd);
        return when {
            else -> throw GsOpTypeError(location, "*", l.first, r.first)
        }
    }
}
