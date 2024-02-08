package github.mrh0.goodscript.lib

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.reflect.GsExport
import github.mrh0.goodscript.values.GsAtom
import kotlin.system.exitProcess

@GsExport
fun log(value: Int) = println("LOG: $value")

@GsExport
fun log(value: Boolean) = println("LOG: $value")

@GsExport
fun log(value: String) = println("LOG: $value")

@GsExport
fun log(value: Double) = println("LOG: $value")

@GsExport
fun log(value: Pair<Int, Int>) = println("LOG: $value")

@GsExport
fun log(value: Any) = println("LOG: $value")

@GsExport
fun log(value: GsAtom) = println("LOG: $value")

@GsExport
fun assert(value: Boolean) = if (!value) throw GsError(Loc.IDENTITY, "Assertion failed") else Unit

@GsExport
fun exit(value: Int): Nothing = exitProcess(value)

@GsExport
fun logi(value: Pair<Int, Pair<Int, Int>>) = println("LOG: $value")