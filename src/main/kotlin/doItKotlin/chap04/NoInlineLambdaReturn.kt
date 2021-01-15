package doItKotlin.chap04

/*
* Do It ! 코틀린 프로그래밍
* Chap 04. 프로그램의 흐름 제어
*
* 4-3. 흐름의 중단과 반환
  -> 라벨을 사용한 람다식의 반환
* */

fun main() {
    retFunc2()
}

// inlineLambda 함수는 inlineLambdaReturn 파일에 있는 함수 사용.
fun retFunc2() {
    println("start of retFunc")
    // 람다식 블록의 시작 부분에 라벨을 지정
    inlineLambda(13, 3) lit@{ a, b ->
        val result = a + b
        // 비지역 반환(Non-Local)울 수행하는 것이 아닌 라벨을 사용한 블록의 끝부분으로 반환됨.
        if(result > 10) return@lit
        // 10보다 크면 이 문장에 도달하지 못함.
        println("result : $result")
    }
    // 이 부분으로 빠져나가기 때문에 밑의 출력문은 실행됨.
    println("end of retFunc")
}

/*
*   < 실행 결과 >
*   start of retFunc
    end of retFunc
* */