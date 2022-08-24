package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsTypeError
import github.mrh0.goodscript.types.GsIntType
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.values.GsInt
import github.mrh0.goodscript.values.GsValue
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

class TAdd(val left: ITok, val right: ITok, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "+i"
    }

    override fun check(vm: VM, c: Context): GsType {
        return when {
            left.check(vm, c) is GsIntType && left.check(vm, c) is GsIntType -> GsIntType
            else -> throw GsTypeError("+")
        }
    }
}