package chap03.section1

fun main() {
    val name = "홍길동"    // val은 자바의 final과 비슷. 불변변수
    val email = "hong@example.com"

    add(name)
    add(name, email)
    add("둘리", "dooly@example.com")
    defaultArgs()   // 인자값 전달을 안했으므로 기본값으로 계산됨.
    defaultArgs(200)    // x만 인자값이 전달되었으므로 y는 default value로 설정됨.
}

// 매개변수에 기본값 정하기
fun add (name: String, email: String = "default") {
    val output = "${name}님의 이메일은 ${email}입니다."
    println(output)
}

// 매개변수에 기본값 정하기
fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)
}

/*
*   < 실행 결과 >
*   홍길동님의 이메일은 default입니다.
    홍길동님의 이메일은 hong@example.com입니다.
    둘리님의 이메일은 dooly@example.com입니다.
    300
    400
* */