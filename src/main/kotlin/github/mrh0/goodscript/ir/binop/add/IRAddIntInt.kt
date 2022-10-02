package github.mrh0.goodscript.ir.binop.add

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsValue
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRAddIntInt(location: Loc) : IR(location) {
    override fun evaluate(vm: VM, c: Context): GsValue {
        TODO("Not yet implemented")
    }
}