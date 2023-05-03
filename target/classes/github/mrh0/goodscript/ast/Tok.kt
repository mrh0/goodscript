package github.mrh0.goodscript.ast

import github.mrh0.goodscript.values.GsValueNone

abstract class Tok(val location: Loc) : ITok {
    companion object {
        val DEAD = Pair(GsValueNone, TDeadEnd)
    }
    override fun toString(): String {
        return this.javaClass.name
    }
}