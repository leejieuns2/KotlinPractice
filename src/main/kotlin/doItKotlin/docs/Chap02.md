
## Chapter 02. 변수와 자료형, 연산자

1. 코틀린 프로젝트 구성
    * 모듈 (Module)　　　　　　　　상위
    * 패키지 (Package)　　　　　　　&#160;|
    * 파일 (File)　　　　　　　　　&#160; 하위
   

2. 코틀린에서의 변수 선언
    - `val(value)` : 최초로 지정한 변수의 값으로 초기화하고 더이상 바꿀 수 없는 읽기 전용 변수가 됨.
        - 자바의 final 변수와 비슷, `불변 변수(immutable)`라고도 함.
    - `var(variable)` : 최초로 지정한 변수의 초깃값이 있더라도 값을 언제나 변경 가능한 변수.
        - `가변 변수(mutable)` 라고도 함.   
    ex)
          ```kotlin
            val name : String = "leejieuns2" (불변변수)  
            var name : String = "leejieun" (가변변수)
            // 자료형 생략 가능. 컴파일러가 추론해 자료형 판단
          ```
             
    - 자바와의 차이점
        - 코틀린은 기본 자료형을 사용하지 않고 참조 자료형만을 사용한다.
            > `기본 자료형` : int, float, double ...   
              `참조 자료형` : Double, Date, String, Int ...
            
        - 참조형으로 선언한 변수는 성능 최적화를 위해 코틀린 컴파일러에서 기본형으로 대체되기 때문에 성능 문제 X. (최적화 필요 없음)
        - 코틀린에서는 기본적으로 변수가 Not Null이고, Nullable한 표현을 사용하고 싶을 땐 자료형 뒤에 ? 를 붙여준다.
            

3. 표현식과 $ 기호 사용하여 문자열 출력하기

    ```kotlin
   var a = 1
   var s1 = "a is ${a}"
   println(s1)
   
   // 실행결과 : a is 1
    ```
    - 표현식과 $ 기호를 사용하면 변수를 쉽게 문자열로 출력할 수 있다.      
       

4. 자료형에 별명 붙이기 (alias)
   ```kotlin
   typealias Username = String      // String을 username이라는 별명으로 대치
   val user : Username = "Jieun"    // 이제부터 username을 String과 같은 표현이라고 인식함.
   ```   
   - 고차 함수, 람다식, 긴 선언 클래스 등에 사용됨.
   - 별명을 붙인다는 점에서 sql alias와 비슷.   
       

5. 코틀린에 있는 특별한 문법
    1. 세이프 콜 (Safe-call)
        - null이 할당되어 있을 가능성이 있는 변수를 검사하여 안전하게 호출하도록 도와주는 기법
          -> NPE(Null Pointer Exception 방지)
        - 호출할 변수 이름 뒤에 ?. 를 작성한다는 특징이 있다.   
        ex)   
          
           ```kotlin
           var str1 : String? = "Hello Kotlin"
           println("str1 : $str1 length : ${str1?.length}")
           // 세이프콜로 안전하게 호출  
           ```
        > **세이프 콜 더 안전하게 사용하기 : 엘비스 연산자 (?:) 사용하기**   
            - 변수가 null인지 검사하여 null이 아니라면 왼쪽 식 실행, null이라면 오른쪽 식을 실행함.
          ![](../image/chap02.png)
        
    2. not-null 단정 기호
        - not-null 단정 기호는 변수에 할당된 값이 Null이 아님을 단정하므로 컴파일러가 null 검사를 수행하지 않는다. null일 경우 컴파일 에러가 아닌 실행 중 에러(NPE)가 발생한다.
          -> 정말 확실하지 않은 경우를 제외하고 사용을 지양하는게 좋음.
          ```kotlin
           println("str1 : $str1 length : ${str1!!.length}")
           ```
    
6. 기본형과 참조형 자료형의 비교 원리
    1. 이중 등호(==)와 삼중 등호(===)의 사용   
        `==` : 값만 비교하는 경우   
        `===` : 값과 참조 주소를 비교할 때    
       ex)
       ```kotlin
        val a: Int = 128        // 기본 자료형 변수 (스택에 저장)
        val b: Int? = 128       // 객체 (힙에 저장)
        println(a == b)         // true
        println(a === b)        // false
       ```
    * 특징 *
    - 코틀린에서는 참조형으로 선언한 변수의 값이 -128~127 범위에 있으면 캐시에 그 값을 저장함.
      (원래는 참조형 변수는 힙에 저장해야 하지만, 캐시에 저장)