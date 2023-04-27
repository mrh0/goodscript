package github.mrh0.goodscript.vm.function

import github.mrh0.goodscript.types.GsTypeBase

class FunctionOverride(val name: String, val argNames: Array<String>, val argTypes: Array<GsTypeBase>, val ret: GsTypeBase, val callable: ICallable) {
    fun match(types: Array<GsTypeBase>): Boolean {
        if(types.size != argTypes.size) return false
        for(i in types.indices) {
            if(!types[i].match(argTypes[i])) return false
        }
        return true
    }
}