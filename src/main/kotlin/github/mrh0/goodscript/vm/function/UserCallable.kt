package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.function.IRFunc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM
import java.util.function.Supplier

class UserCallable(private val func: Supplier<IRFunc>) : ICallable {
    override fun call(location: Loc, vm: VM, c: Context, args: Array<GsBase>): GsBase = func.get().evaluate(vm, c)
    override fun test(location: Loc, args: Array<GsTypeBase>): GsTypeBase {
        throw NotImplementedError()
    }
}