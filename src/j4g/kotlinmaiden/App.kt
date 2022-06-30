package j4g.kotlinmaiden

import j4g.kotlinmaiden.component.Executable
import j4g.kotlinmaiden.config.CommandConfig
import kotlin.jvm.JvmStatic

object App {
    @JvmStatic
    fun main(args: Array<String>) {
        val invalid = object : Executable {
            override fun accept(t: Array<String>) {
                println("Invalid args: " + t.contentToString())
            }
        }
        CommandConfig.allCommands().getOrDefault(args[0], invalid).accept(args)
    }
}