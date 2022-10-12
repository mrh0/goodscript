package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeBase

abstract class GsBase {
    abstract fun getType(): GsTypeBase

    abstract fun getName(): String

    fun isSameType(other: GsBase): Boolean {
        return this.getType() == other.getType()
    }

    // Operations
    open fun invoke(vararg args: GsBase): GsBase {
        throw Exception("Cannot invoke ${getType()}")
    }
}