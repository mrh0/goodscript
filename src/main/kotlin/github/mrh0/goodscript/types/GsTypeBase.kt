package github.mrh0.goodscript.types

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.values.GsBase

abstract class GsTypeBase(val namespace: String, val identifier: String) {
    override fun toString(): String {
        return "$namespace.$identifier"
    }

    open fun getJavaClass(location: Loc): Class<*> {
        throw GsError(location, "Type $identifier cannot be a Java Class")
    }

    open fun construct(location: Loc, value: Any): GsBase {
        throw GsError(location, "Type $identifier cannot be constructed from Any")
    }

    open fun match(type: GsTypeBase) = type == this
}