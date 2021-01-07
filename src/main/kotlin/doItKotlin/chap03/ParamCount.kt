package doItKotlin.chap03

/*
* Do It ! 코틀린 프로그래밍
* Chap 03. 함수와 함수형 프로그래밍
*
* 3-3. 고차 함수와 람다식
  -> 람다식의 매개변수 테스트하기
* */

fun main() {
    // 매개변수 없는 람다식

    noParam ({ "Hello World !" })   // 괄호는 생략 가능
    noParam { "Hello World !" }

    // 매개변수가 1개 있는 람다식

    oneParam ({ a -> "Hello World ! $a" })
    oneParam { a -> "Hello World ! $a" }
    // 소괄호 생략 가능
    oneParam { "Hello World ! $it" }
    // 위의 두 문장과 같은 결과. it으로 대체 가능

    // 매개변수가 2개 이상 있는 람다식
    moreParam({a, b -> "Hello World ! $a $b"})
    moreParam {a, b -> "Hello World ! $a $b"}
    moreParam {_, b -> "Hello World ! $b"}
    // 소괄호 생략 가능. 매개변수 이름 생략 불가.
    // 특정 매개변수 출력하고 싶지 않을 땐 언더스코어(_)로 생략 가능함.

    // 1. 인자와 함께 람다식을 사용하는 경우
    withArgs("Arg1", "Arg2", { a, b -> "Hello World ! $a $b"})
    // 2. withArgs() 함수의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능    withArgs("Arg1", "Arg2") { a, b -> "Hello World ! $a $b"}

}

// 매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨.
fun noParam(out: () -> String) = println(out())

// 매개변수가 1개 있는 람다식이 oneParam 함수의 매개변수 out으로 지정됨.
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

// 매개변수가 2개 이상 있는 람다식의 moreParam 함수의 매개변수로 지정됨
fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

// withArg() 함수는 일반 매개변수 2개를 표함, 람다식을 마지막 매개변수로 가정
fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}
/*
*   < 실행 결과 >
*   Hello World !
    Hello World !
    Hello World ! OneParam
    Hello World ! OneParam
    Hello World ! OneParam
    Hello World ! OneParam TwoParam
    Hello World ! OneParam TwoParam
    Hello World ! Arg1 Arg2
    Hello World ! Arg1 Arg2
* */