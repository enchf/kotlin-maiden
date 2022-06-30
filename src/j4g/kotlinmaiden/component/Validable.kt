package j4g.kotlinmaiden.component

import java.lang.FunctionalInterface
import java.util.function.Predicate

@FunctionalInterface
interface Validable : Predicate<Array<String>>
