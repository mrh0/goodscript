package github.mrh0.goodscript.vm.function

class FunctionOverrides(val name: String) {
    val overrides: MutableList<FunctionOverride> = mutableListOf()
    fun add(fo: FunctionOverride) = overrides.add(fo)
}