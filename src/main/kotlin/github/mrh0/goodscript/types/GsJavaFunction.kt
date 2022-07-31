package github.mrh0.goodscript.types

import java.lang.reflect.Method

class GsJavaFunction<T>(val method: Method, val returnType: IOf<T>) : GsType() {
    override fun invoke(vararg args: GsType): GsType {
        return returnType.of(method.invoke(this, *args) as T)
    }
}