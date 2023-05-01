package github.mrh0.goodscript.vm

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError

object Modules {
    fun parseModuleReference(location: Loc, ref: String): Pair<String, String> {
        val list = ref.trim().split(":")
        if (list.size == 1) return Pair("gs", list[0])
        if (list.size != 2) throw GsError(location, "Invalid module reference '$ref'")
        return Pair(list[0], list[1])
    }
}