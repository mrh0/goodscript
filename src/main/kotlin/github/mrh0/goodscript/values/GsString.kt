package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBool
import github.mrh0.goodscript.types.GsTypeString

class GsString(val value: String) : GsBase() {
    override fun getType() = GsTypeString
    override fun toString() = value
    override fun getNativeValue(location: Loc) = value
}