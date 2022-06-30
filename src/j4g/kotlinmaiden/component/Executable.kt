package j4g.kotlinmaiden.component

import java.lang.FunctionalInterface
import java.util.function.Consumer

@FunctionalInterface
interface Executable : Consumer<Array<String>>
