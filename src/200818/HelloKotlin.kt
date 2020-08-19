package `200818`

fun main () {
    println("Hello Kotlin")

    val person = Person("Martin", 20)

    println(person)
}

data class Person (val name: String, val age: Int)
