package j4g.kotlinmaiden.command

import j4g.kotlinmaiden.component.*
import j4g.kotlinmaiden.component.Help

@Name("greet")
@Help("greet <name> - Greets a person")
class Greet : Command {
    override fun test(args: Array<String>): Boolean {
        return args.size > 1
    }

    override fun execute(args: Array<String>) {
        println("Hello " + args[1])
    }
}