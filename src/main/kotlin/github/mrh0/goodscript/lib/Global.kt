package github.mrh0.goodscript.lib

import github.mrh0.goodscript.reflect.GsExport

@GsExport
fun log(value: Int) = println("LOG: $value")

@GsExport
fun log(value: Boolean) = println("LOG: $value")