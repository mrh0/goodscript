package github.mrh0.goodscript.ast.use

import github.mrh0.goodscript.ast.*
import github.mrh0.goodscript.error.GsOpTypeError
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRDeadEnd
import github.mrh0.goodscript.ir.arithmetic.add.IRAddIntInt
import github.mrh0.goodscript.ir.arithmetic.add.IRAddStringWithAny
import github.mrh0.goodscript.reflect.Reflection
import github.mrh0.goodscript.types.numbers.GsTypeInt
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.types.GsTypeString
import github.mrh0.goodscript.types.numbers.GsTypeFloat
import github.mrh0.goodscript.types.numbers.GsTypeNumber
import github.mrh0.goodscript.vm.function.FunctionManager

class TUseModule(location: Loc, private val module: String, private val asName: String?) : Tok(location) {
    override fun toString(): String {
        return if(asName == null) "TUse($module as $asName)" else "TUse($module)"
    }

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val fos = Reflection.loadClass(Loc.IDENTITY, FunctionManager.INSTANCE, "github.mrh0.goodscript.lib.GlobalKt")

        return Pair(GsTypeNone, IRDeadEnd)
    }
}
