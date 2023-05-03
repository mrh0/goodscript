package github.mrh0.goodscript.ast.token.branch

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.branch.IRStatementIf
import github.mrh0.goodscript.ir.branch.IRStatementIfElse
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeBool
import github.mrh0.goodscript.types.GsTypeNone

class TStatementIf(location: Loc, private val conditions: List<ITok>, private val bodies: List<ITok>, private val elseBody: ITok?) : Tok(location) {
    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val conditionPairs = conditions.map { it.process(cd) }
        conditionPairs.forEach { if(it.first != GsTypeBool) throw GsError(location, "Expected if statement condition to be a boolean.") }
        val conditionIRs = conditionPairs.map { it.second }
        val bodyIRs = bodies.map { it.process(cd).second }

        if(elseBody != null) {
            return Pair(GsTypeNone, IRStatementIfElse(location, conditionIRs, bodyIRs, elseBody.process(cd).second))
        }
        return Pair(GsTypeNone, IRStatementIf(location, conditionIRs, bodyIRs))
    }

    override fun toString(): String {
        return "TIf($conditions, $bodies, else: $elseBody)"
    }
}
