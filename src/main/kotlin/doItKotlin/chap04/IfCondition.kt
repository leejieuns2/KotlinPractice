package doItKotlin.chap04

/*
* Do It ! 코틀린 프로그래밍
* Chap 04. 프로그램의 흐름 제어
*
* 4-1. 조건문
  -> 조건문의 표현식 사용해보기
* */

fun main() {
    val a = 12
    val b = 7

    // 블록과 함께 사용
    val max = if (a > b) {
        println("a 선택")
        a       // 마지막 식인 a가 반환되어 max에 할당 (return 생략)
    } else {
        println("b 할당")
        b       // 마지막 식인 b가 반환되어 max에 할당
    }

    println(max)
}

/*
*   < 실행 결과 >
*   a 선택
    12
* */