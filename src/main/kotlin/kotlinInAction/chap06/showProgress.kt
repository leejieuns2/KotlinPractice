package kotlinInAction.chap06

/*
* Kotlin In Action
* Chap 06. 코틀린 타입 시스템
*
* 6.2. 코틀린의 원시 타입
  -> 원시 타입 : Int, Boolean 등
* */

fun showProgress(progress: Int) {
    // 값을 특정 범위로 제한하는 함수 coerceIn()
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done !")
}

fun main() {
    // 범위를 넘어가기 때문에 최고 범위인 100이 출력됨.
    showProgress(145)
    showProgress(97)
}

/*
*   < 실행 결과 >
*   We're 100% done !
*   We're 97% done !
* */