package github.mrh0.goodscript.ast.token

import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.ir.IR
import github.mrh0.goodscript.ir.IRInteger
import github.mrh0.goodscript.types.GsInteger
import github.mrh0.goodscript.types.GsType
import github.mrh0.goodscript.vm.VM
import org.antlr.v4.runtime.Token
import java.io.File

class TInteger(val value: Int, location: Loc) : Tok(location) /*IR?*/ {
    override fun toString(): String {
        return "${value}i"
    }

    override fun process(vm: VM, list: MutableList<IR>): GsType {
        list.add(IRInteger(value, location))
        return GsInteger(value)
    }
}