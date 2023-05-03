package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

interface ICallable {
    fun call(location: Loc, vm: VM, c: Context, args: Array<GsBase>): GsBase
    fun test(location: Loc, args: Array<GsTypeBase>): GsTypeBase
}