package doItKotlin.chap04

/*
* Do It ! 코틀린 프로그래밍
* Chap 04. 프로그램의 흐름 제어
*
* 4-1. 조건문
  -> when문을 이용해 점수 등급 구하기
* */

fun main() {
    print("Enter the score: ")

    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }

    println("Score: $score, Grade: $grade")
}

/*
*   < 실행 결과 >
*   Enter the score: 85.7
    Score: 85.7, Grade: B

*   Enter the score: 100
    Score: 100.0, Grade: A
* */