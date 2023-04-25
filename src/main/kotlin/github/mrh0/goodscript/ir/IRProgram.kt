package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.ir.function.IRFunc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRProgram(location: Loc, val functions: List<IRFunc>) : IR(location) {
    override fun toString(): String {
        return "$functions"
    }

    fun getMainFunction() = functions.find { it.name == "main" } ?: throw GsError(location, "No 'main' function defined")

    override fun evaluate(vm: VM, c: Context): GsBase {
        return getMainFunction().evaluate(vm, c)
    }
}