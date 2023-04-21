package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase

interface ICallable {
    fun call(location: Loc, args: Array<GsBase>): GsBase
}