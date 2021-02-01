package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.1.1. 코틀린 인터페이스
  -> 동일한 메소드를 구현하는 다른 인터페이스 정의
* */

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm Focusable !")
}