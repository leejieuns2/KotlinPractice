package kotlinInAction.chap02

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

/*
* Kotlin In Action
* Chap 02. 코틀린 기초
*
* 2.5. 코틀린의 예외 처리
  -> try를 식으로 사용하기
* */

fun readNumber(reader: BufferedReader) {
    // 이 식의 값이 "try" 식의 값이 된다.
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        // 에러 메세지 출력
        e.message
    }

    println(number)
}

fun main() {
    // 에러 메세지 출력
    var reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)

    // 정상 실행
    reader = BufferedReader(StringReader("10"))
    readNumber(reader)
}

/*
*   < 실행 결과 >
*   For input string: "not a number" <- 에러 메세지 출력
    10
* */