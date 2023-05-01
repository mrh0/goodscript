package github.mrh0.goodscript.ir.data

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsTuple
import github.mrh0.goodscript.values.numbers.GsInt
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRTuple(location: Loc, val values: List<IIR>) : IR(location) {
    override fun evaluate(vm: VM, c: Context): GsBase {
        return GsTuple(values.map { it.evaluate(vm, c) }.toTypedArray())
    }

    override fun toString() = values.joinToString("&", "(", ")")
}
