package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeCallSignature
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM
import github.mrh0.goodscript.vm.function.FunctionOverride
import github.mrh0.goodscript.vm.function.FunctionOverrides
import github.mrh0.goodscript.vm.function.ICallable

open class GsFunctionReference(val overrides: FunctionOverrides) : GsBase() {
    override fun getType() = overrides.getType()
    override fun cast(location: Loc, to: GsTypeBase): GsBase {
        super.cast(location, to)
        return GsFunction(overrides.getMatching(location, to as GsTypeCallSignature).toTypedArray(), to)
    }
}