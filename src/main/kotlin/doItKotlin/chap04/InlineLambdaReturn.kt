package doItKotlin.chap04

/*
* Do It ! 코틀린 프로그래밍
* Chap 04. 프로그램의 흐름 제어
*
* 4-3. 흐름의 중단과 반환
  -> Inline을 사용한 람다식의 반환
* */

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        // 10보다 크면 이 함수를 빠져 나감. 이 때 빠져나가는 함수는 retFunc() -> 비지역 반환(Non-Local)
        if(result > 10) return
        // 10보다 크면 이 문장에 도달하지 못함.
        println("result : $result")
    }
    // 10보다 크면 이 문장에 도달하지 못함.
    println("end of retFunc")
}

/*
*   < 실행 결과 >
*   start of retFunc
* */