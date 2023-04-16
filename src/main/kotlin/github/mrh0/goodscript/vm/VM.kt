package github.mrh0.goodscript.vm

import github.mrh0.goodscript.ast.CompileData

class VM(cd: CompileData) {
    private val contexts: MutableMap<String, Context> = cd.contextMap

    fun getContext(name: String) = contexts[name]!!
}