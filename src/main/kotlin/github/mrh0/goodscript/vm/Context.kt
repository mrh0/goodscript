package github.mrh0.goodscript.vm

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.state.IVar

class Context(val name: String, val vars: Array<IVar>) {
    companion  object {
        val IDENTITY = Context("IDENTITY", arrayOf())
    }

    private var shouldReturn = false;
    fun flagReturn() { shouldReturn = true }
    fun captureReturn() { shouldReturn = false }
    fun isReturnFlagged() = shouldReturn

    private var shouldContinue = false;
    fun flagContinue() { shouldContinue = true }
    fun captureContinue() { shouldContinue = false }
    fun isContinueFlagged() = shouldContinue

    private var shouldBreak = false;
    fun flagBreak() { shouldBreak = true }
    fun captureBreak() { shouldBreak = false }
    fun isBreakFlagged() = shouldBreak

    fun getValue(location: Loc, index: Int) = vars[index].getValue(location)
    fun setValue(location: Loc, index: Int, value: GsBase) = vars[index].setValue(location, value)
}
