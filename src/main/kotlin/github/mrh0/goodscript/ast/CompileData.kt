package github.mrh0.goodscript.ast

import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.ContextBuilder
import github.mrh0.goodscript.vm.VM
import github.mrh0.goodscript.vm.state.IVar

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