package github.mrh0.goodscript.ir.arithmetic.sub

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsInt
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRSubIntInt(location: Loc, val left: IIR, val right: IIR) : IR(location) {
    override fun evaluate(vm: VM, c: Context): GsBase {
        return GsInt((left.evaluate(vm, c) as GsInt).value - (right.evaluate(vm, c) as GsInt).value)
    }

    override fun toString() = "($left i-i $right)"
}
