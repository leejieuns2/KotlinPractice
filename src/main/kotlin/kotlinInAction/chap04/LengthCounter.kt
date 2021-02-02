package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.2.5. 접근자의 가시성 변경
  -> 비공개 세터가 있는 프로퍼티 선언하기
* */

class LengthCounter {
    var counter: Int = 0
        private set     // 이 클래스 밖에서 이 프로퍼티의 값을 바꿀 수 없다는 의미.
    fun addWord(word: String) {
        counter += word.length
    }
}
fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi !")
    println(lengthCounter.counter)
}

/*
*   < 실행 결과 >
*   4
* */