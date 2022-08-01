package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import org.antlr.v4.runtime.Token
import java.io.File

open class Tok(val location: Loc) : ITok {
    override fun toString(): String {
        return this.javaClass.name
    }
}