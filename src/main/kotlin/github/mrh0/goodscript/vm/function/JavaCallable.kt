package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.reflect.Reflection
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM
import java.lang.reflect.Method

class JavaCallable(private val method: Method) : ICallable {
    override fun call(location: Loc, vm: VM, c: Context, args: Array<GsBase>): GsBase = Reflection.call(location, method, args)
    override fun test(location: Loc, args: Array<GsTypeBase>): GsTypeBase {
        throw NotImplementedError()
    }
}