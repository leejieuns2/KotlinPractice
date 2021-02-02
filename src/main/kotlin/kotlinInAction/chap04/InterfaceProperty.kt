package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.2.3. 인터페이스에 선언된 프로퍼티 구현
  -> 인터페이스의 프로퍼티 구현하기
* */

interface User {
    val nickname: String
}

// 주 생성자에 있는 프로퍼티
class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname : String
        // 커스텀 Getter 선언
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    // 프로퍼티 초기화 식
    override val nickname = getFacebookName(accountId)
}

// 임의로 accountId를 넣으면 "nickname"이라는 name을 반환하는 함수를 생성했다.
fun getFacebookName(accountId: Int) = "nickname"

fun main() {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}

/*
*   < 실행 결과 >
*   test@kotlinlang.org
    test
* */