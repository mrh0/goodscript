package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsAny
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRValue<T : GsAny>(location: Loc, val value: T) : IR<T>(location) {
    override fun toString(): String {
        return "value(${value})"
    }

    override fun evaluate(vm: VM, c: Context): T {
        return value
    }
}