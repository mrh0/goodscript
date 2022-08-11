package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsInteger
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.VM

class IRInteger(private val value: Int, location: Loc) : IR(location) {
    override fun eval(vm: VM): GsType = GsInteger(value)
}