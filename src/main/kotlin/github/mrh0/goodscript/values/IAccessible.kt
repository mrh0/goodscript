package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeBase

interface IAccessible {
    fun access(key: GsBase): GsBase
    fun isAccessKey(keyType: GsTypeBase): Boolean
}