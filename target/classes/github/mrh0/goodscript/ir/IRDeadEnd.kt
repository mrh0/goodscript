package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

object IRDeadEnd : IR(Loc.IDENTITY) {
    override fun evaluate(vm: VM, c: Context): GsBase {
        throw Exception("evaluating dead end should not occur")
    }
}