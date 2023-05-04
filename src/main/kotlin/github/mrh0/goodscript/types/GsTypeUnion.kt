package github.mrh0.goodscript.types

import github.mrh0.goodscript.values.GsBase

class GsTypeUnion(private val types: MutableList<GsTypeBase>) : GsTypeBase("Gs", "Union") {
    override fun toString() = types.joinToString("|", "(", ")") { it.toString() }
    fun append(type: GsTypeBase) = types.add(type)
}