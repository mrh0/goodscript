package github.mrh0.goodscript.ast.nodes

class TBlock(val statements: MutableList<TStatement>) : ITok {
    override fun toString(): String {
        return "TBlock$statements"
    }
}