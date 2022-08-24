package github.mrh0.goodscript.vm

import github.mrh0.goodscript.values.GsValue

class VM {
    private val context: MutableMap<String, GsValue> = mutableMapOf()

    fun store(name: String, value: GsValue) = context.put(name, value)

    fun get(name: String) = context[name]
}