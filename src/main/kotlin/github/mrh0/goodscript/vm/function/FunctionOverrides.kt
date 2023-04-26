package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.types.GsTypeBase

class FunctionOverrides(val name: String, val returnType: GsTypeBase) {
    val overrides: MutableList<FunctionOverride> = mutableListOf()
    fun add(fo: FunctionOverride) = overrides.add(fo)
    fun getMatching(types: Array<GsTypeBase>) = overrides.filter { it.match(types) }
}