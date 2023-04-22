package github.mrh0.goodscript.ast

import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.types.GsTypeBase

object TDeadEnd : Tok(Loc.IDENTITY) {
    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        throw Exception("Processing dead end should not occur")
    }
}