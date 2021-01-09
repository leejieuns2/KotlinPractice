package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-5. 코틀린의 다양한 함수 알아보기
  -> 인라인 함수 작성해보기
* */

/*
* 코드 역컴파일 방법
* Intelij IDEA의 [Tools > Kotlin > Show Kotlin Bytecode] 에서 [Decompile] 클릭 !!
* */

fun main() {
    // 인라인 함수 shortFunc()의 내용이 복사되어 shortFunc로 들어감
    shortFunc(3) { println("First Call: $it")}
    shortFunc(5) { println("Second Call: $it")}

}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

/*
*   < 실행 결과 >
*   Before calling out()
    First Call: 3
    After calling out()
    Before calling out()
    Second Call: 5
    After calling out()
* */