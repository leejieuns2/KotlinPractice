package kotlinInAction.chap06

/*
* Kotlin In Action
* Chap 06. 코틀린 타입 시스템
*
* 6.1.7. let 함수
  -> let을 사용해 null이 아닌 인자로 함수 호출하기
* */

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main() {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }

    email = null
    // 널이므로 let 함수가 실행되지 않음.
    email?.let { sendEmailTo(it) }
}

/*
*   < 실행 결과 >
*   Sending email to yole@example.com
* */