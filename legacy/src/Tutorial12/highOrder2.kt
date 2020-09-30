package Tutorial12.high2

fun main () {
    val result = highOrder(sum = ::sum, a = 2, b = 3) // 참조에 의한 호출
    println(result);
}

fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b);
}

fun sum (a: Int, b: Int): Int = a + b
