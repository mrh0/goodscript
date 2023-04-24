package github.mrh0.goodscript.ast.token.function

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.TDeadEnd
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ast.token.type.TTypeByName
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRDeadEnd
import github.mrh0.goodscript.types.GsTypeBase

class TArgument (location: Loc, val name: String, val type: TTypeByName) : Tok(location) {
    override fun toString() = "$name:$type"

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> = Pair(type.process(cd).first, IRDeadEnd)
}