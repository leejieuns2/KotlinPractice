package kotlinInAction.chap05


/*
* Kotlin In Action
* Chap 05. 람다 프로그래밍
*
* 5.1.4. 현재 영역에 있는 변수에 접근
  -> 람다 안에서 바깥 함수의 로컬 변수 변경하기
* */

fun printProblemCounts(responses: Collection<String>) {
    // 람다에서 사용할 변수를 정의한다.
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        // 람다 안에서 람다밖의 변수의 값을 변경한다.
        // => 람다 안에서 사용하는 외부 변수를 "람다가 포획한 변수" 라고 한다.
        if(it.startsWith("4")) {
            clientErrors++
        } else if(it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val responses = listOf("200 Ok", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}


/*
*   < 실행 결과 >
*   1 client errors, 1 server errors
* */