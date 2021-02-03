package kotlinInAction.chap05


/*
* Kotlin In Action
* Chap 05. 람다 프로그래밍
*
* 5.2.4. flatMap과 flatten: 중첩된 컬렉션 안의 원소 처리
* */

class Book(val title: String, val authors: List<String>)

fun main() {
    val strings = listOf("abc", "def")
    // flatMap: 리스트에 들어있던 모든 원소로 이루어진 단일 리스트를 반환하는 메소드
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
                        Book("Mort", listOf("Terry Pratchett")),
                        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))

    println(books.flatMap { it.authors }.toSet())

}

/*
*   < 실행 결과 >
*   [a, b, c, d, e, f]
    [Jasper Fforde, Terry Pratchett, Neil Gaiman]
* */