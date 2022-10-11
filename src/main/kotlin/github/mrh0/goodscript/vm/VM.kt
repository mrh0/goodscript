package github.mrh0.goodscript.vm

import github.mrh0.goodscript.values.GsAny

class VM {
    private val context: MutableMap<String, GsAny> = mutableMapOf()

    fun store(name: String, value: GsAny) = context.put(name, value)

    fun get(name: String) = context[name]
}