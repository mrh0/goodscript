package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.ir.IRInteger
import github.mrh0.goodscript.values.GsInt
import github.mrh0.goodscript.values.GsValue
import github.mrh0.goodscript.vm.VM

class TInteger(val value: Int, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "${value}i"
    }

    override fun process(vm: VM, list: MutableList<IR>): GsValue {
        list.add(IRInteger(value, location))
        return GsInt(value)
    }
}