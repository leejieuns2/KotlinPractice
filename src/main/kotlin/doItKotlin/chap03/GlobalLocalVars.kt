package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-6. 함수와 변수의 범위
* */

// 패키지의 모든 범위에 적용되는 전역 변수
var global = 10

fun main() {
    // main() 함수 블록 안에서만 유지되는 지역 변수
    val local1 = 20
    val local2 = 21

    fun nestedFunc() {
        global += 1
        // func() 함수 블록 안에서만 유지 (기존 local1이 가려짐)
        val local1 = 30

        println("nestedFunc local1: $local1")
        println("nestedFunc local2: $local2")   // main 함수 블록 안에서 선언된 local2의 값을 가져옴.
        println("nestedFunc global: $global")
    }

    nestedFunc()
    outsideFunc()

    println("nestedFunc global: $global")
    println("nestedFunc local1: $local1")
    println("nestedFunc local2: $local2")
}

fun outsideFunc() {
    global += 1
    val outVal = "outside"
    println("outsideFunc global: $global")
    println("outsideFunc outVal: $outVal")
}

/*
*   < 실행 결과 >
*   nestedFunc local1: 30
    nestedFunc local2: 21
    nestedFunc global: 11
    outsideFunc global: 12
    outsideFunc outVal: outside
    nestedFunc global: 12
    nestedFunc local1: 20
    nestedFunc local2: 21
* */