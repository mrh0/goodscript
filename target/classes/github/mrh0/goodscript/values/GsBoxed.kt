package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.*
import github.mrh0.goodscript.vm.function.FunctionOverride

open class GsBoxed(private val value: Any) : GsBase() {
    companion object {}
    override fun getType() = GsTypeBoxed
    override fun getNativeValue(location: Loc): Any = value
}