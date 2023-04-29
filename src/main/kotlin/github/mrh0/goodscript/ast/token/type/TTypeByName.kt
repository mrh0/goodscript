package github.mrh0.goodscript.ast.token.type

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRDeadEnd
import github.mrh0.goodscript.types.BuiltInTypes
import github.mrh0.goodscript.types.GsTypeBase

class TTypeByName (location: Loc, val type: String) : Tok(location) {
    override fun toString() = "#$type"

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> = Pair(BuiltInTypes.getType(type), IRDeadEnd)
}