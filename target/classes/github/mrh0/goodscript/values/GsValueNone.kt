package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeNone

object GsValueNone : GsBase() {
    override fun getType() = GsTypeNone
    override fun getName() = "none"
    override fun toString() = "none"
}