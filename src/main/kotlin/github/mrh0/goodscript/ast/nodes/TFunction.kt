package github.mrh0.goodscript.ast.nodes

class TFunction(val block: TBlock) : ITok {
    override fun toString(): String {
        return "TFunction($block)"
    }
}