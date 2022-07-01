package j4g.kotlinmaiden.component

import kotlin.reflect.KAnnotatedElement

interface Command : Executable, Identifiable<String>, Validable, Helpable {
    override fun accept(args: Array<String>) {
        if (test(args)) execute(args) else throw RuntimeException("Invalid args: " + args.contentToString())
    }

    override fun test(args: Array<String>): Boolean {
        return true
    }

    fun execute(args: Array<String>)
}