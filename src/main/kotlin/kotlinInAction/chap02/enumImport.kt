package kotlinInAction.chap02

// 짧은 이름으로 사용하기 위해 enum 상수를 전부 import한다.
import kotlinInAction.chap02.Color.*

/*
* Kotlin In Action
* Chap 02. 코틀린 기초
*
* 2.3 선택 표현과 처리 : enum과 when
  -> 한 when 분기 안에 여러 값 사용하기 (getWarmth())
  -> enum 상수 값을 임포트해서 enum 클래스 수식자 없이 enum 사용하기 (getWarmth())
  -> when의 분기 조건에 여러 다른 객체 사용하기 (getWarmth())
* */

fun getWarmth(color: Color) =
    when(color) {
        // import한 상수를 이름으로만 사용한다.
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }

fun mix(c1:Color, c2:Color) =
    when(setOf(c1, c2)) {
        /* when 식의 인자로 아무 객체나 사용할 수 있다.
           when은 이렇게 인자로 받은 객체가 각 분기 조건에 있는 객체와 같은지 테스트한다.
           밑의 문장들은 두 색을 혼합해서 다른 색을 만들 수 있는 경우를 열거하고 있다. */
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        // 매치되는 분기 조건이 없을 시 이 문장을 실행한다.
        else -> throw Exception("Dirty color !")
    }

fun main() {
    println(getWarmth(ORANGE))
    println(mix(BLUE, YELLOW))
}

/*
*   < 실행 결과 >
*   warm
    GREEN
* */