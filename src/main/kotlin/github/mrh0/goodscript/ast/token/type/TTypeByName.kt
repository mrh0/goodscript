package github.mrh0.goodscript.ast.token.type

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.TDeadEnd
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRDeadEnd
import github.mrh0.goodscript.ir.IRNamed
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.BuiltInTypes
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.values.GsInt

class TTypeByName (location: Loc, val type: String) : Tok(location) {
    override fun toString() = "#$type"

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> = Pair(BuiltInTypes.getType(type), IRDeadEnd)
}