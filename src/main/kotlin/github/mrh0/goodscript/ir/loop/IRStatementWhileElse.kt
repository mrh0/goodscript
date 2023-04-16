package github.mrh0.goodscript.ir.loop

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsBool
import github.mrh0.goodscript.values.GsValueNone
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRStatementWhileElse(location: Loc, private val condition: IIR, private val body: IIR, private val elseBody: IIR) : IR(location) {
    override fun toString(): String {
        return "whileElse($condition, $body)"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        var result: GsBase? = null
        while((condition.evaluate(vm, c) as GsBool).value && !c.isBreakFlagged() && !c.isReturnFlagged()) {
            result = body.evaluate(vm, c)
            c.captureContinue()
        }
        c.captureBreak()
        return result ?: elseBody.evaluate(vm, c)
    }
}