package j4g.kotlinmaiden.command

import j4g.kotlinmaiden.component.*

class Greet : Command {
    override fun test(args: Array<String>): Boolean {
        return args.size > 1
    }

    override fun execute(args: Array<String>) {
        println("Hello " + args[1])
    }

    override fun id() = "greet"
    override fun help() = "greet <someone> - Greets someone"
}