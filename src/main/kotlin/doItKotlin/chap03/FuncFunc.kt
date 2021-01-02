package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
* */

fun funcFunc(): Int {
    // 같은 패키지 내 동일 이름 함수 사용 불가.
    // sum 함수는 FuncArgument.kt 에 정의되어 있음.
    // 함수의 반환값으로 또 다른 함수를 정의함.
    return sum(2, 2)
}

fun main() {
    println("funcFunc: ${funcFunc()}")
}

/*
*   <실행 결과>
*   funcFunc: 4
* */