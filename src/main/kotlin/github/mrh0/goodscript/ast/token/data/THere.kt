package github.mrh0.goodscript.ast.token.data

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeString
import github.mrh0.goodscript.types.GsTypeTuple
import github.mrh0.goodscript.types.numbers.GsTypeInt

class THere(location: Loc) : Tok(location) {
    override fun toString(): String {
        return "THere"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        return GsTypeTuple(arrayOf(GsTypeInt, GsTypeInt, GsTypeString)) to IRValue(location, location.asTuple())
    }
}