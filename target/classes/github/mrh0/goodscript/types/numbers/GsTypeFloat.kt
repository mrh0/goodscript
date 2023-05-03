package github.mrh0.goodscript.types.numbers

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.numbers.GsFloat
import github.mrh0.goodscript.values.numbers.GsInt

object GsTypeFloat : GsTypeNumber("Gs", "Float") {
    override fun getJavaClass(location: Loc) = Double::class.java
    override fun construct(location: Loc, value: Any) = GsFloat(value as Double)
}