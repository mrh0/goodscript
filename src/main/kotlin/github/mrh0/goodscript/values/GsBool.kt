package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeBool

class GsBool(val value: Boolean) : GsBase() {
    override fun getType() = GsTypeBool
    override fun toString() = "$value"
}