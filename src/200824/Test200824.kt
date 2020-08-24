package `200824`

fun main () {
    var a: String? = "Hello Kotlin"
    a = null    // 기본적으로 코틀린은 Null 을 허용하지 않는다
    var test = a?.length

    println(test)
    println(test ?: -1)
}

fun test (name: Any): String {
    var str: String = name;
}
