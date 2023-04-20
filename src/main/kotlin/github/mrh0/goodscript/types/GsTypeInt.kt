package github.mrh0.goodscript.types

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsInt

object GsTypeInt : GsTypeBase("Gs.Int") {
    override fun getJavaClass(location: Loc) = Int::class.java
    override fun construct(location: Loc, value: Any) = GsInt(value as Int)
}