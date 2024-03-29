package github.mrh0.goodscript.ast.token.data

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.numbers.GsTypeInt
import github.mrh0.goodscript.values.numbers.GsInt

class TInteger(location: Loc, private val value: Int) : Tok(location) {
    override fun toString(): String {
        return "${value}i"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        return GsTypeInt to IRValue(location, GsInt(value))
    }
}