package github.mrh0.goodscript.ast

import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.values.GsBase

interface ITok {
    // Hint is for inferring types
    fun process(cd: CompileData /*, hint: GsType*/): Pair<GsTypeBase, IIR<GsBase>>
}