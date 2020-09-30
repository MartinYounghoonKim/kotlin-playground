import java.math.BigInteger

fun main () {
    val number = 4
    val result: Long
    result = factorial(4)

    println("Factorial: $number -> $result")
}

// 일반 재귀 함수
fun factorial (n: Int): Long  = if (n == 1) n.toLong() else n * factorial(n-1)

// 꼬리 재귀 함수
tailrec fun tailFactorial (n: Int, run: Int = 5): Long = if (n == 1) run.toLong() else tailFactorial(n-1, run*n)

fun fibonacci (n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}
