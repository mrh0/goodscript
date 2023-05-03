package github.mrh0.goodscript.types

class GsTypeFunction(val args: Array<GsTypeBase>, val ret: GsTypeBase) : GsTypeBase("Gs", "Function") {
    override fun toString() = args.joinToString(",", "(", "): $ret") { it.toString() }
}