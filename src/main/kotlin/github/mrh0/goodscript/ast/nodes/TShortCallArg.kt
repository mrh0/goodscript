package github.mrh0.goodscript.ast.nodes

import org.antlr.v4.runtime.Token
import java.io.File

class TShortCallArg(val name: String, val arg: ITok, token: Token, file: File) : Tok(token, file) {
    override fun toString(): String {
        return "TShortCall($name, $arg)"
    }
}