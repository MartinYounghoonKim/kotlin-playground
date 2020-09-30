package Tutorial08

// 최상위 프로퍼티에서만 const 키워드를 사용할 수 있음
// 자바의 public static final 과 동일
const val UNIX_LINE_SEPARATOR = "\n"

fun main() {
    // Kotlin 수신 객체
    println("Kotlin".lastChar())
}

// String 은 수신 객체 타입
fun String.lastChar (): Char = this.get(this.length - 1)