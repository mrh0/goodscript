package github.mrh0.goodscript.reflect

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.GsTypeBool
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.values.GsValueNone
import java.lang.reflect.Method

object TypeMapper {

    fun asString(javaClass: Class<*>) = "${javaClass.packageName}.${javaClass.typeName}"

    fun getGsType(location: Loc, javaClass: Class<*>) = when (javaClass) {
        Int::class.java, Int::class.javaPrimitiveType -> GsTypeInt
        Boolean::class.java, Boolean::class.javaPrimitiveType -> GsTypeBool
        Unit::class.java, Void::class.java, Void::class.javaPrimitiveType -> GsTypeNone
        else -> throw GsError(location, "No such Gs Datatype ${asString(javaClass)}")
    }

    fun getGsValue(location: Loc, javaClass: Class<*>, value: Any?) =
        if(value == null) GsValueNone else getGsType(location, javaClass).construct(location, value)

    fun getMethodArgumentTypeList(location: Loc, method: Method) =
        method.parameters.map { getGsType(location, it.type) }

    fun getNativeValues(location: Loc, values: Array<GsBase>) = values.map { it.getNativeValue(location) }.toTypedArray()
    fun getNativeTypes(location: Loc, values: Array<GsBase>) = values.map { it.getType().getJavaClass(location) }.toTypedArray()
}