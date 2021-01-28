package kotlinInAction.chap02

/*
* Kotlin In Action
* Chap 02. 코틀린 기초
*
* 2.3 선택 표현과 처리 : enum과 when
* */

interface Expr {
    // value라는 프로퍼티만 존재하는 단순한 클래스로 Expr 인터페이스를 구현한다.
    class Num(val value: Int): Expr
    // Expr 타입의 객체라면 어떤 것이나 Sum 연산의 인자가 될 수 있다는 뜻. 따라서 Num이나 다른 Sum이 인자로 오는 것도 가능하다.
    class Sum(val left: Expr, val right: Expr): Expr
}