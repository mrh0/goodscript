package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase

class FunctionManager {
    companion object {
        val INSTANCE = FunctionManager()
    }
    val returnTypeCache: MutableMap<String, GsTypeBase> = mutableMapOf()
    val namedFunctionMap: MutableMap<String, FunctionOverrides> = mutableMapOf()
    val validSignaturesCache: MutableMap<String, FunctionOverride> = mutableMapOf()

    private fun getOverrideSignature(name: String, args: Array<GsTypeBase>) = "$name(${args.map { "${it.identifier};" }})"

    fun addOverride(location: Loc, name: String, args: Array<String>, types: Array<GsTypeBase>, ret: GsTypeBase, callable: ICallable): FunctionOverride {
        if(returnTypeCache.containsKey(name)) {
            if(returnTypeCache[name] != ret) throw GsError(location, "Function $name is already defined with another return-type")
        }
        else returnTypeCache[name] = ret
        if(!namedFunctionMap.containsKey(name)) namedFunctionMap[name] = FunctionOverrides(name)
        val res = FunctionOverride(name, args, types, callable)
        namedFunctionMap[name]!!.add(res)
        return res
    }

    fun addValidSignature(name: String, args: Array<GsTypeBase>, override: FunctionOverride) {
        validSignaturesCache[getOverrideSignature(name, args)] = override
    }

    fun find(name: String, args: Array<GsTypeBase>): FunctionOverride {
        return validSignaturesCache.getOrElse(getOverrideSignature(name, args)) { throw Exception("No override found") }
    }
}