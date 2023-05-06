package github.mrh0.goodscript.types

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.values.GsAtom
import github.mrh0.goodscript.values.GsBase

object GsTypeAtom : GsTypeBase("Gs", "Atom") {
    override fun construct(location: Loc, value: Any): GsBase = value as GsAtom
}