package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 람다식 이름을 사용해 호출하기
* */

fun main() {
    val result = callByName(otherLamda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("Call By Name Function")
    return b()
}

val otherLamda: () -> Boolean = {
    println("Other Lamda Function")
    true // 반환
}

/*
*   < 실행 결과 >
*   Call By Name Function
    Other Lamda Function
    true
* */