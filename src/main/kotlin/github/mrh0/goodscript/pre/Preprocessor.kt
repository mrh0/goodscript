package github.mrh0.goodscript.pre

class Preprocessor(val text: String) {

    val sb: StringBuilder = StringBuilder()
    var row = 0
    var index = 0

    fun append(str: String) {
        sb.append(str)
        row++
    }
    fun append(char: Char) {
        sb.append(char)
        row++
    }

    fun next(): Char {
        return when(val c = text[index++]) {
            '\r' -> next()
            else -> c
        }
    }

    fun rollback() = index--

    fun hasNext() = index < text.length

    fun begin() {
        return newLine(next(), 0)
    }

    private fun newLine(c: Char, ei: Int) {
        append('\n')
        if(c == '\u0000')
            return
        indent(c, 0)
    }

    private fun indent(c: Char, i: Int) {
        return when(c) {
            '\t' -> indent(next(), i+1)
            '\n' -> newLine(c, i)
            else -> text(c, i)
        }
    }

    private fun text(c: Char, ei: Int) {
        return when(c) {
            '\n' -> {
                append(';')
                newLine(next(), ei)
            }
            ':' -> {
                block(next(), ei+1)
            }
            else -> {
                append(c)
                text(next(), ei)
            }
        }
    }

    fun block(c: Char, ei: Int) {
        append("§BEGIN")
        if(c != '\n')
            throw Exception("expected end of line")
        newLine(next(), ei)
        append("§END")
    }

    override fun toString() = sb.toString()
}