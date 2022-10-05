package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRStatementReturn
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.types.GsTypeNone

class TStatementReturn(location: Loc, val next: ITok) : Tok(location) {
    override fun process(cd: CompileData): Pair<GsType, IIR> {
        val ir = next.process(cd)
        return Pair(ir.first, IRStatementReturn(location, ir.second))
    }

    override fun toString(): String {
        return "TRet($next)"
    }
}