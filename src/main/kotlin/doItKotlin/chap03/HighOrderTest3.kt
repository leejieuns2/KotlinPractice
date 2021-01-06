package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 인자와 반환값이 없는 람다식 함수
* */

fun main() {
    val out: () -> Unit = {println("Hello World!")}
    // 인자와 반환값이 없는 람다식의 선언
    // Unit 자료형을 가진 람다식은 주론이 가능하므로 val out = {println("Hello World!")} 와 같이 생략 가능함.

    out()
    // Unit 자료형 람다식은 함수처럼 사용도 가능함.

    val new = out
    // 람다식이 들어 있는 변수를 다른 변수에 할당하는 것도 가능함.

    new()
    // 역시 람다식이 할당된 변수도 함수처럼 사용 가능함.
}

/*
*   <실행 결과>
*   Hello World!
*   Hello World!
* */