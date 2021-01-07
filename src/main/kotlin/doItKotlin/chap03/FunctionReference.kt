package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 참조에 의한 호출 방식으로 일반 함수 호출하기
* */

fun main() {
    // 1. 인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum)
    println(res1)

    // 2. 인자가 없는 함수
    hello(::text) // 반환값이 없음.

    // 3. 일반 변수에 값처럼 할당
    val likeLambda = ::sum
    println(likeLambda(6, 6))
}

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c:(Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}

/*
*   < 실행 결과 >
*   5
    Hi! Hello World
    12
* */