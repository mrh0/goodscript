package github.mrh0.goodscript.ast.nodes

class TProgram(val functions: MutableList<TFunction>) : ITok {
    override fun toString(): String {
        return "TProgram$functions"
    }
}