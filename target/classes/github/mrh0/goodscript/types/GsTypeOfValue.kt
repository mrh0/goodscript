package github.mrh0.goodscript.types

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase

class GsTypeOfValue(private val of: GsBase) : GsTypeBase("Gs", "OfValue") {
    override fun toString() = "$of"

    override fun accepts(location: Loc, value: GsBase) = value == of
}