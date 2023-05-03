package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

interface IArgument {
    fun getName(): String
    fun getType(): GsTypeBase
    fun match(value: GsBase): Boolean
    fun match(type: GsTypeBase): Boolean
}