package kotlinInAction.chap02

/*
* Kotlin In Action
* Chap 02. 코틀린 기초
*
* 2.3 선택 표현과 처리 : enum과 when
  -> 프로퍼티와 메소드가 있는 enum 클래스 선언하기 (Color)
  -> when을 사용해 올바른 enum 찾기 (getMnemonic())
* */

// 함수의 반환값으로 when 식을 직접 사용한다.
fun getMnemonic(color: Color) =
    when(color) {
        // 색이 특정 enum 상수와 같을 때 그 상수에 대응하는 문자열을 돌려준다.
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main() {
    println(Color.BLUE.rgb())
    println(getMnemonic(Color.BLUE))
}

/*
*   < 실행 결과 >
*   255
    Battle
* */