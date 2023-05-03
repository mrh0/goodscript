package github.mrh0.goodscript.ir.branch

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsBool
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRInlineIf(location: Loc, private val condition: IIR, private val body: IIR, private val elseBody: IIR) : IR(location) {
    override fun toString(): String {
        return "if($condition, $body, $elseBody)"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        return if((condition.evaluate(vm, c) as GsBool).value) body.evaluate(vm, c) else elseBody.evaluate(vm, c)
    }
}