package github.mrh0.goodscript.ir.op

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.ir.IRInteger
import github.mrh0.goodscript.types.GsInteger
import github.mrh0.goodscript.vm.VM
import kotlin.reflect.typeOf

class IRAdd(var left: IR, var right: IR, location: Loc) : IR(location) {
    override fun process(vm: VM): IR {
        left = left.process(vm)
        right = right.process(vm)


        val l = left.check(vm)
        val r = right.check(vm)
        return when {
            l is GsInteger && r is GsInteger -> IRAddIntegerInteger(left, right, location)
            else -> throw Exception("Type check error")
        }
    }
    class IRAddIntegerInteger(val left: IR, val right: IR, location: Loc) : IR(location) {

    }
}