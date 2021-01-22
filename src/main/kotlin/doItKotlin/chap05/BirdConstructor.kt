package doItKotlin.chap05

/*
* Do It ! 코틀린 프로그래밍
* Chap 05. 클래스와 객체
*
* 5-2. 생성자
  -> 부 생성자를 사용하는 Bird 클래스
* */

class Bird {
    // 클래스의 프로퍼티 선언
    var name: String
    var wing: Int
    var beak: String
    var color: String

    // 부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(name: String, wing: Int, beak: String, color: String) {
        // this.name은 선언된 현재 클래스의 프로퍼티를 나타냄.
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    // _를 매개변수에 사용하고 프로퍼티에 this를 생략할 수 있음.
    constructor(_name: String, _beak: String) {
        name = _name
        beak = _beak
        wing = 2
        color = "grey"
    }

    // 클래스 내 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    // 생성자의 인자로 객체 생성과 동시에 초기화
    val coco = Bird("mybird", 2, "Short", "Blue")

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
