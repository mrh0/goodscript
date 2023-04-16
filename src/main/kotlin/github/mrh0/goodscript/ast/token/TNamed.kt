package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ast.Tok
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRNamed
import github.mrh0.goodscript.ir.IRValue
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeInt
import github.mrh0.goodscript.values.GsInt

class TNamed (location: Loc, val name: String) : Tok(location) {
    override fun toString(): String {
        return "$${name}"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        return Pair(cd.ctx().getType(name), IRNamed(location, name, cd.ctx().getIndex(name)))
    }
}