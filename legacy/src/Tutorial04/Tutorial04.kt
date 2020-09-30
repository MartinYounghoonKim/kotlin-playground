package Tutorial04

interface Expr
class Num (val value: Int): Expr
class Sum (val left: Expr, val right: Expr): Expr

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

//fun eval (e: Expr): Int {
//    if (e is Num) {
//        // 컴파일러가 타입 캐스팅을 수행해준다. 이를 "스마트 캐스트" 라 부른다.
//        return e.value
//    }
//    if (e is Sum) {
//        return eval(e.right) + eval(e.left)
//    }
//    throw IllegalArgumentException("Unknown expression")
//}

//fun eval (e: Expr): Int =
//    if (e is Num) {
//        // 컴파일러가 타입 캐스팅을 수행해준다. 이를 "스마트 캐스트" 라 부른다.
//        e.value
//    } else if (e is Sum) {
//        eval(e.right) + eval(e.left)
//    } else {
//        throw IllegalArgumentException("Unknown expression")
//    }

fun eval (e: Expr): Int =
    when(e) {
        is Num -> {
            // if 혹은 when 안에서 블록을 사용할 수 있다. 블록을 사용하는 경우 마지막 문장이 블록 전체의 결과가 된다.
            println(e.value)
            e.value // 블록의 마지막 식이 블록의 결과
        }
        is Sum -> {
            eval(e.right) + eval(e.left)
        }
        else -> {
            throw IllegalArgumentException("Unknown expression")
        }
    }