package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 값에 의한 호출로 람다식 사용하기
* */

fun main() {
    val result = callByValue(lamda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("Call By Value Function")
    return b
}

val lamda: () -> Boolean = {
    println("Lamda Function")
    true // 반환
}

/*
*   < 실행 결과 >
*   Lamda Function
    Call By Value Function
    true
* */