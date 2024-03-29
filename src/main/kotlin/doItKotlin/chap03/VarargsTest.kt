package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-1. 함수 선언하고 호출하기
* */


/*
* 가변 인자 (Variable Argument) Vararg
* 똑같은 타입의 인자를 여러개 받아야 하지만 개수가 정해져 있지 않을 때 유용하게 사용할 수 있는 문
* */

fun main() {
    // 4개의 인자 구성
    normalVarargs(1, 2, 3, 4)
    // 3개의 인자 구성
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        print("$num ")
    }
    println()
}