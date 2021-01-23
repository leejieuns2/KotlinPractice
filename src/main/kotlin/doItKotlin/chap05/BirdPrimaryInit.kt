package doItKotlin.chap05

/*
* Do It ! 코틀린 프로그래밍
* Chap 05. 클래스와 객체
*
* 5-2. 생성자
  -> 초기화 블록을 사용해 코드 넣기
* */

class Bird3(var name: String, var wing: Int, var beak: String, var color: String) {
    // 초기화 블록
    init {
        println("-----초기화 블록 시작-----")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("-----초기화 블록 끝-----")
    }

    // 클래스 내 메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    // 객체 생성과 함께 초기화 블록 수행됨.
    val coco = Bird3("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
}
/*
*   < 실행 결과 >
*
* */