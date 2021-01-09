package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-5. 코틀린의 다양한 함수 알아보기
  -> String 클래스에 확장 함수 추가하기
* */

fun main() {
    val source = "Hello World !"
    val target = "Kotlin !"
    println(source.getLongString(target))
}

// 기존에 내장되어 있는 String 클래스를 확장해 getLongString() 함수 추가
fun String.getLongString(target: String):
        String = if(this.length > target.length) this else target
/*
*   < 실행 결과 >
*   Hello World !
* */