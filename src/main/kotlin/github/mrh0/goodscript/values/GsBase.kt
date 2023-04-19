package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase

abstract class GsBase {
    abstract fun getType(): GsTypeBase
    open fun getJavaClass(location: Loc): Class<*> {
        throw GsError(location, "Type ${getName()} cannot be a Java Class")
    }

    open fun getName() = getType().identifier

    fun isSameType(other: GsBase): Boolean {
        return this.getType() == other.getType()
    }

    // Operations
    open fun invoke(vararg args: GsBase): GsBase {
        throw Exception("Cannot invoke ${getType()}")
    }
}