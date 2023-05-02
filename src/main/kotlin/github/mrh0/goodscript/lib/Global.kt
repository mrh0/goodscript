package github.mrh0.goodscript.lib

import github.mrh0.goodscript.reflect.GsExport

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
fun logi(value: Pair<Int, Pair<Int, Int>>) = println("LOG: $value")