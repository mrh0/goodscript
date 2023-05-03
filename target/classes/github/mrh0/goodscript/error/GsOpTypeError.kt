package github.mrh0.goodscript.error

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase

class GsOpTypeError(location: Loc, op: String, vararg types: GsTypeBase)
    : GsError(location, "$op is not compatible with type${ if (types.size > 1) "s" else "" } $types.") {
}