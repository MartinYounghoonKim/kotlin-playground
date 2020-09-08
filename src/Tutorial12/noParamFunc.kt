package Tutorial12

fun main () {
    noParam({ "Hello world" })
    noParam { "Hello world" }

    oneParam ({ a -> "test $a" })
    oneParam { a -> "test $a" }

    moreParam{ a, b -> "$a Martin is only $b"}
    moreParam{ _, b -> "Martin is only $b"}     // 필요한 인자만 남기고 생략도 가능

    withArgs(1, 2, { a, b -> "The add function returns ${a + b}" })
    // 함수의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs(1, 2) { a, b -> "The add function returns ${a + b}" }
}

fun noParam (out: () -> String) = println(out())
fun oneParam (out: (String) -> String) = println(out("OneParam"))
fun moreParam (out: (String, Int) -> String) = println(out("MoreParam", 1))
fun withArgs (a: Int, b: Int, out: (Int, Int) -> String) = println(out(a, b))
