package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsType
import java.lang.reflect.Method

class GsJavaFunction<T>(val method: Method, val returnType: IOf<T>) : GsAny() {
    override fun getType(): GsType {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun invoke(vararg args: GsAny): GsAny {
        return returnType.of(method.invoke(this, *args) as T)
    }
}