package github.mrh0.goodscript.ast.token.function

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.TDeadEnd
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ast.token.type.TType
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRNamed
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.values.GsInt

class TArgument (location: Loc, val name: String, val type: TType) : Tok(location) {
    override fun toString(): String {
        return "$name:$type"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> = TDeadEnd.process(cd)
}