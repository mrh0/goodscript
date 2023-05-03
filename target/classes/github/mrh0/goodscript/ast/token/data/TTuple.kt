package github.mrh0.goodscript.ast.token.data

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.ir.data.IRTuple
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeString
import github.mrh0.goodscript.types.GsTypeTuple
import github.mrh0.goodscript.values.GsString
import github.mrh0.goodscript.values.GsTuple

class TTuple(location: Loc, private val values: List<ITok>) : Tok(location) {
    override fun toString(): String {
        return values.joinToString("&", "TTuple(", ")")
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val pairs = values.map { it.process(cd) }
        return Pair(GsTypeTuple(pairs.map { it.first }.toTypedArray()), IRTuple(location, pairs.map { it.second }))
    }
}