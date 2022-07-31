package github.mrh0.goodscript.ast.nodes

import org.antlr.v4.runtime.Token
import java.io.File

interface ITok {
    fun getFilename(): String
    fun getLine(): Int
    fun getRow(): Int
    fun getToken(): Token
}