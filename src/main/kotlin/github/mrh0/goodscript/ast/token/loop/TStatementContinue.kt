package github.mrh0.goodscript.ast.token.loop

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.loop.IRBreak
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone

class TStatementContinue (location: Loc) : Tok(location) {
    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        return Pair(GsTypeNone, IRBreak(location))
    }

    override fun toString(): String {
        return "TContinue"
    }
}
