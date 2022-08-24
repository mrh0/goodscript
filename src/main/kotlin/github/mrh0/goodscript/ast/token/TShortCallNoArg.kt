package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import org.antlr.v4.runtime.Token
import java.io.File

class TShortCallNoArg(val name: String, location: Loc) : Tok(location) {
    override fun toString(): String {
        return "TShortCall($name)"
    }
}