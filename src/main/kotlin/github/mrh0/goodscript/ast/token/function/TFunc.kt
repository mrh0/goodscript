package github.mrh0.goodscript.ast.token.function

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ast.token.TBlock
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRBlock
import github.mrh0.goodscript.ir.function.IRFunc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.values.GsValueNone
import github.mrh0.goodscript.vm.state.Variable

class TFunc(location: Loc, val block: TBlock, val prefix: String, val name: String, val args: MutableList<TArgument>) : Tok(location) {
    override fun toString() = "$prefix:$name($args, $block)"

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        cd.newContext(name)
        val argPairs = args.map { Pair(it.name, it.process(cd).first) }.toTypedArray()
        argPairs.forEach { cd.ctx().define(location, Variable(it.first, it.second, GsValueNone)) }
        val ir = block.process(cd)
        return Pair(GsTypeNone, IRFunc(location, ir.second as IRBlock, name, argPairs))
    }
}