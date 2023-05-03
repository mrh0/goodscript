package github.mrh0.goodscript.ir.loop

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsValueNone
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRContinue(location: Loc) : IR(location) {
    override fun toString(): String {
        return "continue"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        c.flagContinue()
        return GsValueNone
    }
}