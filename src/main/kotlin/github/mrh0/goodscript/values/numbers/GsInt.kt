package github.mrh0.goodscript.values.numbers

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.numbers.GsTypeInt

class GsInt(val value: Int) : GsNumber() {
    override fun getType() = GsTypeInt
    override fun toString() = "$value"
    override fun getNativeValue(location: Loc) = value
    override fun getNumber(): Number = value
}