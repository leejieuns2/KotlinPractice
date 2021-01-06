package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 매개변수에 람다식 함수를 이용한 고차 함수
* */


// 함수의 매개변수에서 람다식 자료형 선언
fun highOrder(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a,b)
    // 덧셈 연산은 여기서
}

fun main() {
    var result: Int
    result = highOrder({x, y -> x + y}, 10, 20)
    // 람다식을 매개변수와 인자로 사용한 함수
    // 함수의 인자로 람다식 사용

    println(result)
}

/*
*   <실행 결과>
*   30
* */