package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.ir.IRInteger
import github.mrh0.goodscript.types.GsInteger
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.VM

class TInteger(val value: Int, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "${value}i"
    }

    override fun process(vm: VM, list: MutableList<IR>): GsType {
        list.add(IRInteger(value, location))
        return GsInteger(value)
    }
}