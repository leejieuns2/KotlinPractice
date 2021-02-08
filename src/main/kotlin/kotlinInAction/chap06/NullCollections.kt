package kotlinInAction.chap06

import doItKotlin.chap03.sum
import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

/*
* Kotlin In Action
* Chap 06. 코틀린 타입 시스템
*
* 6.3.1. 널 가능성과 컬렉션
  -> 널이 될 수 있는 값으로 이뤄진 컬렉션 만들기
  -> 널이 될 수 있는 값으로 이뤄진 컬렉션 다루기
* */

fun readNumbers(reader: BufferedReader): List<Int?> {
    // 널이 될 수 있는 int값으로 이뤄진 리스트를 만든다.
    val result = ArrayList<Int?>()

    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            // 정수(널이 아닌 값)를 리스트에 추가한다.
            result.add(number)
        } catch (e: NumberFormatException) {
            // 현재 줄을 파싱할 수 없으므로 리스트에 널을 추가한다.
            result.add(null)
        }
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invaildNumbers = 0
    // 리스트에서 널이 될 수 있는 값을 읽는다.
    for (number in numbers) {
        // 널에 대한 값을 확인한다.
        if(number != null) {
            sumOfValidNumbers += number
        } else {
            invaildNumbers++
        }
    }

    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invaildNumbers")
}

fun main() {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)

    addValidNumbers(numbers)
}

/*
*   < 실행 결과 >
*   Sum of valid numbers: 43
    Invalid numbers: 1
* */