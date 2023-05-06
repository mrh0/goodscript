package github.mrh0.goodscript.ir.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsFunction
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM
import github.mrh0.goodscript.vm.function.FunctionOverride

class IRFunctionCall(location: Loc, val name: String, val contextIndex: Int, val args: List<IIR>) : IR(location) {
    override fun toString(): String {
        return "$name($args)"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        val fn = c.getValue(location, contextIndex) as GsFunction
        return fn.call(location, vm, vm.getContextOrDefault(name, c), args.map { it.evaluate(vm, c) }.toTypedArray())
    }
}