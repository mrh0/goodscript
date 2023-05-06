package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeCallSignature
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM
import github.mrh0.goodscript.vm.function.FunctionOverride
import github.mrh0.goodscript.vm.function.ICallable

open class GsFunction(private val overrides: Array<FunctionOverride>, private val type: GsTypeCallSignature) : GsBase(), ICallable {
    override fun getType() = type
    override fun call(location: Loc, vm: VM, c: Context, args: Array<GsBase>): GsBase = overrides.first().callable.call(location, vm, c, args)
    override fun test(location: Loc, args: Array<GsTypeBase>): GsTypeBase = overrides.first().callable.test(location, args)
}