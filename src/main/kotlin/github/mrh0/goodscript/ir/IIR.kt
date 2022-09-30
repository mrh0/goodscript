package github.mrh0.goodscript.ir

import github.mrh0.goodscript.values.GsValue
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

interface IIR {
    fun evaluate(vm: VM, c: Context): GsValue
}