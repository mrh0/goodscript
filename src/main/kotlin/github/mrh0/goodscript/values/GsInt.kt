package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeInt

class GsInt(val value: Int) : GsBase() {
    override fun getType() = GsTypeInt
    override fun toString() = "${value}i"
    override fun getJavaClass(location: Loc) = Int::class.java
}