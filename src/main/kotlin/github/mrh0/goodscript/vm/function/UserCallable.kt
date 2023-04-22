package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.reflect.Reflection
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

class UserCallable() : ICallable {
    override fun call(location: Loc, args: Array<GsBase>): GsBase = 1
    override fun test(location: Loc, args: Array<GsTypeBase>): GsTypeBase {
        throw Exception()
    }
}