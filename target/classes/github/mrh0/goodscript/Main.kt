package github.mrh0.goodscript

import Root
import github.mrh0.goodscript.antlr.GoodscriptLexer
import github.mrh0.goodscript.antlr.GoodscriptParser
import github.mrh0.goodscript.ast.CompileData
import github.mrh0.goodscript.ast.Visitor
import github.mrh0.goodscript.ast.ITok
import github.mrh0.goodscript.ast.Loc
import github.mrh0.goodscript.reflect.Reflection
import github.mrh0.goodscript.vm.Context
import github.mrh0.goodscript.vm.VM
import github.mrh0.goodscript.vm.function.FunctionManager
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileInputStream
import java.nio.file.Path

fun main(args: Array<String>) {
    Reflection.loadClass(Loc.IDENTITY, FunctionManager.INSTANCE, "github.mrh0.goodscript.lib.GlobalKt")
    val file = Path.of(Root::class.java.classLoader.getResource("test.gs").toURI()).toFile()

    val stream = if (file == null) System.`in` else FileInputStream(file)
    val input = ANTLRInputStream(stream)

    val lexer = GoodscriptLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = GoodscriptParser(tokens)

    val tree: ITok = Visitor(file).visitProgram(parser.program())
    println(tree)

    val cd = CompileData()
    val (_, ir) = tree.process(cd)
    println(ir)
    cd.finalize()

    println("Exit: ${ir.evaluate(VM(cd), Context.IDENTITY)}")
}
