package j4g.kotlinmaiden.component

import java.util.Arrays
import java.lang.FunctionalInterface
import java.lang.RuntimeException

@FunctionalInterface
interface Command : Executable, Identifiable<String>, Validable, Helpable {
    override fun accept(args: Array<String>) {
        if (test(args)) execute(args) else throw RuntimeException("Invalid args: " + Arrays.toString(args))
    }

    override fun id(): String {
        return javaClass.getAnnotation(Name::class.java).value
    }

    override fun test(args: Array<String>): Boolean {
        return true
    }

    override fun help(): String {
        return javaClass.getAnnotation(Help::class.java).value
    }

    fun execute(args: Array<String>)
}