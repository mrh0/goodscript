package github.mrh0.goodscript.vm.state

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

interface IVar {
    fun getValue(location: Loc): GsBase
    fun setValue(location: Loc, value: GsBase)
    fun getName(): String
    fun getType(): GsTypeBase
}