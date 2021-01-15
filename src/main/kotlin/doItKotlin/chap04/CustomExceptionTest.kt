package doItKotlin.chap04

import java.lang.Exception

/*
* Do It ! 코틀린 프로그래밍
* Chap 04. 프로그램의 흐름 제어
*
* 4-3. 흐름의 중단과 반환
  -> 사용자 예외 클래스 만들어보기
* */

class InvalidNameException(message: String) : Exception(message)

fun main() {

    // 숫자가 포함된 이름 변수 선언
    var name = "leejieun123"

    try {
        validateName(name)
    } catch (e: InvalidNameException) {
        // 숫자가 포함된 사용자 예외 처리
        println(e.message)
    } catch (e: Exception) {
        // 기타 예외 처리
        println(e.message)
    }
}

fun validateName(name: String) {
    // 이름에 숫자가 포함되어 있으면 사용자 정의 예외를 발생시킴.
    if(name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameException("Your name : $name : contains numerals.")
    }
}

/*
*   < 실행 결과 >
*   Your name : leejieun123 : contains numerals.
* */