fun main () {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'
    if (score >= 90.0) {
        grade = 'A'
    } else if (score in 80.0..89.9) {
    // (score >= 80.0 && score <= 89.9) 와 같은 조건
        grade = 'B'
    } else if (score in 70.7..79.9) {
    // (score >= 70.7 && score <= 79.9) 와 같은 조건
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}
