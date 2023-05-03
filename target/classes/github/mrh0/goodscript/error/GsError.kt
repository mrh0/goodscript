package github.mrh0.goodscript.error

import github.mrh0.goodscript.ast.Loc

open class GsError(val location: Loc, message: String) : Exception("$location: $message") {
}