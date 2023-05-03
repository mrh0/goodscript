package github.mrh0.goodscript.reflect

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.error.GsError
import github.mrh0.goodscript.types.*
import github.mrh0.goodscript.types.numbers.GsTypeInt
import github.mrh0.goodscript.types.numbers.GsTypeFloat
import github.mrh0.goodscript.values.*
import java.lang.reflect.Method
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

object TypeMapper {
    fun getGsType(location: Loc, type: Type, genericType: Type?): GsTypeBase {
        return when (type) {
            Integer::class.java, Int::class.java, Int::class.javaPrimitiveType -> GsTypeInt
            Float::class.java, Float::class.javaPrimitiveType -> GsTypeFloat
            Double::class.java, Double::class.javaPrimitiveType -> GsTypeFloat
            Boolean::class.java, Boolean::class.javaPrimitiveType -> GsTypeBool
            String::class.java -> GsTypeString
            Pair::class.java -> GsTypeTuple(getGenericGsTypes(location, genericType))
            Triple::class.java -> GsTypeTuple(getGenericGsTypes(location, genericType))
            Unit::class.java, Void::class.java, Void::class.javaPrimitiveType -> GsTypeNone

            //GsInt::class.java -> GsTypeInt
            //GsFloat::class.java -> GsTypeFloat
            //GsString::class.java -> GsTypeString
            //GsBool::class.java -> GsTypeBool
            Any::class.java, Object::class.java -> GsTypeBoxed
            else -> throw GsError(location, "No such Gs Datatype $type")
        }
    }

    fun getGenericGsTypes(location: Loc, type: Type?): Array<GsTypeBase> {
        if(type == null) return arrayOf()
        if(type !is ParameterizedType) throw GsError(location, "Type $type must have generic parameters generic")
        return type.actualTypeArguments.map {
            getGsType(location, if(it is ParameterizedType) it.rawType else it, it)
        }.toTypedArray()
    }

    fun getGsValue(location: Loc, javaType: Type, value: Any?) =
        if(value == null) GsValueNone else getGsType(location, javaType, null).construct(location, value)

    fun getMethodArgumentTypeList(location: Loc, method: Method): List<GsTypeBase> {
        return method.parameterTypes.mapIndexed { i, it -> getGsType(location, it, method.genericParameterTypes[i]) }
    }

    fun getNativeValues(location: Loc, values: Array<GsBase>) = values.map { it.getNativeValue(location) }.toTypedArray()
    fun getNativeTypes(location: Loc, values: Array<GsBase>) = values.map { it.getType().getJavaClass(location) }.toTypedArray()
}