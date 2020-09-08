package Tutorial12

fun main () {
    println(callByValue(lambda()))
}

fun callByValue (b: Boolean): Boolean {
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}
