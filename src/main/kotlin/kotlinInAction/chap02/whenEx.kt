package kotlinInAction.chap02

import kotlinInAction.chap02.Expr.*
import java.lang.IllegalArgumentException

/*
* Kotlin In Action
* Chap 02. 코틀린 기초
*
* 2.3 선택 표현과 처리 : enum과 when
  -> 분기에 복잡한 동작이 들어가 있는 when 사용하기
* */

fun evalWithLogging(e: Expr): Int =
    when(e) {
        is Num -> {
            println("num : ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: ${left} + ${right}")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}

/*
*   < 실행 결과 >
*   num : 1
    num : 2
    sum: 1 + 2
    num : 4
    sum: 3 + 4
    7
* */