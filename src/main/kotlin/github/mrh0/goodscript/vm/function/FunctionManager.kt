package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase

class FunctionManager {
    companion object {
        val INSTANCE = FunctionManager()
    }
    private val namedFunctionMap: MutableMap<String, FunctionOverrides> = mutableMapOf()

    private fun getOverrideSignature(name: String, args: Array<GsTypeBase>) = "$name(${args.map { "${it.identifier};" }})"

    fun addOverride(location: Loc, name: String, args: Array<String>, types: Array<GsTypeBase>, returnType: GsTypeBase, callable: ICallable): FunctionOverride {
        val fo: FunctionOverrides
        if(namedFunctionMap.containsKey(name)) {
            if(namedFunctionMap[name]!!.returnType != returnType) throw GsError(location, "Function $name is already defined with another return-type")
            fo = namedFunctionMap[name]!!
        }
        else {
            fo = FunctionOverrides(name, returnType)
            namedFunctionMap[name] = fo
        }
        val res = FunctionOverride(name, args, types, callable)
        fo.add(res)
        return res
    }
}