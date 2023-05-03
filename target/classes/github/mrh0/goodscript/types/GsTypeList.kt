package github.mrh0.goodscript.types

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsTuple

class GsTypeList(val arg: GsTypeBase) : GsTypeBase("Gs", "List") {
    override fun toString() = "List<$arg>"

    override fun getJavaClass(location: Loc): Class<*> = GsTuple.javaClass

    override fun accepts(location: Loc, type: GsTypeBase): Boolean {
        if(type !is GsTypeList) return false
        if(!arg.accepts(location, type.arg)) return false
        return true
    }
}