package github.mrh0.goodscript.ast

import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeCallSignature
import github.mrh0.goodscript.values.GsGlobalFunction
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.ContextBuilder
import github.mrh0.goodscript.vm.VM
import github.mrh0.goodscript.vm.state.GlobalFunctionReference
import github.mrh0.goodscript.vm.state.IVar
import github.mrh0.goodscript.vm.state.Variable

class CompileData {
    val contextMap: MutableMap<String, Context> = mutableMapOf()
    private val global = ContextBuilder("__GLOBAL__")
    var currentContextBuilder: ContextBuilder = global

    fun getVar(location: Loc, name: String): IVar {
        val ivar = ctx().getRaw(location, name)
        return if(ivar != null) {
            ivar
        } else {
            val gvar = getGlobal().get(location, name)
            ctx().define(location, gvar)
            gvar
        }
    }

    fun getFunctionVarIndex(location: Loc, name: String, args: Array<GsTypeBase>): Pair<Int, IVar> {
        val ivar = ctx().getRaw(location, name)
        return if(ivar != null) {
            ctx().getIndex(location, name) to ivar
        } else {
            val gvar = getGlobal().get(location, name)
            if(gvar !is GlobalFunctionReference) throw GsError(location, "Defined global $name is not a function")
            val fn = gvar.ref.getFunction(location, args)

            val lvar = Variable("$name:anonymous", GsTypeCallSignature(args, fn.getReturnType()), fn)
            val definedIndex = ctx().defineAnonymous(location, lvar)
            definedIndex to lvar
        }
    }

    fun newContext(contextName: String): ContextBuilder {
        contextMap[currentContextBuilder.contextName] = currentContextBuilder.build()
        currentContextBuilder = ContextBuilder(contextName)
        return currentContextBuilder
    }

    fun ctx() = currentContextBuilder
    fun getGlobal() = global

    fun finalize(): Context {
        contextMap[currentContextBuilder.contextName] = currentContextBuilder.build()
        return global.build()
    }
}