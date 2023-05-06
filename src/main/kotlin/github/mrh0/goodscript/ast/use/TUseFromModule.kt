package github.mrh0.goodscript.ast.use

import github.mrh0.goodscript.ast.*
import github.mrh0.goodscript.ir.IIR
import github.mrh0.goodscript.ir.IRDeadEnd
import github.mrh0.goodscript.lib.StandardLib
import github.mrh0.goodscript.reflect.GsExport
import github.mrh0.goodscript.reflect.Reflection
import github.mrh0.goodscript.types.GsTypeBase
import github.mrh0.goodscript.types.GsTypeNone
import github.mrh0.goodscript.values.GsGlobalFunction
import github.mrh0.goodscript.vm.Modules
import github.mrh0.goodscript.vm.function.FunctionManager
import github.mrh0.goodscript.vm.state.GlobalFunctionReference

class TUseFromModule(location: Loc, private val names: List<String>, private val moduleRef: String) : Tok(location) {
    override fun toString() = "TUse($names from $moduleRef)"

    override fun process(cd: CompileData): Pair<GsTypeBase, IIR> {
        val (namespace, moduleName) = Modules.parseModuleReference(location, moduleRef)
        val clazz = StandardLib.getModule(location, namespace, moduleName)

        val nameSet = names.toHashSet()
        val methods = clazz.methods.filter { it.isAnnotationPresent(GsExport::class.java) }.filter { nameSet.contains(it.name) }

        methods.forEach {
            val fos = Reflection.loadMethod(location, FunctionManager.INSTANCE, it)
            if(fos.getNumberOfOverrides() == 1)
                cd.getGlobal().define(location, GlobalFunctionReference(fos.name, fos.getType(), GsGlobalFunction(fos)))
        }

        return Pair(GsTypeNone, IRDeadEnd)
    }
}
