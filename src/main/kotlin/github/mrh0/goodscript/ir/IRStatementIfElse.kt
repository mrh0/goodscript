package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsBool
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRStatementIfElse(location: Loc, private val conditions: List<IIR>, private val bodies: List<IIR>, private val elseBody: IIR) : IR(location) {
    override fun toString(): String {
        return "if($conditions, $bodies, else: $elseBody)"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        for (i in conditions.indices) {
            if((conditions[i].evaluate(vm, c) as GsBool).value) {
                return bodies[i].evaluate(vm, c)
            }
        }
        return elseBody.evaluate(vm, c)
    }
}