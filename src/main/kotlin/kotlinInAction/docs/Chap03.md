# Chapter 03. 함수 정의와 호출


<br>


## @JvmOverloads Annotation
  * 자바에는 Default Parameter value라는 개념이 없어서 코틀린 함수를 자바에서 호출하는 경우에는
  그 코틀린 함수가 디폴트 파라미터 값을 제공하더라도 모든 인자를 명시해야 한다. 자바에서 코틀린 함수를
  자주 호출해야 한다면 자바 쪽에서 좀 더 편하게 코틀린 함수를 호출하고 싶을 것이다. 그럴 때 @JvmOverloads
  어노테이션을 함수에 추가할 수 있다. @JvmOverloads를 함수에 추가하면 코틀린 컴파일러가 자동으로 맨 마지막
  파라미터로부터 파라미터를 하나씩 생략한 자바 메소드(오버로딩한 메소드)를 추가해준다.    
    
    ex)
    ```java
    public interface example {
        // @JvmOverloads 어노테이션을 사용하면 다음과 같이 오버로딩한 함수가 자동적으로 생성된다.
        // 각각의 오버로딩한 함수들은 생략된 파라미터에 대해 코틀린 함수의 디폴트 파라미터 값을 사용하게 된다.
        String joinToString(Collection<T> collection, String separator, String prefix, String postfix);
        String joinToString(Collection<T> collection, String separator, String prefix);
        String joinToString(Collection<T> collection, String separator);
        String joinToString(Collection<T> collection);
    }
     ```


<br>


## 정적인 유틸리티 클래스 없애기: 최상위 함수와 프로퍼티   

### 1. 확장 함수(Extension Function)
* 자바 API를 재작성하지 않아도 코틀린이 제공하는 여러 편리한 기능을 사용할 수 있도록 해주는 함수
* 어떤 클래스의 멤버 메소드인 것처럼 호출할 수 있지만 그 클래스의 밖에 선언된 함수
* `수신 객체 타입(Receiver Type)` : 함수가 확장할 클래스의 이름
* `수신 객체(Receiver Object)` : 호출되는 대상이 되는 값   
  ex)
  ```kotlin
    fun String.lastChar(): Char = this.get(this.length - 1)
    // this 생략 가능 
        
    println("Kotlin".lastChar())
    // 실행결과 : n
    // 수신 객체 : "Kotlin", 수신 객체 타입 : String
  ```
  
* 코틀린과 자바의 메소드 오버라이딩은 일방적인 객체지향의 방식을 따르고 있으나, **확장 함수는 오버라이딩이 불가능함**.   
    
  ### 확장 함수가 오버라이딩이 불가능한 이유?
    > 확장 함수는 클래스의 밖에서 선언되기 때문에 클래스의 일부가 아니다.   
    확장 함수를 호출할 때 수신 객체로 지정한 변수의 정적 타입(정적 디스패치)에 의해 어떤 확장 함수가 호출될지 결정될 뿐,
    그 변수에 저장된 객체의 동적인 타입에 의해(동적 디스패치)확장 함수가 결정되지 않기 때문이다.
    즉. 코틀린은 호출될 확장함수를 정적으로 결정한다.
    
  ### 정적 디스패치(Static Dispatch)
  - 컴파일 시점에 알려진 변수 타입에 따라 정해진 메소드를 호출하는 방식   
  
  ### 동적 디스패치(Dynamic Dispatch)
  - 실행 시점에 객체 타입에 따라 동적으로 호출될 대상 메소드를 결정하는 방식


<br>


## 컬렉션 처리
### 1. 중위 호출과 구조 분해 선언
* `중위 호출(Infix Call)` : 수신 객체와 유일한 메소드 인자 사이에 메소드 이름을 넣는 것을 의미한다.   
  ex)   
  `1.to("One")` -> "to" 메소드를 일반적인 방식으로 호출함   
  `1 to "One"` -> "to" 메소드를 중위 호출 방식으로 호출함
  
* 중위 호출을 사용하도록 하려면 함수의 선언 앞에 infix 변경자를 선언해야 한다.
  ex)   
  `inflx fun Any.to(other: Any) = Pair(this, other)`