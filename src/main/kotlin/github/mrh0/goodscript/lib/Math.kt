package github.mrh0.goodscript.lib

import github.mrh0.goodscript.reflect.GsExport
import kotlin.math.pow
import kotlin.math.roundToInt

@GsExport
fun max(a: Int, b: Int) = Math.max(a, b)
@GsExport
fun max(a: Double, b: Double) = Math.max(a, b)
@GsExport
fun min(a: Int, b: Int) = Math.min(a, b)
@GsExport
fun min(a: Double, b: Double) = Math.min(a, b)

@GsExport
fun abs(a: Int) = Math.abs(a)
@GsExport
fun abs(a: Double) = Math.abs(a)

@GsExport
fun pow(a: Int, b: Int) = Math.pow(a.toDouble(), b.toDouble()).toInt()
@GsExport
fun pow(a: Double, b: Double) = a.pow(b)

@GsExport
fun ceil(a: Double) = kotlin.math.ceil(a)
@GsExport
fun floor(a: Double) = kotlin.math.floor(a)
@GsExport
fun round(a: Double) = a.roundToInt()

@GsExport
fun toInt(a: Double) = a.toInt()
@GsExport
fun toFloat(a: Int) = a.toDouble()

@GsExport
fun toDegrees(a: Double) = Math.toDegrees(a)
@GsExport
fun toRadians(a: Double) = Math.toRadians(a)

@GsExport
fun random() = Math.random()

@GsExport
fun randomRange(min: Double, max: Double) = Math.random()*(max-min)+min

@GsExport
fun pi() = Math.PI
@GsExport
fun e() = Math.E

@GsExport
fun cos(a: Double) = kotlin.math.cos(a)
@GsExport
fun sin(a: Double) = kotlin.math.sin(a)
@GsExport
fun tan(a: Double) = kotlin.math.tan(a)

@GsExport
fun acos(a: Double) = kotlin.math.acos(a)
@GsExport
fun asin(a: Double) = kotlin.math.asin(a)
@GsExport
fun atan(a: Double) = kotlin.math.atan(a)

@GsExport
fun acosh(a: Double) = kotlin.math.acosh(a)
@GsExport
fun asinh(a: Double) = kotlin.math.asinh(a)
@GsExport
fun atanh(a: Double) = kotlin.math.atanh(a)
@GsExport
fun atan2(x: Double, y: Double) = kotlin.math.atan2(x, y)

@GsExport
fun hypot(x: Double, y: Double) = kotlin.math.hypot(x, y)

@GsExport
fun exp(x: Double) = kotlin.math.exp(x)
@GsExport
fun expm1(x: Double) = kotlin.math.expm1(x)

@GsExport
fun ln(x: Double) = kotlin.math.ln(x)

@GsExport
fun ln1p(x: Double) = kotlin.math.ln1p(x)

@GsExport
fun logn(x: Double, n: Double) = kotlin.math.log(x, n)
@GsExport
fun log10(x: Double) = kotlin.math.log10(x)
@GsExport
fun log2(x: Double) = kotlin.math.log2(x)

@GsExport
fun sign(x: Double) = kotlin.math.sign(x)

@GsExport
fun clamp(a: Double) = kotlin.math.max(-1.0, kotlin.math.min(a, 1.0))
@GsExport
fun clamp(a: Double, min: Double, max: Double) = kotlin.math.max(min, kotlin.math.min(a, max))

@GsExport
fun lerp(a: Double, b: Double, f: Double) = a * (1 - f) + b * f

@GsExport
fun frac(f: Double) = if (f > 0.0) f - floor(f) else f + floor(f)

@GsExport
fun add(a: Double, b: Double) = a + b
@GsExport
fun add(a: Int, b: Int) = a + b

@GsExport
fun sub(a: Double, b: Double) = a - b
@GsExport
fun sub(a: Int, b: Int) = a - b

@GsExport
fun mul(a: Double, b: Double) = a * b
@GsExport
fun mul(a: Int, b: Int) = a * b

@GsExport
fun div(a: Double, b: Double) = a / b
@GsExport
fun div(a: Int, b: Int) = a / b

@GsExport
fun mod(a: Double, b: Double) = a % b
@GsExport
fun mod10(a: Double) = a % 10
@GsExport
fun mod2(a: Double) = a % 2

@GsExport
fun sqrt(x: Double) = kotlin.math.sqrt(x)