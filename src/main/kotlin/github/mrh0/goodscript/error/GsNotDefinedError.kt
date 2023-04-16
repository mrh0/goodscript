package github.mrh0.goodscript.error

import github.mrh0.goodscript.types.GsTypeBase

class GsNotDefinedError (private val name: String) : GsError() {
    override val message: String
        get() = "$name is not defined"
}