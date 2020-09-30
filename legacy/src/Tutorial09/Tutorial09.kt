package Tutorial09

// import Tutorial08.lastChar
// import Tutorial08.*
import Tutorial08.lastChar as Last

fun main() {
    println("Martin".Last())
    val list = listOf("This ", "is"," tutorial08")
    println(list.joinToString())
}