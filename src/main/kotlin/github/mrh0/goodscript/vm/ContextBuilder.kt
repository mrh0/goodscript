package github.mrh0.goodscript.vm

import github.mrh0.goodscript.error.GsNotDefinedError
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

class ContextBuilder(val contextName: String) {
    val types: MutableList<GsTypeBase> = mutableListOf()
    val values: MutableList<GsBase> = mutableListOf()
    val names: MutableList<String> = mutableListOf()
    val map: MutableMap<String, Int> = mutableMapOf()
    var index: Int = 0

    fun define(type: GsTypeBase, value: GsBase, name: String): Int {
        //println("Defining $name:$index for $contextName")
        types.add(type)
        values.add(value)
        names.add(name)
        map[name] = index
        return index++
    }

    fun getType(name: String): GsTypeBase {
        return if(map.containsKey(name)) types[map[name]!!] else throw GsNotDefinedError(name)
    }

    fun getIndex(name: String): Int {
        return if(map.containsKey(name)) map[name]!! else throw GsNotDefinedError(name)
    }

    fun assign(name: String, type: GsTypeBase): Int {
        if(!map.containsKey(name))
            throw GsNotDefinedError(name)
        if(type != types[map[name]!!])
            throw Exception("Cannot set variable '$name' of type '${types[map[name]!!]}' to value of type '$type'")
        return map[name]!!
    }

    fun build(): Context {
        // println("BuildingContext: $contextName, ${types.size}")
        return Context(contextName, types.toTypedArray(), values.toTypedArray(), names.toTypedArray())
    }
}