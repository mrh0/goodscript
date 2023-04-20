package github.mrh0.goodscript.reflect

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBool
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.values.GsBase
import java.lang.reflect.Method

object TypeMapper {

    fun getGsType(location: Loc, javaClass: Class<*>) = when (javaClass) {
        Int::class.java -> GsTypeInt
        Boolean::class.java -> GsTypeBool
        else -> throw GsError(location, "No such Gs Datatype")
    }

    fun getGsValue(location: Loc, javaClass: Class<*>, value: Any) =
        getGsType(location, javaClass).construct(location, value)

    fun getMethodArgumentTypeList(location: Loc, method: Method) =
        method.parameters.map { getGsType(location, it.type) }

    fun getNativeValues(location: Loc, values: Array<GsBase>) = values.map { it.getNativeValue(location) }
    fun getNativeTypes(location: Loc, values: Array<GsBase>) = values.map { it.getType().getJavaClass(location) }
}