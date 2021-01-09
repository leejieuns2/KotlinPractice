package doItKotlin.chap03

import java.math.BigInteger

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-5. 코틀린의 다양한 함수 알아보기
  -> 피보나치 수열을 꼬리 재귀로 만들기
* */

fun main() {
    val n = 1000

    val first = BigInteger("0")
    val second = BigInteger("1")
    println(fibonacci_tailrec(n, first, second))
    println(fibonacci(n, first, second))
}

fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if(n == 0) b else fibonacci(n - 1, a + b, a)
}

tailrec fun fibonacci_tailrec(n: Int, a: BigInteger, b:BigInteger): BigInteger {
    return if(n == 0 ) a else fibonacci(n - 1, b, a + b)
}

/*
*   < 실행 결과 >
*   -2437933049959450366 (Overflow 발생)
    354224848179261915075
* */