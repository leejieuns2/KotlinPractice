package doItKotlin.chap05

/*
* Do It ! 코틀린 프로그래밍
* Chap 05. 클래스와 객체
*
* 5-2. 생성자
  -> 주 생성자를 사용하는 Bird 클래스
* */

// 내부의 프로퍼티를 생략하고 생성자의 매개변수에 프로퍼티 표현을 함께 넣는것도 가능함.
// val, var를 사용하여 매개변수를 선언하면 생성자에서 this 키워드를 사용하거나 매개변수 이름에 언더스코어를 붙인 다음 생성자에서 인자를 할당할 필요가 없음.
// class Bird2 constructor(val _name: String, val _wing: Int, val _beak: String, val _color: String)
class Bird2 constructor(_name: String, _wing: Int, _beak: String, _color: String) {

    // 클래스의 프로퍼티 선언
    // 생성자의 매개변수에 프로퍼티를 선언하면 밑의 코드는 생략가능함.
    var name: String = _name
    var wing: Int = _wing
    var beak: String = _beak
    var color: String = _color

    // 클래스 내 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    // 생성자의 인자로 객체 생성과 동시에 초기화
    val coco = Bird2("mybird", 2, "Short", "Blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}

/*
*   < 실행 결과 >
*   coco.color: yellow
    Fly wing: 2
    Sing vol: 3
* */
