package github.mrh0.goodscript.ir.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.ir.IRBlock
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRFunc(location: Loc, private val block: IRBlock, val name: String, val args: Array<Pair<String, GsTypeBase>>, val returnType: GsTypeBase) : IR(location) {
    override fun toString(): String {
        return "fn($name, $block)"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        val result = block.evaluate(vm, vm.getContext(name))
        c.captureReturn()
        return result
    }
}