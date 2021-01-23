package doItKotlin.chap05

/*
* Do It ! 코틀린 프로그래밍
* Chap 05. 클래스와 객체
*
* 5-3. 상속과 다형성
  -> 메서드 오버라이딩 하기
* */

open class BirdOverride (var name: String, var wing: Int, var beak: String, var color: String) {

    // 클래스 내 메서드
    fun fly() = println("Fly wing: $wing")
    // 오버라이딩 가능한 메서드
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

// 자식 클래스 선언. 마지막 인자만 var로 선언되어 새롭게 프로퍼티가 추가되었음을 알 수 있음.
class ParrotOverride (name: String,
                      wing: Int = 2,
                      beak: String,
                      color: String,
                      var language: String = "natural") : BirdOverride(name, wing, beak, color) {

    // Parrot에 추가된 메서드
    fun speak() = println("Speak! $language")

    // 오버라이딩 된 메서드
    override fun sing(vol: Int) {
        println("I'm a Parrot! The volume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = ParrotOverride("MyParrot", 2, "short", "multiple")
    parrot.language = "English"

    println("Parrot : ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    // 달라진 메서드 실행 가능
    parrot.sing(5)
}
/*
*   < 실행 결과 >
*   Parrot : MyParrot, 2, short, multiple, English
    I'm a Parrot! The volume level is 5
    Speak! English
* */