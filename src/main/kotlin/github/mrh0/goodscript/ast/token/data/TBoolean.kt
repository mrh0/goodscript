package github.mrh0.goodscript.ast.token.data

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeBool
import github.mrh0.goodscript.values.GsBool

class TBoolean(location: Loc, private val value: Boolean) : Tok(location) {
    override fun toString(): String {
        return "$value"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        return GsTypeBool to IRValue(location, GsBool(value))
    }
}