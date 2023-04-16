package github.mrh0.goodscript.error

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase

class GsNotDefinedError (location: Loc, name: String) : GsError(location, "$name is not defined") {
}