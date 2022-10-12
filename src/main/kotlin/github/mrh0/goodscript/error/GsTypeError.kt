package github.mrh0.goodscript.error

import github.mrh0.goodscript.types.GsTypeBase

class GsTypeError(private val op: String, private vararg val types: GsTypeBase) : GsError() {
    override val message: String?
        get() = "$op is not compatible with type${ if (types.size > 1) "s" else "" } $types."
}