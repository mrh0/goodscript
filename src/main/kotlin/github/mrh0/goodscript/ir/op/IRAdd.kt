package github.mrh0.goodscript.ir.op

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR

class IRAdd(var left: IR, var right: IR, location: Loc) : IR(location) {

}