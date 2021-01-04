package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
* */

fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x * y}
    // 일반 변수에 람다식 할당. 자료형이 생략되어 있으나 람다식에 의해 Int형으로 추론 가능.
    // 기존 람다식의 선언에서 람다식의 매개변수에 자료형이 명시되어 있기 때문에 선언 자료형은 생략한 것.
    // val multi: (Int, Int) -> Int = {x, y -> x * y} 로도 표현 가능.
    // val multi = {x, y -> x * y} 는 자료형 추론이 불가능하므로 오류 발생.

    result = multi(10, 20)
    // 람다식이 할당된 변수는 함수처럼 사용 가능

    println(result)
}

/*
*   <실행 결과>
*   200
* */