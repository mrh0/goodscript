package github.mrh0.goodscript.vm

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsAssignTypeError
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.error.GsNotDefinedError
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.state.IVar

class ContextBuilder(val contextName: String) {
    private val vars: MutableList<IVar> = mutableListOf()
    private val map: MutableMap<String, Int> = mutableMapOf()
    private var index: Int = 0

    fun define(location: Loc, variable: IVar): Int {
        //println("Defining $name:$index for $contextName")
        if(map.containsKey(variable.getName())) throw GsError(location, "${variable.getName()} is already defined in context $contextName")
        vars.add(variable)
        map[variable.getName()] = index
        return index++
    }

    fun defineAnonymous(location: Loc, variable: IVar): Int {
        vars.add(variable)
        return index++
    }

    fun getRaw(location: Loc, name: String): IVar? = if(map.containsKey(name)) vars[map[name]!!] else null

    fun get(location: Loc, name: String): IVar {
        return if(map.containsKey(name)) vars[map[name]!!] else throw GsNotDefinedError(location, name)
    }

    fun getIndex(location: Loc, name: String): Int {
        return if(map.containsKey(name)) map[name]!! else throw GsNotDefinedError(location, name)
    }

    fun assign(location: Loc, name: String, type: GsTypeBase): Int {
        if(!map.containsKey(name))
            throw GsNotDefinedError(location, name)
        if(type != get(location, name).getType())
            throw GsAssignTypeError(location, name, get(location, name).getType(), type)
        return map[name]!!
    }

    fun build(): Context {
        // println("BuildingContext: $contextName, ${types.size}")
        return Context(contextName, vars.toTypedArray())
    }
}