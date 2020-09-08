package `200818`

import kotlin.math.PI
import kotlin.math.abs as Abs // 패키지를 다른 패키지로 받을 경우 as 키워드를 사용하면 된다.

fun main () {
    println("Hello Kotlin")

    val person = Person("Martin", 20)

    println(person)
    println("나의 이름은 ${person.name}이고 나이는 ${person.age} 입니다.")
    println(PI) // 기본적으로 코틀린에서 제공해주는 MATH 패키지가 존재

    println(Abs(-3.14))
}

data class Person (val name: String, val age: Int)
