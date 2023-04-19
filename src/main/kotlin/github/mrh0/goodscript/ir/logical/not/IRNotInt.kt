package github.mrh0.goodscript.ir.logical.not

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsBool
import github.mrh0.goodscript.values.GsInt
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRNotInt(location: Loc, val expr: IIR) : IR(location) {
    override fun evaluate(vm: VM, c: Context): GsBase {
        return GsBool((expr.evaluate(vm, c) as GsInt).value > 0)
    }

    override fun toString() = "(!i $expr)"

    override fun deterministic() = expr.deterministic()
}
