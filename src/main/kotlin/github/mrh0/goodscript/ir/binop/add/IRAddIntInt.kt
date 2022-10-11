package github.mrh0.goodscript.ir.binop.add

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsInt
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRAddIntInt(location: Loc, val left: IIR<GsInt>, val right: IIR<GsInt>) : IR<GsInt>(location) {
    override fun toString() = "($left i+i $right)"

    override fun evaluate(vm: VM, c: Context): GsInt {
        return GsInt(left.evaluate(vm, c).value + right.evaluate(vm, c).value)
    }
}
