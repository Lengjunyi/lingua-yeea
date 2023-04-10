import main.antlr4.ExprBaseVisitor
import main.antlr4.ExprParser
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode

class ExpVisitor : ExprBaseVisitor<Int>() {
    override fun visit(tree: ParseTree?): Int {
        println("called on " + tree!!.javaClass)
        return super.visit(tree)
    }
    
    override fun visitProg(ctx: ExprParser.ProgContext?): Int {
        println(ctx!!.childCount)
        val value = visit(ctx.getChild(0))
        return value
    }

    override fun visitExpr(ctx: ExprParser.ExprContext?): Int {
        val n = ctx!!.INT()
        if (n != null) {
            println("string is " + n.toString())
            return n.toString().toInt()
        }
        println("child is" + ctx!!.getChild(0))
        println("visited expr")
        return super.visitExpr(ctx)
    }

    override fun visitTerminal(node: TerminalNode?): Int {
        println(node.toString())
        return 1
    }

}