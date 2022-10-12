package github.mrh0.goodscript.vm

import github.mrh0.goodscript.values.GsBase

class VM {
    private val context: MutableMap<String, GsBase> = mutableMapOf()

    fun store(name: String, value: GsBase) = context.put(name, value)

    fun get(name: String) = context[name]
}