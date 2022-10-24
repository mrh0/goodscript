package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRProgram(location: Loc, val functions: List<IRFunc>) : IR(location) {
    override fun toString(): String {
        return "$functions"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        TODO("Not yet implemented")
    }
}