package github.mrh0.goodscript.ir

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsAny

abstract class IR<T : GsAny>(val location: Loc) : IIR<T> {

}