package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 람다식 이름을 사용해 호출하기
* */

fun main() {
    val result = callByName(otherLambda)
    // 람다식 이름으로 호출. 함수가 아니므로 바로 callByName 함수 실행
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    // 람다식 자료형으로 선언된 매개변수. 매개변수가 함수로 되어 있으므로 밑의 return까지 먼저 실행됨.

    println("Call By Name Function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("Other Lambda Function")
    true // 반환
}

/*
*   < 실행 결과 >
*   Call By Name Function
    Other Lamda Function
    true
* */