package github.mrh0.goodscript.ast.nodes

import org.antlr.v4.runtime.Token
import java.io.File

open class Tok(private var token: Token, private var file: File) : ITok {
    override fun getFilename(): String {
        return file.name
    }

    override fun getLine(): Int {
        return token.line
    }

    override fun getRow(): Int {
        return token.charPositionInLine
    }

    override fun getToken(): Token {
        return token
    }

    override fun toString(): String {
        return this.javaClass.name
    }
}