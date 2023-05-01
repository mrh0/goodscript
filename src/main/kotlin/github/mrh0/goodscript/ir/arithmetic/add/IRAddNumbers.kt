package github.mrh0.goodscript.ir.arithmetic.add

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.numbers.GsFloat
import github.mrh0.goodscript.values.numbers.GsInt
import github.mrh0.goodscript.values.numbers.GsNumber
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRAddNumbers(location: Loc, val left: IIR, val right: IIR) : IR(location) {
    override fun evaluate(vm: VM, c: Context): GsBase {
        return GsFloat((left.evaluate(vm, c) as GsNumber).getAsDouble() + (right.evaluate(vm, c) as GsNumber).getAsDouble())
    }

    override fun toString() = "($left i+i $right)"
}
