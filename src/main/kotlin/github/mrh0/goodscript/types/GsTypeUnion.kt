package github.mrh0.goodscript.types

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase

class GsTypeUnion(private val types: MutableSet<GsTypeBase>) : GsTypeBase("Gs", "Union") {
    override fun toString() = types.joinToString("|", "(", ")") { it.toString() }
    fun append(type: GsTypeBase) = types.add(type)
    override fun accepts(location: Loc, type: GsTypeBase): Boolean {
        return if(type is GsTypeUnion)
            type.types.all { other -> types.any { it.accepts(location, other) } }
        else
            types.any { it.accepts(location, type) }
    }

    override fun accepts(location: Loc, value: GsBase) = types.any { it.accepts(location, value) }
}