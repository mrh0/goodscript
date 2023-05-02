package github.mrh0.goodscript.types

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsBoxed

object GsTypeBoxed : GsTypeBase("Gs", "Boxed") {
    override fun toString() = "Boxed"
    override fun construct(location: Loc, value: Any): GsBase = GsBoxed(value)
}