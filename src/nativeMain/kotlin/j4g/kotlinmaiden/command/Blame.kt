package j4g.kotlinmaiden.command

import j4g.kotlinmaiden.component.*

class Blame : Command {
    override fun test(args: Array<String>): Boolean {
        return args.size > 1
    }

    override fun execute(args: Array<String>) {
        println("&$(@%# " + args[1])
    }

    override fun id() = "blame"
    override fun help() = "blame <someone> - Blames on someone"
}