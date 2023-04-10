import main.antlr4.ChatLexer
import main.antlr4.ChatParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.TokenStream
import java.io.InputStream

fun main(args: Array<String>) {
    val lexer = ChatLexer(CharStreams.fromFileName("src/main/kotlin/test.txt"));
    println(lexer.allTokens)
    val parser = ChatParser(CommonTokenStream(lexer));
//    println(parser.name())

    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}