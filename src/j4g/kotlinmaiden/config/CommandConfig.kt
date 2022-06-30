package j4g.kotlinmaiden.config

import j4g.kotlinmaiden.command.Greet
import j4g.kotlinmaiden.command.Blame
import j4g.kotlinmaiden.command.Help
import j4g.kotlinmaiden.component.Command
import j4g.kotlinmaiden.component.Executable

object CommandConfig {
    private val FUNCTIONAL_COMMANDS = arrayOf(Greet(), Blame())
    private val HELP: Command = Help()
    private val COMMAND_MAP = buildFullMap()
    private val FUNCTIONAL_COMMAND_MAP = buildMap(false)

    fun allFunctionalCommands(): Map<String, Command> {
        return FUNCTIONAL_COMMAND_MAP
    }

    fun allCommands(): Map<String, Executable> {
        return COMMAND_MAP
    }

    private fun buildMap(includeHelp: Boolean): Map<String, Command> {
        val commands = if (includeHelp) FUNCTIONAL_COMMANDS + HELP else FUNCTIONAL_COMMANDS
        return commands.associateBy { it.id() }
    }

    private fun buildFullMap(): Map<String, Executable> {
        return buildMap(true)
    }
}