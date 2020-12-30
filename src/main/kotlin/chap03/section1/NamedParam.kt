package chap03.section1

fun main() {
    // 너무 많은 함수를 호출하다 보면 가끔 어떤 인자를 어떤 매개변수에 전달했는지 햇갈리는 경우가 있기 때문에
    // 코틀린은 매개변수의 이름과 함께 인자를 전달하는 방법을 제공한다.

    // x, z의 이름과 함께 함수 호출 (y는 기본값 사용)
    namedParam(x = 200, z = 100)
    // z의 이름과 함께 함수 호출 (x와 y는 기본 값 -100- 으로 지정됨.
    namedParam(z = 150)

    // namedParam() 에러 발생!!
    // 에러 내용 : No value passed for parameter 'z'
    // 여기서 z는 기본값을 지정하지 않았으므로 반드시 인자를 전달해야 함.
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}

/*
*   < 실행 결과 >
*   500
    450
* */