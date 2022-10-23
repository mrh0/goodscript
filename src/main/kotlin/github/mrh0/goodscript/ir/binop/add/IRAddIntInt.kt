package github.mrh0.goodscript.ir.binop.add

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsInt
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRAddIntInt(location: Loc, val left: IIR, val right: IIR) : IR(location) {
    override fun <T : GsBase> evaluate(vm: VM, c: Context): T {
        return GsInt(left.evaluate<GsInt>(vm, c).value + right.evaluate<GsInt>(vm, c).value)
    }

    override fun toString() = "($left i+i $right)"
}
