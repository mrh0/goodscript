package github.mrh0.goodscript.ir.compare.equals

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsBool
import github.mrh0.goodscript.values.GsString
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IREqualsStringString(location: Loc, private val left: IIR, private val right: IIR) : IR(location) {
    override fun evaluate(vm: VM, c: Context): GsBase {
        return GsBool((left.evaluate(vm, c) as GsString).value == (right.evaluate(vm, c) as GsString).value)
    }

    override fun toString() = "($left s==s $right)"
}
