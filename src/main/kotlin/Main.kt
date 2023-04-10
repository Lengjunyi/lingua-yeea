import main.antlr4.ExprLexer
import main.antlr4.ExprParser
import org.antlr.runtime.tree.ParseTree
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.FileInputStream


fun main(args: Array<String>) {
    val inputStream = FileInputStream("src/main/kotlin/test.txt")
    val input = CharStreams.fromStream(inputStream)
    val lexer = ExprLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = ExprParser(tokens)
    val tree = parser.prog()

//    parser.buildParseTree
//    println(parser.prog())
    val visitor = ExpVisitor();
    visitor.visit(tree)
//
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}