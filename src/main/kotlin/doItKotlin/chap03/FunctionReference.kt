package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 인자와 반환값이 없는 람다식 함수
* */

fun main() {

    val res1 = funcParam(3, 2, ::sum)
    println(res1)

    hello(::text)

    val likeLamda = ::sum
    println(likeLamda(6, 6))
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