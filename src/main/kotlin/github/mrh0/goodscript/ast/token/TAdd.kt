package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.ir.IRInteger
import github.mrh0.goodscript.ir.op.IRAdd
import github.mrh0.goodscript.types.GsInteger
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.VM

class TAdd(val left: GsType, val right: GsType, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "+i"
    }

    override fun process(vm: VM, list: MutableList<IR>): GsType {
        when {
            left is GsInteger && right is GsInteger -> {
                list.add(IRAdd())
            }
        }
    }
}