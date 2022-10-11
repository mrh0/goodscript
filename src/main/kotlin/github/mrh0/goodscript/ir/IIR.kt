package github.mrh0.goodscript.ir

import github.mrh0.goodscript.values.GsAny
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

interface IIR<T : GsAny> {
    fun evaluate(vm: VM, c: Context): T
}