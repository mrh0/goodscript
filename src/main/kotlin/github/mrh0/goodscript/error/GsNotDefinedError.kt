package github.mrh0.goodscript.error

import github.mrh0.goodscript.types.GsTypeBase

class GsNotDefinedError (name: String) : GsError("$name is not defined") {
}