fun main () {
    for (i in 5 downTo 1) {
        println("downTo : $i")
    }
    for (i in 5..1) {
        println("잘못된 for-in 문 : $i 아무것도 출력되지 않는다.")
    }

    for (i in 1..5 step 2) {
        println("for-in with step : $i")
    }
    for (i in 5 downTo 1 step 2) {
        println("for-in with downTo and step : $i")
    }

    print("Enter the lines: ")
    val n = readLine()!!.toInt()

    for (line in 1..n) {
        for (space in 1..(n - line)) print(" ") // 공백 출력
        for (start in 1 until 2 * line) print("*") // 공백 출력
        println()
    }
}
