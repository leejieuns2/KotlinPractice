package kotlinInAction.chap04

/*
* Kotlin In Action
* Chap 04. 클래스, 객체, 인터페이스
*
* 4.3.3. 클래스 위임 : by 키워드 사용
  -> 클래스 위임 사용하기
* */

class CountingSet<T> (
    val innerSet: MutableCollection<T> = HashSet<T>()
    // mutableCollection의 구현을 innerSet에게 위임한다.
) : MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")

}

/*
*   < 실행 결과 >
*   3 objects were added, 2 remain
* */

