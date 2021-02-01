package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.1.1. 코틀린 인터페이스
  -> 단순한 인터페이스 구현하기
  -> 상속한 인터페이스의 메소드 구현 호출하기
* */

class Button : Clickable, Focusable {
    // 코틀린에서는 interface 나 class 를 상속받아 그 내부에 있는 메소드를 오버라이드 할 때
    // 함수 앞에 override 변경자를 꼭 사용해주어야 한다.
    override fun click() = println("I was clicked !")

    // 이름과 시그니처가 같은 멤버 메소드에 대하 둘 이상의 디폴트 구현이 있는 경우 인터페이스를 구현하는
    // 하위 클래스에서 명시적으로 새로운 구현을 제공해야 한다.
    override fun showOff() {
        // 상위 타입의 이름을 꺾쇠 괄호(<>) 사이에 넣어서 "super"를 지정하면
        // 어떤 상위 타입의 멤버 메소드를 호출할지 지정할 수 있다.
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main() {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}

/*
*   < 실행 결과 >
*   I'm clickable !
    I'm Focusable !
    I got focus.
    I was clicked !
* */