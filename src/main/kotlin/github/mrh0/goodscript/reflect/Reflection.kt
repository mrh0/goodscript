package github.mrh0.goodscript.reflect

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.FunctionManager
import java.lang.reflect.Method

object Reflection {
    fun getMethods(className: String): List<Method> {
        return Class.forName(className).methods.filter { it.isAnnotationPresent(GsMethod::class.java) }
    }

    fun call(className: String, methodName: String, parameterTypes: Array<Class<*>>, arguments: Array<Any>): Any {
        val clazz = Class.forName(className)
        val method = clazz.getMethod(methodName, *parameterTypes)
        // if(!method.isAnnotationPresent(GsMethod::class.java))
        return method.invoke(null, *arguments)
    }

    fun call(location: Loc, method: Method, args: Array<GsBase>): GsBase {
        val res: Any = method.invoke(null, TypeMapper.getNativeValues(location, args))
        return TypeMapper.getGsValue(location, method.returnType, res)
    }

    fun callExternal(location: Loc, className: String, methodName: String, args: Array<GsBase>): GsBase {
        val clazz = Class.forName(className)
        val method = clazz.getMethod(methodName, *TypeMapper.getNativeTypes(location, args).toTypedArray())
        val res = call(location, method, args)
        return TypeMapper.getGsValue(location, method.returnType, res)
    }

    fun loadClass(location: Loc, fnm: FunctionManager, className: String) {
        getMethods(className).forEach {
            m -> fnm.addOverride(
                location,
                m.name,
                m.parameters.map { it.name },
                TypeMapper.getMethodArgumentTypeList(location, m),
                TypeMapper.getGsType(location, m.returnType)
            )
        }
    }
}