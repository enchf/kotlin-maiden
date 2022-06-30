package j4g.kotlinmaiden.command

import j4g.kotlinmaiden.component.*
import j4g.kotlinmaiden.component.Help

@Name("blame")
@Help("blame <name> - Blames against someone")
class Blame : Command {
    override fun test(args: Array<String>): Boolean {
        return args.size > 1
    }

    override fun execute(args: Array<String>) {
        println("&$(@%# " + args[1])
    }
}