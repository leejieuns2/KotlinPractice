package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.2.4. 게터와 세터에서 뒷받침하는 필드에 접근
  -> 세터에서 뒷받침하는 필드 접근하기
* */

class UserTest(val name: String) {
    var address: String = "unspecified"
        // 커스텀 세터 선언하기
        set(value: String) {
            // 뒷받침하는 필드 값 읽기
            println("""Address was changed for $name:
            "$field" -> "$value".""".trimIndent())
            // 뒷받침하는 필드 값 변경하기
            field = value
        }
}
fun main() {
    val user = UserTest("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}

/*
*   < 실행 결과 >
*   Address was changed for Alice:
            "unspecified" -> "Elsenheimerstrasse 47, 80687 Muenchen".
* */