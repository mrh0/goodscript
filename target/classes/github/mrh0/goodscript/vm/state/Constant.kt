package github.mrh0.goodscript.vm.state

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

class Constant(private val name: String, private val type: GsTypeBase, private var value: GsBase) : IVar {
    override fun getName() = name
    override fun getType() = type
    override fun getValue(location: Loc) = value
    override fun setValue(location: Loc, value: GsBase) {
        throw GsError(location, "Cannot re-assign a constant")
    }
}