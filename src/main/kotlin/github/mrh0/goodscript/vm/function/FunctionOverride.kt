package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeFunction
import github.mrh0.goodscript.values.GsBase

class FunctionOverride(val name: String, val argNames: Array<String>, val argTypes: Array<GsTypeBase>, val ret: GsTypeBase, val callable: ICallable) {
    fun match(location: Loc, types: Array<GsTypeBase>): Boolean {
        if(types.size != argTypes.size) return false
        for(i in types.indices) {
            if(!types[i].accepts(location, argTypes[i])) return false
        }
        return true
    }

    fun match(location: Loc, values: Array<GsBase>): Boolean {
        for(i in values.indices) {
            if(!values[i].match(location, argTypes[i])) return false
        }
        return true
    }

    fun getType() = GsTypeFunction(argTypes, ret)
}