package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ast.token.function.TFunc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.function.IRFunc
import github.mrh0.goodscript.ir.IRProgram
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeFunction
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.values.GsFunction
import github.mrh0.goodscript.values.GsFunctionReference
import github.mrh0.goodscript.vm.function.FunctionManager
import github.mrh0.goodscript.vm.function.UserCallable
import github.mrh0.goodscript.vm.state.GlobalFunction
import github.mrh0.goodscript.vm.state.Variable

class TProgram(location: Loc, private val functions: MutableList<TFunc>, val uses: List<ITok>) : Tok(location) {

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        uses.map { it.process(cd) }
        functions.map { analyzeFunction(it, cd) }
        val irs = functions.map { it.process(cd).second as IRFunc }
        return Pair(GsTypeNone, IRProgram(location, irs))
    }

    private fun analyzeFunction(func: TFunc, cd: CompileData) {
        val res = func.processSignature(cd)
        val argNames = res.first.map { it.first }.toTypedArray()
        val argTypes = res.first.map { it.second }.toTypedArray()
        val retType = res.second
        val fos = FunctionManager.INSTANCE.addOverride(func.location, func.name, argNames, argTypes, retType, UserCallable(func::getFuncIR))
        if(fos.getNumberOfOverrides() == 1)
            cd.getGlobal().define(location, GlobalFunction(func.name, fos.getType(), GsFunctionReference(fos)))
    }

    override fun toString(): String {
        return "TProgram$functions"
    }
}