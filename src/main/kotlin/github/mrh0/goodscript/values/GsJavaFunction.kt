package github.mrh0.goodscript.values

import java.lang.reflect.Method

class GsJavaFunction<T>(val method: Method, val returnType: IOf<T>) : GsValue() {
    override fun invoke(vararg args: GsValue): GsValue {
        return returnType.of(method.invoke(this, *args) as T)
    }
}