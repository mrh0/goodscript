package github.mrh0.goodscript.ast.nodes

import org.antlr.v4.runtime.Token
import java.io.File

class TShortcallArg(val fnName: String, val arg: ITok, token: Token, file: File) : Tok(token, file) {
}