package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRBlock
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone

class TBlock(location: Loc, val statements: MutableList<ITok>) : Tok(location) {
    override fun toString(): String {
        return "$statements"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val ir = statements.map { it.process(cd).second }
        return Pair(GsTypeNone, IRBlock(location, ir))
    }
}