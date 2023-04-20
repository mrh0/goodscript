package github.mrh0.goodscript.vm

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase

class FunctionManager {
    val returnTypeCache: MutableMap<String, GsTypeBase> = mutableMapOf()
    val namedFunctionMap: MutableMap<String, FunctionOverrides> = mutableMapOf()
    val validSignaturesCache: MutableMap<String, FunctionOverride> = mutableMapOf()

    private fun getOverrideSignature(name: String, args: List<GsTypeBase>) = "$name(${args.map { "${it.identifier};" }})"

    fun addOverride(location: Loc, name: String, args: List<String>, types: List<GsTypeBase>, ret: GsTypeBase) {
        val signature = getOverrideSignature(name, types)
        if(returnTypeCache.containsKey(name)) {
            if(returnTypeCache[name] != ret) throw GsError(location, "Function $name is already defined with another return-type")
        }
        else returnTypeCache[name] = ret
        if(!namedFunctionMap.containsKey(name)) namedFunctionMap[name] = FunctionOverrides(name)
        namedFunctionMap[name]!!.add(FunctionOverride(name, args, types))
    }
}