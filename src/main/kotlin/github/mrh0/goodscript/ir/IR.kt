package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsBase

abstract class IR<T : GsBase>(val location: Loc) : IIR<T> {

}