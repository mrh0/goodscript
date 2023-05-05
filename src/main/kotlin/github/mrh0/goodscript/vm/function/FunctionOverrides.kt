package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeUnion

class FunctionOverrides(val name: String) {
    val overrides: MutableList<FunctionOverride> = mutableListOf()
    fun add(fo: FunctionOverride) = overrides.add(fo)
    fun getMatching(location: Loc, types: Array<GsTypeBase>) = overrides.filter { it.match(location, types) }
    fun getType() = GsTypeUnion(overrides.map { it.getType() }.toHashSet())
}