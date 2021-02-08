package kotlinInAction.chap06

/*
* Kotlin In Action
* Chap 06. 코틀린 타입 시스템
*
* 6.3.2. 읽기 전용과 변경가능한 컬렉션
  ->
* */

// source : 읽기 전용 컬렉션
// target : 변경 가능한 컬렉션
fun <T> copyElements(source: Collection<T>, target:MutableCollection<T>) {
    // source 컬렉션의 모든 원소에 대해 루프 돌기
    for(item in source) {
        // 변경 가능한 target 컬렉션에 원소를 추가한다. (복사)
        target.add(item)
    }
}

fun main() {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    // val target: Collection<Int> = arrayListOf(1) 로 하고 실행할 시 컴파일 오류 발생!
    // Collection<Int> 타입은 변경이 불가하기 때문에 add() 함수 실행이 불가능하다.
    val target: MutableCollection<Int> = arrayListOf(1)

    copyElements(source, target)
    println(target)
}

/*
*   < 실행 결과 >
*   [1, 3, 5, 7]
* */