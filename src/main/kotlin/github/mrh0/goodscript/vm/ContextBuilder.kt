package github.mrh0.goodscript.vm

import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsValueNone

class ContextBuilder {
    val types: MutableList<GsTypeBase> = mutableListOf()
    val values: MutableList<GsBase> = mutableListOf()
    val names: MutableList<String> = mutableListOf()
    val map: MutableMap<String, Int> = mutableMapOf()
    var index: Int = 0

    fun define(type: GsTypeBase, value: GsBase, name: String): Int {
        types.add(type)
        values.add(value)
        names.add(name)
        map[name] = index
        return index++
    }

    fun get(name: String): GsTypeBase {
        return if(map.containsKey(name)) types[map[name]!!] else GsTypeNone
    }

    fun set(name: String, type: GsTypeBase) {
        if(!map.containsKey(name))
            throw Exception("Variable '$name' is used before it is defined")
        if(type != types[map[name]!!])
            throw Exception("Cannot set variable '$name' of type '${types[map[name]!!]}' to value of type '$type'")
    }

    fun build(): Context {
        return Context(types.toTypedArray(), values.toTypedArray(), names.toTypedArray())
    }
}