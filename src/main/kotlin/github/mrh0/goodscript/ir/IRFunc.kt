package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class IRFunc(location: Loc, val block: IRBlock, val name: String, val args: MutableList<String>) : IR(location) {
    override fun toString(): String {
        return "fn($name, $block)"
    }

    override fun evaluate(vm: VM, c: Context): GsBase {
        TODO("Not yet implemented")
    }
}