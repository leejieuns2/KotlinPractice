package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.1.2. open, final, abstract 변경자: 기본적으로 final
  -> 열린 메소드를 포함하는 열린 클래스 정의하기
* */

// 코틀린은 기본적으로 final 이기 때문에,
// 다른 클래스가 이 클래스를 상속 가능하게 하려면 open 변경자를 꼭 붙여야 한다.
open class RichButton : Clickable {
    fun disable() {}            // 이 함수는 final이기 때문에 오버라이딩이 불가능하다.
    open fun animate() {}       // 이 함수는 open function이기 때문에 오버라이딩이 가능하다.
    override fun click() {}     // 이 함수는 상위 인터페이스에서 상속받은 메소드이다. 기본적으로 열려있다.(open)
    // final override fun click()
    // -> 이런식으로 override 앞에 final 을 선언하면 추후 이 클래스를 상속하는 하위클래스에서 오버라이딩이 금지된다.
}