package github.mrh0.goodscript.reflect

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase
import github.mrh0.goodscript.vm.function.FunctionManager
import github.mrh0.goodscript.vm.function.FunctionOverride
import github.mrh0.goodscript.vm.function.JavaCallable
import java.lang.reflect.Method

object Reflection {
    fun getMethods(className: String): List<Method> {
        return Class.forName(className).methods.filter { it.isAnnotationPresent(GsExport::class.java) }
    }

    fun getClass(className: String) = Class.forName(className)

    fun call(className: String, methodName: String, parameterTypes: Array<Class<*>>, arguments: Array<Any>): Any {
        val clazz = Class.forName(className)
        val method = clazz.getMethod(methodName, *parameterTypes)
        // if(!method.isAnnotationPresent(GsMethod::class.java))
        return method.invoke(null, *arguments)
    }

    fun call(location: Loc, method: Method, args: Array<GsBase>): GsBase {
        val native = TypeMapper.getNativeValues(location, args)
        val res: Any? = method.invoke(null, *native)
        return TypeMapper.getGsValue(location, method.returnType, res)
    }

    fun callExternal(location: Loc, className: String, methodName: String, args: Array<GsBase>): GsBase {
        val clazz = Class.forName(className)
        val method = clazz.getMethod(methodName, *TypeMapper.getNativeTypes(location, args))
        val res = call(location, method, args)
        return TypeMapper.getGsValue(location, method.returnType, res)
    }

    fun loadMethod(location: Loc, fnm: FunctionManager, m: Method): FunctionOverride {
        val argList = TypeMapper.getMethodArgumentTypeList(location, m).toTypedArray()
        return fnm.addOverride(
            location,
            m.name,
            m.parameters.map { it.name }.toTypedArray(),
            argList,
            TypeMapper.getGsType(location, m.returnType, m.genericReturnType),
            JavaCallable(m)
        )
    }

    fun loadClass(location: Loc, fnm: FunctionManager, clazz: Class<*>) {
        clazz.methods.forEach { loadMethod(location, fnm, it) }
    }

    fun loadClass(location: Loc, fnm: FunctionManager, className: String) {
        getMethods(className).forEach { loadMethod(location, fnm, it) }
    }
}