package github.mrh0.goodscript.ast.token.function

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.function.IRFunctionCall
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeCallSignature
import github.mrh0.goodscript.vm.function.FunctionManager

class TExprCall (location: Loc, val name: String, val args: List<ITok>) : Tok(location) {
    override fun toString(): String {
        return "TCall(${name}, $args)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        //val fn = cd.ctx().get(location, name)
        //if(fn.getType() !is GsTypeFunction) throw GsError(location, "Unexpected type")
        val processedArgs = args.map { it.process(cd) }
        val argTypes = processedArgs.map { it.first }.toTypedArray()

        val (varIndex, ivar) = cd.getFunctionVarIndex(location, name, argTypes)
        val varType = ivar.getType() as GsTypeCallSignature
        return Pair(
            varType.ret,
            IRFunctionCall(location,
                name,
                varIndex,
                processedArgs.map { it.second }
            )
        )
    }
}