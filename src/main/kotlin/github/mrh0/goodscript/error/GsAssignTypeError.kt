package github.mrh0.goodscript.error

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase

class GsAssignTypeError (location: Loc, name: String, type: GsTypeBase, otherType: GsTypeBase)
    : GsError(location, "Cannot set variable '$name' of type $type to value of type $otherType") {
}