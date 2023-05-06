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
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.values.GsFunction
import github.mrh0.goodscript.values.GsFunctionReference
import github.mrh0.goodscript.vm.function.FunctionManager

class TStatementCall (location: Loc, val name: String, val args: List<ITok>) : Tok(location) {
    override fun toString(): String {
        return "TCall(${name}, $args)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        //val fn = cd.ctx().get(location, name)
        //if(fn.getType() !is GsTypeFunction) throw GsError(location, "Unexpected type")
        val processedArgs = args.map { it.process(cd) }
        val argTypes = processedArgs.map { it.first }.toTypedArray()
        /*val overrides = FunctionManager.INSTANCE.getOverrides(
            location,
            name,
            argTypes
        )
        if(overrides.isEmpty()) throw GsError(location, "No override for function $name(${argTypes.joinToString(separator = ",") { it.toString() } })")
        val override = overrides.first()*/

        val value = cd.getVar(location, name).getValue(location)
        if(value !is GsFunctionReference) throw GsError(location, "Cannot call type ${value.getType()}")
        val overrides = value.overrides.getMatching(location, argTypes)
        if(overrides.isEmpty()) throw GsError(location, "No override for function $name(${argTypes.joinToString(separator = ",") { it.toString() } })")
        val override = overrides.first()
        return Pair(
            override.ret,
            IRFunctionCall(location,
                name,
                override,
                processedArgs.map { it.second }
            )
        )
    }
}