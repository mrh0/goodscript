package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeFunction
import github.mrh0.goodscript.vm.function.FunctionOverride
import github.mrh0.goodscript.vm.function.FunctionOverrides

open class GsFunction(private val override: FunctionOverrides) : GsBase() {
    override fun getType() = override.getType()
    // override fun invoke(location: Loc, args: Array<GsBase>) = callable.call(location, args)
}