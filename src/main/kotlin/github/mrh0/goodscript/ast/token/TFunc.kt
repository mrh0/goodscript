package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.types.GsType

class TFunc(val block: TBlock, val name: String, val args: MutableList<String>, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "$name($args, $block)"
    }

    override fun process(i: CompileData): Pair<GsType, IIR> {
        TODO("Not yet implemented")
    }
}