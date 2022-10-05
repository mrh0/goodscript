package github.mrh0.goodscript.ast

import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.types.GsType

interface ITok {
    // Hint is for inferring types
    fun process(cd: CompileData /*, hint: GsType*/): Pair<GsType, IIR>
}