package github.mrh0.goodscript.ast

import org.antlr.v4.runtime.Token
import java.io.File

class Loc(val token: Token, val file: File) {
    fun getFilename(): String = file.name
    fun getLine(): Int = token.line
    fun getRow(): Int = token.charPositionInLine
}