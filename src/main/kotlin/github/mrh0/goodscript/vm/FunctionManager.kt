package github.mrh0.goodscript.vm

import github.mrh0.goodscript.types.GsTypeBase

class FunctionManager {
    val returnTypeCache: Map<String, GsTypeBase> = mutableMapOf()
    val namedFunctionMap: Map<String, FunctionOverrides> = mutableMapOf()
    val validSignaturesCache: Map<String, FunctionOverride> = mutableMapOf()

    fun getOverrideSignature(name: String, args: List<GsTypeBase>) = "$name:${args.size}(${args.map { "${it.identifier};" }})"
}