package github.mrh0.goodscript.error

import github.mrh0.goodscript.types.GsTypeBase

class GsOpTypeError(op: String, vararg types: GsTypeBase) : GsError("$op is not compatible with type${ if (types.size > 1) "s" else "" } $types.") {
}