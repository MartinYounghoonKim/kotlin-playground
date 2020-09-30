package Tutorial12

fun main () {
    val result: Int
    val multi = { x: Int, y: Int ->
        println("x * y")
        x * y   // 함수의 마지막이 반환된다.
    }
    val multi2: (Int, Int) -> Int = { x: Int, y: Int -> x * y }
    val greet: () -> Unit = { println("Hello")}
    result = multi(10, 20)
    println(result)
    println(greet())
}
