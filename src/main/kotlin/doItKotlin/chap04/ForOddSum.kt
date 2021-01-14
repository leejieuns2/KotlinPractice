package doItKotlin.chap04

/*
* Do It ! 코틀린 프로그래밍
* Chap 04. 프로그램의 흐름 제어
*
* 4-2. 반복문
  -> 짝수의 합과 홀수의 합 구하기
* */

fun main() {
    var total: Int = 0

    // 홀수
    for (num in 1..100 step 2) total += num
    println("Odd total: $total")

    // 짝수
    for(num in 0..99 step 2) total += num
    println("Even total: $total")
}

/*
*   < 실행 결과 >
*   Odd total: 2500
    Even total: 4950
* */