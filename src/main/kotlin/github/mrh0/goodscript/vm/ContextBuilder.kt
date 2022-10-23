package github.mrh0.goodscript.vm

import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

class ContextBuilder {
    val types: MutableList<GsTypeBase> = mutableListOf()
    val values: MutableList<GsBase> = mutableListOf()
    val names: MutableList<String> = mutableListOf()
    var index: Int = 0

    fun define(type: GsTypeBase, value: GsBase, name: String): Int {
        types.add(type)
        values.add(value)
        names.add(name)
        return index++
    }

    fun build(): Context {
        return Context(types.toTypedArray(), values.toTypedArray(), names.toTypedArray())
    }
}