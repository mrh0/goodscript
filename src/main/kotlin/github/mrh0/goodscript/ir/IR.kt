package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsValue
import github.mrh0.goodscript.vm.VM

open class IR(val location: Loc) {
    open fun eval(vm: VM): GsValue = TODO("Not Implemented")
}