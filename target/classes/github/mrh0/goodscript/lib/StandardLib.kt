package github.mrh0.goodscript.lib

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.reflect.Reflection

class StandardLib {
    companion object {
        private val classMapper = mapOf(
            Pair("Math", "github.mrh0.goodscript.lib.MathKt"),
            Pair("IO", "github.mrh0.goodscript.lib.IOKt")
        )

        fun getModule(location: Loc, namespace: String, name: String): Class<*> {
            return when(namespace) {
                "", "gs" -> Reflection.getClass(classMapper.getOrElse(name) { throw GsError(location, "Standard module not found") })
                "jvm", "java", "kotlin" -> Reflection.getClass(name)
                "file", "jar", "kt" -> throw NotImplementedError("File loading not implemented")
                else -> throw GsError(location, "Namespace not found")
            }
        }
    }
}