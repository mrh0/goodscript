package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class TInteger(val value: Int, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "${value}i"
    }

    override fun process(vm: VM, c: Context): Pair<GsType, ITok> {
        TODO("Not yet implemented")
    }
}