package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-5. 코틀린의 다양한 함수 알아보기
  -> 꼬리 재귀를 사용해 팩토리얼 만들어보기
* */

fun main() {
    var number = 4
    val result = factorial(number)
    // 일반적인 재귀 함수
    // 4번의 factorial() 함수 호출 -> factorial() 함수의 스택 메모리의 4배만큼 메모리를 사용하게 됨.
    // 만약 number가 4가 아니라 엄청 큰 수를 설정하게 된다면 스택 메모리가 부족해 오버플로우 발생할 가능성 높음.
    println("Factorial: $number -> $result")

    // 꼬리 재귀 함수
    // 팩토리얼을 매번 함수를 호출하면서 계산하는게 아니라 인자 안에서 팩토리얼의 도중 값을 계산하고 호출함.
    // 그때 그때 계산하므로 스택 메모리를 낭비하지 않을 수 있어 오버플로우 걱정 없음.
    number = 5
    println("Factorial: $number -> ${factorial(number)}")
}

// 일반적인 팩토리얼의 재귀 함수 만들기
fun factorial(n: Int): Long {
    return if(n == 1) n.toLong() else n * factorial(n - 1)
}

tailrec fun factorial(n: Int, run: Int = 1) : Long {
    return if (n == 1) run.toLong() else factorial(n-1, run * n)
}

/*
*   < 실행 결과 >
*
* */