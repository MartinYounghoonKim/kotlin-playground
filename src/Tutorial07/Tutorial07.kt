package Tutorial07

import java.lang.StringBuilder

fun main() {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())

    val list = listOf(1, 2, 3)
    println(joinToString(list, ";", "(", ")"))
    println(joinToString(list))
    println(joinToString(list, prefix = "[", postfix = "]"))
}

fun <T> joinToString (collection: Collection<T>, separator: String = ", ", prefix: String = "", postfix:String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }

        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}