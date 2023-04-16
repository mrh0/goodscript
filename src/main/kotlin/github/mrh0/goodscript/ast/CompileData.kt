package github.mrh0.goodscript.ast

import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.ContextBuilder

class CompileData {
    val contextMap: MutableMap<String, Context> = mutableMapOf()
    var currentContextBuilder: ContextBuilder = ContextBuilder("__GLOBAL__");
    fun newContext(contextName: String): ContextBuilder {
        contextMap[currentContextBuilder.contextName] = currentContextBuilder.build()
        currentContextBuilder = ContextBuilder(contextName)
        return currentContextBuilder
    }

    fun ctx(): ContextBuilder {
        return currentContextBuilder
    }
}