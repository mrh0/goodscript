package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeInt

class GsInt(val value: Int) : GsBase() {
    override fun getType() = GsTypeInt
    override fun getName() = "int"
    override fun toString() = "${value}i"
}