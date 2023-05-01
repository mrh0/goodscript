package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeFunction
import github.mrh0.goodscript.types.GsTypeTuple
import github.mrh0.goodscript.vm.function.FunctionOverride

open class GsTuple(private val values: Array<GsBase>) : GsBase() {
    companion object {}
    override fun getType() = GsTypeTuple(values.map { it.getType() }.toTypedArray())
    fun get(index: Int) = values[index]
    override fun getNativeValue(location: Loc): Any {
        return when(values.size) {
            2 -> Pair(values[0].getNativeValue(location), values[1].getNativeValue(location))
            3 -> Triple(values[0].getNativeValue(location), values[1].getNativeValue(location), values[2].getNativeValue(location))
            else -> throw GsError(location, "Cannot get native tuple of size ${values.size}")
        }
    }

    override fun match(location: Loc, type: GsTypeBase): Boolean {
        if(type !is GsTypeTuple) return false
        return values.zip(type.args).all { it.first.match(location, it.second) }
    }
}