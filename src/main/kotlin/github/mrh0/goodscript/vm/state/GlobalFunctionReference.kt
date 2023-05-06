package github.mrh0.goodscript.vm.state

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsGlobalFunction

class GlobalFunctionReference(private val name: String, private val type: GsTypeBase, val ref: GsGlobalFunction) : IVar {
    override fun getName() = name
    override fun getType() = type
    override fun getValue(location: Loc): GsBase = ref
    override fun setValue(location: Loc, value: GsBase) = throw GsError(location, "Cannot re-assign a global function")
}