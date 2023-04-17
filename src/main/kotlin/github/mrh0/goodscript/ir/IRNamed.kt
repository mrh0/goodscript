package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRNamed(location: Loc, private val name: String, private val index: Int) : IR(location) {
    override fun toString(): String {
        return "$$index"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        return c.getValue(location, index)
    }
}