package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.1.1. 코틀린 인터페이스
  -> 간단한 인터페이스 선언하기
  -> 인터페이스 안에 본문이 있는 메소드 정의하기
* */

interface Clickable {
    fun click()         // 일반 메소드 선언
    fun showOff() = println("I'm clickable !")      // 디폴트 구현이 있는 메소드 선언
}