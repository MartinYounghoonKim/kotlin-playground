fun main () {
    retFunc()

    val lambdaMessage = lambda@ { num: Int ->
        if (num !in 1..100) {
            return@lambda "Error"
        }
        "Success"
    }
    val anonymousMessage = fun (num: Int): String {
        if (num !in 1..100) {
            return "Error"
        }
        return "Success"
    }

    println(lambdaMessage(101))
    println(anonymousMessage(101))
}

inline fun inlineLambda (a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a,b)
}

fun retFunc () {
    println("start of retFunc")
    inlineLambda(13, 3, lit@{ a, b ->
        val result = a + b
        if (result > 10) return@lit // lit 으로 감싸진 람다 함수 부분만 빠져나간다
        println("result: $result")
    })
    inlineLambda(13, 3, { a, b ->
        val result = a + b
        if (result > 10) return@inlineLambda // 람다식 이름을 추가해주면, 묵시적으로 작성해줄수도 있다.
        println("result: $result")
    })
    println("end of retFunc")
}
