package kotlinInAction.chap06

/*
* Kotlin In Action
* Chap 06. 코틀린 타입 시스템
*
* 6.1.9 널이 될 수 있는 타입 확장
  -> null이 될수 있는 수신 객체에 대해 확장 함수 호출하기
* */

fun verifyUserInput(input: String?) {
    // 안전한 호출을 하지 않아도 된다.
    // 널이거나 빈칸일 경우 if문 안에 있는 문장 실행됨.
    if(input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)
}

/*
*   < 실행 결과 >
*   Please fill in the required fields
    Please fill in the required fields
* */