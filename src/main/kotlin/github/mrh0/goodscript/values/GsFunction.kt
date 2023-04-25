package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeFunction
import github.mrh0.goodscript.vm.function.FunctionOverrides

open class GsFunction(private val overrides: FunctionOverrides) : GsBase() {
    override fun getType() = GsTypeFunction
    // override fun invoke(location: Loc, args: Array<GsBase>) = callable.call(location, args)
}