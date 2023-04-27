package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeFunction
import github.mrh0.goodscript.vm.function.FunctionOverride

open class GsFunction(private val override: FunctionOverride) : GsBase() {
    override fun getType() = GsTypeFunction(override.argTypes, override.ret)
    // override fun invoke(location: Loc, args: Array<GsBase>) = callable.call(location, args)
}