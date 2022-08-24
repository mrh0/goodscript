package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsType

abstract class GsValue {
    abstract fun getType(): GsType

    abstract fun getName(): String

    fun isSameType(other: GsValue): Boolean {
        return this.getType() == other.getType()
    }

    open fun invoke(vararg args: GsValue): GsValue {
        throw Exception("Cannot invoke ${getType()}")
    }
}