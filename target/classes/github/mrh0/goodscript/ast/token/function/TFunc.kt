package github.mrh0.goodscript.ast.token.function

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
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

class TFunc(location: Loc, val block: TBlock, val prefix: String, val name: String, val args: MutableList<TArgument>, val returns: ITok) : Tok(location) {
    override fun toString() = "$prefix:$name($args, $block)"

    private var funcIR: IRFunc? = null
    fun getFuncIR() = funcIR ?: throw Exception("User function supplier is empty. This should never happen!")
    fun processSignature(cd: CompileData): Pair<List<Pair<String, GsTypeBase>>, GsTypeBase> {
        val argPairs = args.map { Pair(it.name, it.process(cd).first) }
        val returnType = returns.process(cd).first
        return Pair(argPairs, returnType)
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        cd.newContext(name)
        val argPairs = args.map { Pair(it.name, it.process(cd).first) }.toTypedArray()
        argPairs.forEach { cd.ctx().define(location, Variable(it.first, it.second, GsValueNone)) }
        val returnType = returns.process(cd).first
        val ir = block.process(cd)
        funcIR = IRFunc(location, ir.second as IRBlock, name, argPairs, returnType)
        return Pair(GsTypeNone, funcIR!!)
    }
}