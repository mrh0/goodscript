package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.VM

open class IR(val location: Loc) {
    open fun process(vm: VM): IR = this
    open fun check(vm: VM): GsType = TODO("Not Implemented")
    open fun eval(vm: VM): GsType =  TODO("Not Implemented")
}