class MyClass
fun main () {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.0 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }
//    아래와 같이 인자가 없는 when 절로 사용할 수도 있음
//    when {
//        score >= 90.0 -> grade = 'A'
//        score in 80.0..89.9 -> grade = 'B'
//        score in 70.0..79.9 -> grade = 'C'
//        score < 70.0 -> grade = 'F'
//    }
    println("Score: $score, Grade: $grade")

    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(MyClass())
}

fun cases (obj: Any) {
    when (obj) {
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")   // 이와 같이 Type
        else -> println("Unknown")
    }
}
