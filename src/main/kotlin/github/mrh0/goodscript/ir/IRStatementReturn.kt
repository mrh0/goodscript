package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRStatementReturn(location: Loc, val next: IIR) : IR(location) {
    override fun toString(): String {
        return "ret($next)"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        val ret = next.evaluate(vm, c)
        c.flagReturn()
        return ret
    }
}