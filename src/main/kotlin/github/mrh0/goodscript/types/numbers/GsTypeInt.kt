package github.mrh0.goodscript.types.numbers

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.numbers.GsInt

object GsTypeInt : GsTypeNumber("Gs", "Int") {
    override fun getJavaClass(location: Loc) = Int::class.java
    override fun construct(location: Loc, value: Any) = GsInt(value as Int)
}