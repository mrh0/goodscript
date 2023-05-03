package github.mrh0.goodscript.types

import github.mrh0.goodscript.values.GsBase

class GsTypeUnion(private val of: Array<GsBase>, val type: GsTypeBase) : GsTypeBase("Gs", "Union") {
    override fun toString() = of.joinToString("|", "(", "): $type") { it.toString() }
}