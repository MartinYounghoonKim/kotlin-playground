package Tutorial05

fun main() {
    for (i in 1..100) {
//        println(fizzBuzz(i))
    }
    for (i in 100 downTo 1 step 2) {
//        println(fizzBuzz(i))
    }
    println(isLetter('a'));
}
fun fizzBuzz (i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun isLetter (c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotLetter (c: Char) = c !in '0'..'9'
fun recognize (c: Char) = when (c) {
    in 'a'..'z' -> { "This is a letter" }
    in '0'..'9' -> { "This is a digit" }
    else -> "I don't know..."
}

