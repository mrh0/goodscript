package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.values.GsValue
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

interface ITok {
    fun process(vm: VM, c: Context): Pair<GsType, ITok>
}