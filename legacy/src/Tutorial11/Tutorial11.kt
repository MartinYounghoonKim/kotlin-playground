package Tutorial11

import java.lang.StringBuilder
import kotlin.coroutines.coroutineContext

fun main() {
    val stringBuilder = StringBuilder("Martin")
    println(stringBuilder join " is KYH. ")
    val (number, name) = 1 to "one"
    println("$number is $name")
}

infix fun StringBuilder.join (value: String) = run { append(value) }
infix fun Any.to (other: Any) = Pair(this, other)