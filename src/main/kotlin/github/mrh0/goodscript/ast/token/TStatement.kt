package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.types.GsType

class TStatement(location: Loc) : Tok(location) {
    override fun process(i: CompileData): Pair<GsType, IIR> {
        TODO("Not yet implemented")
    }
}