package github.mrh0.goodscript.types

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsTuple

class GsTypeTuple(val args: Array<GsTypeBase>) : GsTypeBase("Gs", "Tuple") {
    override fun toString() = args.joinToString("&", "(", ")") { it.toString() }

    override fun getJavaClass(location: Loc): Class<*> = GsTuple.javaClass
}