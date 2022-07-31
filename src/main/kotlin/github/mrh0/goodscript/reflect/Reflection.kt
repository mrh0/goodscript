package github.mrh0.goodscript.reflect

class Reflection {
    fun getClass(name: String): Class<*> {
        return Class.forName(name)
    }

    fun call(cl: Class<*>, name: String, types: Class<*>) {
        val method = cl.javaClass.getMethod(name, types)
        val returnType = method.returnType
    }
}