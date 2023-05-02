package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeFunction
import github.mrh0.goodscript.types.GsTypeTuple
import github.mrh0.goodscript.vm.function.FunctionOverride

open class GsList(private val values: MutableList<GsBase>) : GsBase() {
    companion object {}
    override fun getType() = GsTypeTuple(values.map { it.getType() }.toTypedArray())
    fun get(index: Int) = values[index]
    fun set(index: Int, value: GsBase) {
        values[index] = value
    }
    override fun getNativeValue(location: Loc): Any = values
}