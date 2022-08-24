package github.mrh0.goodscript.error

class GsTypeError(val op: String, vararg val types: String) : GsError() {
    override val message: String?
        get() = "$op is not compatible with type${ if (types.size > 1) "s" else "" } $types."
}