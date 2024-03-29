package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase

abstract class GsBase {
    abstract fun getType(): GsTypeBase
    open fun getNativeValue(location: Loc): Any {
        throw GsError(location, "Type ${getName()} cannot be a Native value")
    }

    open fun getName() = getType().identifier

    fun isSameType(other: GsBase): Boolean {
        return this.getType() == other.getType()
    }

    // Operations
    open fun invoke(location: Loc, args: Array<GsBase>): GsBase {
        throw Exception("Cannot invoke ${getType()}")
    }

    open fun equals(location: Loc, other: GsBase): Boolean {
        return getNativeValue(location) == other.getNativeValue(location)
    }

    final fun match(location: Loc, type: GsTypeBase) = type.accepts(location, this)

    open fun cast(location: Loc, to: GsTypeBase): GsBase {
        if(!getType().accepts(location, to)) throw GsError(location, "Cannot cast ${getType()} to $to")
        return this
    }
}