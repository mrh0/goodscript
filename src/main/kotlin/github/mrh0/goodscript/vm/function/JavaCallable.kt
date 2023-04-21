package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.reflect.Reflection
import github.mrh0.goodscript.values.GsBase
import java.lang.reflect.Method

class JavaCallable(private val method: Method) : ICallable {
    override fun call(location: Loc, args: Array<GsBase>): GsBase = Reflection.call(location, method, args)
}