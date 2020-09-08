package Tutorial12

fun sum (a: Int, b: Int) = a + b

fun mul (a: Int, b: Int) = a * b
fun main (args: Array<String>) {
    val result = sum (10, 3)
    val result2 = mul(sum(3,3), 2)
    println("result: $result, result2 : $result2")
    println(funcFunc())
}

fun funcFunc () = sum(2,2)
