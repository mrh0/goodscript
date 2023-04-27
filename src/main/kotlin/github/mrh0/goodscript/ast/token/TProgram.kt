package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ast.token.function.TFunc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.function.IRFunc
import github.mrh0.goodscript.ir.IRProgram
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.vm.function.FunctionManager
import github.mrh0.goodscript.vm.function.UserCallable

class TProgram(location: Loc, private val functions: MutableList<TFunc>) : Tok(location) {

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        functions.map { analyzeFunction(it, cd) }
        val irs = functions.map { it.process(cd).second as IRFunc }
        return Pair(GsTypeNone, IRProgram(location, irs))
    }

    fun analyzeFunction(func: TFunc, cd: CompileData) {
        val res = func.processSignature(cd)
        val argNames = res.first.map { it.first }.toTypedArray()
        val argTypes = res.first.map { it.second }.toTypedArray()
        val retType = res.second
        FunctionManager.INSTANCE.addOverride(location, func.name, argNames, argTypes, retType, UserCallable(func::getFuncIR))
    }

    override fun toString(): String {
        return "TProgram$functions"
    }
}