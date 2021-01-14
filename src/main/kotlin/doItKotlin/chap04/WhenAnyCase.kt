package doItKotlin.chap04

import java.util.*

/*
* Do It ! 코틀린 프로그래밍
* Chap 04. 프로그램의 흐름 제어
*
* 4-1. 조건문
  -> 다양한 자료형의 인자 받기
* */

fun main() {
    cases("Hello")                  // String
    cases(1)                        // Int
    cases(System.currentTimeMillis())   // 현재 시간
    cases(Object())                     // 객체

}

fun cases(obj: Any) {
    when(obj) {
        is Int -> println("Int: $obj")
        is String -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

/*
*   < 실행 결과 >
*   String: Hello
    Int: 1
    Long: 1610635337912
    Not a String
* */