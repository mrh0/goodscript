package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsTypeError
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class TAdd(val left: ITok, val right: ITok, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "+i"
    }

    override fun process(vm: VM, c: Context): Pair<GsType, ITok> {
        val l = left.process(vm, c);
        val r = right.process(vm, c);
        return when {
            l.first is GsTypeInt && r.first is GsTypeInt -> Pair(GsTypeInt, this)
            else -> throw GsTypeError("+", l.first, r.first)
        }
    }
}
