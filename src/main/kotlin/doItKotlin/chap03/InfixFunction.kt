package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-5. 코틀린의 다양한 함수 알아보기
  -> 중위 함수를 이용해 연산자처럼 사용하기
* */

fun main() {
    // 일반 표현법
    // val multi = 3.multiply(10)

    // 중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")
}

// Int를 확장하여 multiply() 함수를 하나 더 추가함.
infix fun Int.multiply(x: Int): Int {
    return this * x
}

/*
*   < 실행 결과 >
*   multi: 30
* */