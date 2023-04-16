package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeBool

class GsBool(private val value: Boolean) : GsBase() {
    override fun getType() = GsTypeBool
    override fun getName() = "bool"
    override fun toString() = "$value"
}