package doItKotlin.chap05

/*
* Do It ! 코틀린 프로그래밍
* Chap 05. 클래스와 객체
*
* 5-3. 상속과 다형성
  -> 파생 클래스 만들어 보기
* */

// 상속 가능한 클래스를 선언하기 위해 open 사용
open class BirdParent (var name: String, var wing: Int, var beak: String, var color: String) {

    // 클래스 내 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

// 주 생성자를 사용하는 상속
class Lark(name: String, wing: Int, beak: String, color: String) : BirdParent(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!")
}

// 부 생성자를 사용하는 상속
class Parrot : BirdParent {
    val language: String

    constructor(name: String,
                wing: Int,
                beak: String,
                color: String,
                language: String) : super(name, wing, beak, color) {
                    // 새로 추가한 프로퍼티
                    this.language = language
                }

    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("Mybird", 2, "short", "blue")
    val lark = Lark("Mylark", 2, "long", "brown")
    // 프로퍼티를 추가한 자식 클래스 객체 생성
    val parrot = Parrot("MyParrot", 2, "short", "multiple", "korean")

    println("Coco : ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark : ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot : ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")

    // 새로 추가한 메서드 사용 가능
    lark.singHitone()
    parrot.speak()
    lark.fly()


}

/*
*   < 실행 결과 >
*   Coco : Mybird, 2, short, blue
    Lark : Mylark, 2, long, brown
    Parrot : MyParrot, 2, short, multiple, korean
    Happy Song!
    Speak! korean
    Fly wing: 2
* */