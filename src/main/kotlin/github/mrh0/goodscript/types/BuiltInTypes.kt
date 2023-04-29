package github.mrh0.goodscript.types

import github.mrh0.goodscript.types.numbers.GsTypeFloat
import github.mrh0.goodscript.types.numbers.GsTypeInt

object BuiltInTypes {
    private val builtInPrimitives: List<GsTypeBase> = listOf(
        GsTypeInt,
        GsTypeFloat,
        GsTypeBool,
        GsTypeString,
        GsTypeAtom,
        GsTypeNone
    )
    val builtInNamespaceMap: Map<String, GsTypeBase> = builtInPrimitives.associateBy { it.toString() }
    val builtInNameMap: Map<String, GsTypeBase> = builtInPrimitives.associateBy { it.identifier }
    fun getType(test: String): GsTypeBase = builtInNameMap.getOrElse(test) { builtInNamespaceMap.getOrElse(test) { throw Exception("No such type $test") } }
}

