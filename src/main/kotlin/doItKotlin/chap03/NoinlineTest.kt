package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-5. 코틀린의 다양한 함수 알아보기
  -> noinline으로 람다식의 인라인 막기
* */

fun main() {
    shortFunc_noinline(3) { println("First Call: $it")}
}

inline fun shortFunc_noinline(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

/*
*   < 실행 결과 >
*   Before calling out()
    First Call: 3
    After calling out()
* */