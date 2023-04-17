package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsValueNone
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRStatementDefine(location: Loc, private val index: Int, private val expr: IIR) : IR(location) {
    override fun toString(): String {
        return "define($$index, $expr)"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        c.setValue(location, index, expr.evaluate(vm, c))
        return GsValueNone
    }
}