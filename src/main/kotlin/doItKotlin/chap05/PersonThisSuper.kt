package doItKotlin.chap05

/*
* Do It ! 코틀린 프로그래밍
* Chap 05. 클래스와 객체
*
* 5-4. super와 this의 참
  -> this와 super를 사용하는 부 생성자
* */

open class Person {
    // 부 생성자
    constructor(firstName: String) {
        println("[Person] firstname : $firstName")
    }

    // 부 생성자
    constructor(firstName: String, age: Int) {
        println("[Person] firstname : $firstName, $age")
    }
}

class Developer : Person {
    // Developer의 1번 생성자
    constructor(firstName: String) : this(firstName, 10) {
        println("[developer] $firstName")
    }

    // Developer의 2번 생성자
    constructor(firstName: String, age: Int) : super(firstName, age) {
        println("[developer] $firstName, $age")
    }
}

fun main() {
    // 인자가 1개이므로 Developer의 1번 생성자로 먼저 진입함. 하지만 1번 생성자가 this()에 의해 2번 생성자를 가리키므로
    // 2번 생성자로 진입하고, 또 2번 생성자는 super()로 Person 클래스의 두개의 인자를 가지고 있는 부 생성자를 호출함.
    val sean = Developer("Sean")
}

/*
*   < 실행 결과 >
*   [Person] firstname : Sean, 10   // Person 클래스의 부 생성자 먼저 실행
    [developer] Sean, 10            // this로 호출된 Developer의 부 생성자 실행
    [developer] Sean                // Main에서 선언된 한개의 인자를 가진 Developer의 1번 생성자 실행.
* */