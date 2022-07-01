package j4g.kotlinmaiden.command

import j4g.kotlinmaiden.component.Command
import j4g.kotlinmaiden.config.CommandConfig

class Help : Command {
    override fun execute(args: Array<String>) {
        val helpMessage = if (args.size > 1) commandHelp(args[1]) else HELP
        println(helpMessage)
    }

    override fun id() = "help"
    override fun help() = Help.HELP

    companion object {
        const val HELP = "Commands available: greet, blame. Type help <command> for a detailed description"
        private fun commandHelp(command: String): String {
            return CommandConfig.allFunctionalCommands()[command]?.help() ?: HELP
        }
    }
}