package Tutorial02

fun main (args: Array<String>) {
    var result: Int
    val multi = { x: Int, y: Int -> x * y }
    result = multi(10, 20)
    println(result)
}
