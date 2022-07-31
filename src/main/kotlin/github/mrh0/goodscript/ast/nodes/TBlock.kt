package github.mrh0.goodscript.ast.nodes

import org.antlr.v4.runtime.Token
import java.io.File

class TBlock(val statements: MutableList<TStatement>, token: Token, file: File) : Tok(token, file) {
    override fun toString(): String {
        return "TBlock$statements"
    }
}