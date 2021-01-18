
## Chapter 03. 함수와 함수형 프로그래밍

<br>

1. 함수 선언하고 호출하기
   1. 함수 선언하기
       ```kotlin
       fun 함수 이름([변수 이름: 자료형, 변수 이름: 자료형..]): [반환값의 자료형] {
            표현식...
            [return 반환값]
       }
       ```
       
        - 대괄호로 감싼 내용들은 생략 가능함.
        - 매개변수는 생략가능.  
   ###
   2. 함수 매개변수의 기본값 설정
    
       ```kotlin
        fun add (name: String, email: String = "default") {
            // 이 때, 매개변수 email로 넘어오는 value가 없으면 자동으로 default로 설정됨.
            val output = "${name}님의 이메일은 ${email}입니다."
            println(output)
        }
        ```
   ###
   3. 가변인자 Vararg(Variable Argument)
        - 가변인자란?
            - 인자의 개수가 변한다.
            - 똑같은 타입의 인자를 여러 개 받아야 하지만, 개수가 정해져 있지 않을 때 유용하다.
   ###
   > <h3>Stack OverFlow</h3>
   > - 함수의 프레임은 스택에 생성되고, 스택은 메모리의 높은 구조에서부터 낮은 구조로 생성된다. 힙 영역은 동적으로 생성된 객체의 정보가 담겨져 있는데,
       > 보통 낮은 주소 -> 높은 주소로 주소값이 커져가면서 정보를 저장하기 때문에 **두 영역이 만나지 않도록 메모리를 관리하는 것이 중요**하다.
       > 만약 무한하게 함수를 호출하여 스택 프레임을 생성하면 정해진 스택 영역의 경계를 넘어서면서 힙 영역과 겹치게 되는데, 이 때 발생하는 오류를 **Stack Overflow** 라고 한다.

<br>

2. 함수형 프로그래밍
    1. 함수형 프로그래밍이란?
        - `순수 함수`를 작성하여 프로그램의 부작용을 줄이는 프로그래밍
        - `람다식`과 `고차함수` 사용
    ###
    2. 함수형 프로그래밍의 정의와 특징
        - 순수 함수를 사용해야 한다.
        - 람다식을 사용할 수 있다.
        - 고차 함수를 사용할 수 있다.
    ###
    3. 순수 함수
        - 부작용이 없는 함수. 함수 외부의 어떤 상태도 바꾸지 않음.
        - 스레드에 사용해도 안전하고 코드를 테스트하기도 쉽다.
        - 값이 예측가능하므로 결정적이라고도 한다.
    ###
    4. 순수함수의 조건
        - 같은 인자에 대하여 항상 같은 값을 반환한다.
        - 함수 외부의 어떤 상태도 바꾸지 않는다.
    ###
    5. 람다식(Lambda Expressions)
        - 이름이 없는 함수 형태, 람다 대수에서 유래됨.
        ex) `{x, y -> x + y}`
    ###
    6. 일급 객체의 특징
        - 일급 객체는 함수의 인자로 전달할 수 있다.
        - 일급 객체는 함수의 반환값에 사용할 수 있다.
        - 일급 객체는 변수에 담을 수 있다.   
        
        => **함수형 프로그래밍에서는 함수를 일급 객체로 생각한다. 즉, 함수의 인자나 반환값 변수에 또 다른 함수를 사용할 수 있다는 의미다.**
    
<br>

3. 고차 함수와 람다식
    1. 고차 함수(High-order Function)란?
        - 다른 함수를 인자로 사용하거나 함수를 결괏값으로 반환하는 함수.
    
        ```kotlin
        fun main() {
            println(highFunc({x, y -> x + y}, 10, 20))
        }
       
        fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int) : Int = sum(a, b)
        ```
<br>

4. 고차 함수와 람다식의 사례 알아보기
    -  코틀린에서의 네트워크 호출 구현
       - 자바로 만들어진 네트워크 호출 구현 예시

         ```java
         public interface Callback {
            void onSuccess(ResultType result);
            void onError(Exception exception);
         }
         
         // networkCall 호출
         public void networkCall(Callback callback) {
            try {
                ...
                // 성공하면 onSuccess() 콜백 함수 호출
                callback.onSuccess(myResult);
            catch (Throwable e) {
                // 실패하면 onError() 콜백 함수 호출
                callback.onError(e);
            }
         }

         networkCall(new Callback()) {
            public void onSuccess(ResultType result) {
                // 네트워크 호출에 성공했을 때의 구현부
                ...
            }

            public void onError(Exception e) {
                 // 네트워크 호출에 실패했을 때의 구현부  
                 ...
            }
         }
            ```
       ###
       - 코틀린으로 만들어진 네트워크 호출 구현 예시
            ```kotlin
            // 1. 람다식 함수의 매개변수를 가진 networkCall() 함수 선언 
            fun networkCall(onSuccess: (ResultType) -> Unit, onError: (Throwable) -> Unit) {
                try { 
                    ...
                    // 성공
                    onSuccess(myResult)
                } catch (Throwable e) {
                    // 실패
                    onError(e)
                }
            }
                
            // 2. networkall() 함수 사용 - 인자 형식에 람다식을 사용 
            networkCall(result -> {
                // 네트워크 호출에 성공했을 때 구현부 
            }, error -> {
                // 네트워크 호출에 실패했을 때 구현부 
            }) 
            ```

<br>

5. 코틀린의 다양한 함수 알아보기
    - 익명 함수
    - 인라인 함수
    - 확장 함수
    - 재귀 함수