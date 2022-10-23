package github.mrh0.goodscript.ir

import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

interface IIR {
    fun <T : GsBase>evaluate(vm: VM, c: Context): T
}