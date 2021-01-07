package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 값에 의한 호출로 람다식 사용하기
* */

fun main() {
    val result = callByValue(lambda())   // 람다식 함수를 호출
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    // 일반 변수 자료형으로 선언된 매개변수

    println("Call By Value Function")
    return b
}

val lambda: () -> Boolean = {
    // 람다 표현식이 2줄

    println("Lambda Function")
    true // 이럴 땐 마지막 표현식 문장의 결과가 반환됨
}

/*
*   < 실행 결과 >
*   Lambda Function
    Call By Value Function
    true
* */