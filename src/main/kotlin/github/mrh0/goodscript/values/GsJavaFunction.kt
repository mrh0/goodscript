package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeBase
import java.lang.reflect.Method

class GsJavaFunction<T>(val method: Method, val returnType: IOf<T>) : GsBase() {
    override fun getType(): GsTypeBase {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun invoke(vararg args: GsBase): GsBase {
        return returnType.of(method.invoke(this, *args) as T)
    }
}