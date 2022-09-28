package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM
import org.antlr.v4.runtime.Token
import java.io.File

class TBlock(val statements: MutableList<ITok>, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "$statements"
    }

    override fun process(vm: VM, c: Context): Pair<GsType, ITok> {
        TODO("Not yet implemented")
    }
}