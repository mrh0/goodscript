package github.mrh0.goodscript.ast.token.data

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.numbers.GsTypeFloat
import github.mrh0.goodscript.types.numbers.GsTypeInt
import github.mrh0.goodscript.values.numbers.GsFloat
import github.mrh0.goodscript.values.numbers.GsInt

class TFloat(location: Loc, private val value: Double) : Tok(location) {
    override fun toString(): String {
        return "${value}f"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        return Pair(GsTypeFloat, IRValue(location, GsFloat(value)))
    }
}