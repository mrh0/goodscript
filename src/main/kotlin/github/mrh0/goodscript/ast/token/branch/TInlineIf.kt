package github.mrh0.goodscript.ast.token.branch

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.branch.IRInlineIf
import github.mrh0.goodscript.ir.branch.IRStatementIf
import github.mrh0.goodscript.ir.branch.IRStatementIfElse
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeBool
import github.mrh0.goodscript.types.GsTypeNone

class TInlineIf(location: Loc, private val condition: ITok, private val body: ITok, private val elseBody: ITok) : Tok(location) {
    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val conditionPair = condition.process(cd)
        val bodyPair = body.process(cd)
        val elseBodyPair = elseBody.process(cd)
        if(!GsTypeBool.accepts(location, conditionPair.first)) throw GsError(location, "Expected if statement condition to be a boolean.")
        if(!bodyPair.first.accepts(location, elseBodyPair.first)) throw GsError(location, "Expected both if and else body to return same type.")

        return Pair(bodyPair.first, IRInlineIf(location, conditionPair.second, bodyPair.second, elseBodyPair.second))
    }

    override fun toString(): String {
        return "TIf($condition, $body, $elseBody)"
    }
}
