import j4g.kotlinmaiden.component.Executable
import j4g.kotlinmaiden.config.CommandConfig

fun main(args: Array<String>) {
    val invalid = object : Executable {
        override fun accept(t: Array<String>) {
            println("Invalid args: " + t.contentToString())
        }
    }
    val command = CommandConfig.allCommands()[args[0]] ?: invalid

    command.accept(args)
}
