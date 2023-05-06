package github.mrh0.goodscript.ast.token.data

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeString
import github.mrh0.goodscript.values.GsString

class TString(location: Loc, private val value: String) : Tok(location) {
    override fun toString(): String {
        return "'${value}'"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        return GsTypeString to IRValue(location, GsString(value))
    }
}