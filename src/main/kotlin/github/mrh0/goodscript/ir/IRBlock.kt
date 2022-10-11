package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsAny
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRBlock(location: Loc, val statements: List<IIR<GsAny>>) : IR<GsAny>(location) {
    override fun toString(): String {
        return "$statements"
    }

    override fun evaluate(vm: VM, c: Context): GsAny {
        TODO("Not yet implemented")
    }
}