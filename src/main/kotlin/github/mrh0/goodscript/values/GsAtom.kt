package github.mrh0.goodscript.values

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeAtom
import github.mrh0.goodscript.types.GsTypeBool

class GsAtom private constructor(private val value: String) : GsBase() {
    companion object {
        private val map = mutableMapOf<String, GsAtom>()
        fun of(value: String) = map.getOrPut(value) { GsAtom(value) }
    }

    override fun getType() = GsTypeAtom
    override fun toString() = value
    override fun getNativeValue(location: Loc) = this
}