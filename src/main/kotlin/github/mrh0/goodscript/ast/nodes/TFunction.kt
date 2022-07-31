package github.mrh0.goodscript.ast.nodes

import org.antlr.v4.runtime.Token
import java.io.File

class TFunction(val block: TBlock, val name: String, val args: MutableList<String>, token: Token, file: File) : Tok(token, file) {
    override fun toString(): String {
        return "TFunction($block)"
    }
}