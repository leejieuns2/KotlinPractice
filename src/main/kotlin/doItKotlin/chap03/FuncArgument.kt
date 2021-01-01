package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
* */

fun sum(a: Int, b: Int) = a + b
fun mul(a: Int, b: Int) = a * b

fun main() {
    val res1 = sum(3, 2)                // 일반 인자
    val res2 = mul(sum(3, 3), 3)    // 인자에 함수를 사용
    // sum(3, 3) 의 결괏값 6이 mul(a, b)의 첫번째 매개변수 a에 전달 됨. (인자를 일반 함수로 사용)

    println("res1 : $res1, res2: $res2")
}

/*
*   <실행 결과>
*   res1 : 5, res2: 18
* */