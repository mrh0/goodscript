package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsInt
import github.mrh0.goodscript.values.GsValue
import github.mrh0.goodscript.vm.VM

class IRInteger(private val value: Int, location: Loc) : IR(location) {
    override fun eval(vm: VM): GsValue = GsInt(value)
}