package github.mrh0.goodscript.vm

import github.mrh0.goodscript.types.GsType

class VM {
    private val context: MutableMap<String, GsType> = mutableMapOf()

    fun store(name: String, value: GsType) = context.put(name, value)

    fun get(name: String) = context[name]
}