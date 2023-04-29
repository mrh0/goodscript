package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

class FunctionManager {
    companion object {
        val INSTANCE = FunctionManager()

        fun findExactMatch(location: Loc, overrides: List<FunctionOverride>, args: Array<GsBase>): FunctionOverride {
            return overrides.find { it.match(location, args) } ?: TODO("Handle missing runtime matching")
        }
    }
    private val namedFunctionMap: MutableMap<String, FunctionOverrides> = mutableMapOf()

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
        val res = FunctionOverride(name, args, types, returnType, callable)
        fo.add(res)
        return res
    }

    fun getOverridesByName(location: Loc, name: String) = namedFunctionMap.getOrElse(name) { throw GsError(location, "No such override $name") }
    fun getOverrides(location: Loc, name: String, types: Array<GsTypeBase>) = getOverridesByName(location, name).getMatching(location, types)
}