package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.values.GsInt

class TInteger(location: Loc, val value: Int) : Tok(location) {
    override fun toString(): String {
        return "${value}i"
    }

    override fun process(i: CompileData): Pair<GsTypeBase, IIR> {
        return Pair(GsTypeInt, IRValue(location, GsInt(value)))
    }
}