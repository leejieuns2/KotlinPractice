package kotlinInAction.chap06

/*
* Kotlin In Action
* Chap 06. 코틀린 타입 시스템
*
* 6.1.3. 안전한 캐스트: as?
  -> 안전한 연산자를 사용해 equals 구현하기
* */

class People(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        // 타입이 서로 일치하지 않으면 false를 반환한다.
        val otherPerson = other as? People ?: return false

        // 안전한 캐스트를 하고 나면 otherPerson이 Person 타입으로 스마트캐스트 된다.
        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = People("Lee", "Jieun")
    val p2 = People("Lee", "Jieun")

    // == 연산자는 equals 메소드를 호출한다.
    println(p1 == p2)
    println(p1.equals(42))
}

/*
*   < 실행 결과 >
*   true
    false
* */