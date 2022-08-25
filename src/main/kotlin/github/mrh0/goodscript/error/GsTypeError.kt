package github.mrh0.goodscript.error

import github.mrh0.goodscript.types.GsType

class GsTypeError(private val op: String, private vararg val types: GsType) : GsError() {
    override val message: String?
        get() = "$op is not compatible with type${ if (types.size > 1) "s" else "" } $types."
}