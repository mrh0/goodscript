package github.mrh0.goodscript.ast.token.loop

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.loop.IRStatementWhile
import github.mrh0.goodscript.ir.loop.IRStatementWhileElse
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone

class TStatementWhile(location: Loc, private val condition: ITok, private val body: ITok, private val elseBody: ITok?) : Tok(location) {
    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val conditionIR = condition.process(cd)
        val bodyIR = body.process(cd)

        if(elseBody != null) {
            return Pair(GsTypeNone, IRStatementWhileElse(location, conditionIR.second, bodyIR.second, elseBody.process(cd).second))
        }
        return Pair(GsTypeNone, IRStatementWhile(location, conditionIR.second, bodyIR.second))
    }

    override fun toString(): String {
        return "TWhile($condition, $body, else: $elseBody)"
    }
}
