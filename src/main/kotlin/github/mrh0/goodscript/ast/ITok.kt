package github.mrh0.goodscript.ast

import github.mrh0.goodscript.ast.Index
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.values.GsValue
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM

interface ITok {
    fun process(i: Index): Pair<GsType, IIR>
}