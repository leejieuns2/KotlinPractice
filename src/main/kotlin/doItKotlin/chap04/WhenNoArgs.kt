package doItKotlin.chap04

/*
* Do It ! 코틀린 프로그래밍
* Chap 04. 프로그램의 흐름 제어
*
* 4-1. 조건문
  -> 인자가 없는 when문 사용하기
* */

fun main() {

    print("Enter the score: ")
    var score = readLine()!!.toDouble()
    var grade: Char = 'F'

    // 인자 있는 when문과 다르게 조건식을 구성할 수 있음.
    when {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }

    println("Score: $score, Grade: $grade")
}

/*
*   < 실행 결과 >
*   Enter the score: 90
    Score: 90.0, Grade: A

*   Enter the score: 76
    Score: 76.0, Grade: C
* */