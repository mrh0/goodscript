package github.mrh0.goodscript.ir.arithmetic.add

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsString
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRAddStringWithAny(location: Loc, val left: IIR, val right: IIR) : IR(location) {
    override fun evaluate(vm: VM, c: Context): GsBase {
        return GsString(left.evaluate(vm, c).toString() + right.evaluate(vm, c).toString())
    }

    override fun toString() = "($left s+? $right)"
}
