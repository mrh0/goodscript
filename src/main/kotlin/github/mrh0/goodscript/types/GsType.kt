package github.mrh0.goodscript.types

open class GsType {
    fun getType(): Class<*> {
        return this.javaClass;
    }

    fun getName(): String {
        return this.javaClass.name
    }

    fun isSameType(other: GsType): Boolean {
        return this.getType() == other.getType()
    }

    open fun invoke(vararg args: GsType): GsType {
        throw Exception("Cannot invoke ${getType()}")
    }
}