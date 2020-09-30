fun main () {
    val source = "Hello World !"
    val target = "Kotlin Kotlin Kotlin"
    println(source.getLongString(target))

    val multi = 3 multiply 10   // 중위 연산자
    println(multi)
}

fun String.getLongString (target: String): String =
    if (this.length > target.length) this else target

// infix 를 통해 중위 함수를 선언할 수 있다.
 infix fun Int.multiply (x: Int): Int {
    return this * x
}
