package Tutorial10

import Tutorial08.lastChar
import java.lang.StringBuilder

var StringBuilder.lastChar: Char
    get () = get(length - 1)
    set(value) {
        this.setCharAt(length -1, value)
    }

fun main(args: Array<String>) {
    lists(arrayOf("Martin", "Irene"))
    val stringBuilder = StringBuilder("Martia")
    stringBuilder.lastChar = 'n'
    println(stringBuilder)

    println(listOf("1", "2").last())
    println(listOf(3, 1, 2).max())
}

fun lists (args: Array<String>) {
    val list = listOf("---- args => ", *args)
    println(list)
}