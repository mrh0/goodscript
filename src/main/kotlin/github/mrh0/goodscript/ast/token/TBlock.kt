package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRBlock
import github.mrh0.goodscript.ir.IRStatement
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.types.GsTypeNone

class TBlock(val statements: MutableList<TStatement>, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "$statements"
    }

    override fun process(cd: CompileData): Pair<GsType, IIR> {
        val ir = statements.map { it.process(cd).second as IRStatement }
        return Pair(GsTypeNone, IRBlock(location, ir))
    }
}