package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 2개의 람다식을 매개변수로 가진 함수의 사용
* */

fun main() {
    twoLambda({a, b -> "First $a $b"}) { "Second $it" }
    twoLambda({a, b -> "First $a $b"}, { "second $it" })
    //  위와 동일. 마지막 람다식은 소괄호 밖으로 선언해도 됨.
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}

/*
*   < 실행 결과 >
*   First OneParam TwoParam
    Second OneParam
    First OneParam TwoParam
    second OneParam
* */