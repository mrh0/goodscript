package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRBlock
import github.mrh0.goodscript.ir.IRFunc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.values.GsBase

class TFunc(location: Loc, val block: TBlock, val prefix: String, val name: String, val args: MutableList<String>) : Tok(location) {
    override fun toString(): String {
        return "$prefix:$name($args, $block)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        cd.newContext(name)
        val ir = block.process(cd)
        return Pair(GsTypeNone, IRFunc(location, ir.second as IRBlock, name, args))
    }
}