fun main () {
    shortFunc (3) {
        println("Argument is $it")
        return
    }
}

inline fun shortFunc (a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}
