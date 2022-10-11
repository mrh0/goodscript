package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsType

abstract class GsAny {
    abstract fun getType(): GsType

    abstract fun getName(): String

    fun isSameType(other: GsAny): Boolean {
        return this.getType() == other.getType()
    }

    // Operations
    open fun invoke(vararg args: GsAny): GsAny {
        throw Exception("Cannot invoke ${getType()}")
    }
}