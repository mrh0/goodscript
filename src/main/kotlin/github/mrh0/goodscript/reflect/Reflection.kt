package github.mrh0.goodscript.reflect

import java.lang.reflect.Method

class Reflection {
    companion object {
        fun getMethods(className: String): List<Method> {
            return Class.forName(className).methods.filter { it.isAnnotationPresent(GsMethod::class.java) }
        }

        fun call(method: Method, parameterTypes: Array<Class<*>>, arguments: Array<Any>) {
            method.invoke(null, *arguments)
        }

        fun call(className: String, methodName: String, parameterTypes: Array<Class<*>>, arguments: Array<Any>) {
            val clazz = Class.forName(className)
            val method = clazz.getMethod(methodName, *parameterTypes)
            if(!method.isAnnotationPresent(GsMethod::class.java)) return
            method.invoke(null, *arguments)
        }
    }
}

