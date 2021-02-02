package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.1.5. 봉인된 클래스 : 클래스 계층 정의 시 계층 확장 제한
  -> sealed 클래스로 식 표현하기
* */

// 기반 클래스를 sealed로 봉인한다.
sealed class Expr {
    // 기반 클래스의 모든 하위 클래스를 중첩 클래스로 나열한다.
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    // when 식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 없어도 된다.
    // 기존에 하위 클래스를 추가하더라도 컴파일러가 모든 경우를 처리하는지 검사할 수 없는 단점을 해결할 수 있다.
    // 나중에 sealed 클래스의 상속 계층에 새로운 하위 클래스를 추가해도 when식이 컴파일 되지 않아 쉽게 버그를 해결할 수 있다.
    when(e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }
