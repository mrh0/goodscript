package github.mrh0.goodscript.types

object BuiltInTypes {
    val builtInList: List<GsTypeBase> = listOf(
        GsTypeInt,
        GsTypeBool,
        GsTypeNone
    )
    val builtInNamespaceMap: Map<String, GsTypeBase> = builtInList.associateBy { it.toString() }
    val builtInNameMap: Map<String, GsTypeBase> = builtInList.associateBy { it.identifier }
    fun getType(test: String): GsTypeBase = builtInNameMap.getOrElse(test) { builtInNamespaceMap.getOrElse(test) { throw Exception("No such type $test") } }
}

