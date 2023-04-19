package github.mrh0.goodscript.ast.token.function

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRNamed
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.values.GsInt

class TStatementCall (location: Loc, val name: String, val argTypes: List<String>) : Tok(location) {
    override fun toString(): String {
        return "$${name}"
    }

    fun buildCallSignature() {
        val sb: StringBuilder = StringBuilder("$name(")
        argTypes.forEach { sb.append("$it;") }
        sb.append(")")
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        return Pair(cd.ctx().get(location, name).getType(), IRNamed(location, name, cd.ctx().getIndex(location, name)))
    }
}