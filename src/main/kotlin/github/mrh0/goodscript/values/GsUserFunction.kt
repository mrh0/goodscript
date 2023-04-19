package github.mrh0.goodscript.values

import github.mrh0.goodscript.types.GsTypeFunction
import java.lang.reflect.Method

class GsUserFunction<T>(val method: Method, val returnType: IOf<T>) : GsFunction() {
    override fun getType() = GsTypeFunction

    override fun invoke(vararg args: GsBase): GsBase {
        return returnType.of(method.invoke(this, *args) as T)
    }
}