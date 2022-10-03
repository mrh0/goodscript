package github.mrh0.goodscript.ast

import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.types.GsType

interface ITok {
    fun process(cd: CompileData): Pair<GsType, IIR>
}