package github.mrh0.goodscript.vm

import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

class Context(val name: String, val types: Array<GsTypeBase>, val values: Array<GsBase>, val names: Array<String>) {
    companion  object {
        val IDENTITY = Context("IDENTITY", arrayOf(), arrayOf(), arrayOf())
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

    fun getValue(index: Int) = values[index]
    fun setValue(index: Int, value: GsBase) {
        values[index] = value
    }
}
