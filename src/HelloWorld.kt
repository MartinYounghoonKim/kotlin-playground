fun main (args: Array<String>) {
    val immutable = "immutable" // 변경 불가능한 참조를 저장하는 변수(value)
    var mutable = "mutable" // 변경 가능한 참조 (variable)
    // 실제 함수형 프로그래머 중에서 변경 불가능한 변수를 표현하기 위해 "값(value)" 혹은 "이름(name)"이라는 단어를 사용하기도 함.
    val name = if (args.size > 0) args[0] else "Kotlin"

    println("Hello $name!")
    println("Hello ${name}!")
    println("Hello ${if (args.size > 0) args[0] else "Stranger"}!")

    val person = Person("martin", true)
    person.name // 읽기 전용
    person.isMarried = false // 쓰기도 가능
}

