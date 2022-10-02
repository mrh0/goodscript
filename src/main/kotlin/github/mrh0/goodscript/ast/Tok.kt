package github.mrh0.goodscript.ast

import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.types.GsType

abstract class Tok(val location: Loc) : ITok {
    override fun toString(): String {
        return this.javaClass.name
    }
}