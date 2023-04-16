package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRValue<T : GsBase>(location: Loc, val value: T) : IR(location) {
    override fun toString(): String {
        return "value(${value})"
    }

    override fun evaluate(vm: VM, c: Context): T {
        return value
    }

    override fun deterministic() = true
}