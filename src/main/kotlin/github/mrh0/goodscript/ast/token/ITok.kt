package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.VM
import org.antlr.v4.runtime.Token

interface ITok {
    fun process(vm: VM, list: MutableList<IR>): GsType
}