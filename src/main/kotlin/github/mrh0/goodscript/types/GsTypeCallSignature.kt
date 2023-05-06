package github.mrh0.goodscript.types

class GsTypeCallSignature(val args: Array<GsTypeBase>, val ret: GsTypeBase) : GsTypeBase("Gs", "CallSignature") {
    override fun toString() = args.joinToString(",", "(", "): $ret") { it.toString() }
}