package github.mrh0.goodscript.ast

abstract class Tok(val location: Loc) : ITok {
    override fun toString(): String {
        return this.javaClass.name
    }
}