package github.mrh0.goodscript.ir.arithmetic.negate

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.numbers.GsInt
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRNegateInt(location: Loc, val expr: IIR) : IR(location) {
    override fun evaluate(vm: VM, c: Context): GsBase {
        return GsInt(-(expr.evaluate(vm, c) as GsInt).value)
    }

    override fun toString() = "(-i $expr)"

    override fun deterministic() = expr.deterministic()
}
