
## Chapter 04. 프로그램의 흐름 제어

<br>

1. 조건문
    1. when 문으로 다양한 조건 처리하기
        1. 인자를 사용하는 경우
           
            ```kotlin
            when(인자) {
                인자에 일치하는 값 혹은 표현식 -> 수행할 문장
                인자에 일치하는 범위 -> 수행할 문장
                ...
                else -> 수행할 문장
           } 
            ```
            - 자바의 switch문과 비슷하지만 break가 필요 없어 간단하게 코드 작성 가능.
            - 일치되는 조건을 한 번에 여러 개 표현할 경우 쉼표(,)를 통해 표현할 수 있음.
        ###
        2. 인자를 사용하지 않는 경우

            ```kotlin
            when(인자) {
                조건[혹은 표현식] -> 실행할 문장
                ...
           } 
            ```
            - 특정 인자에 제한하지 않고 다양한 조건을 구성할 수 있다는 장점이 있음.

<br>

2. 반복문
    1. for문을 사용한 다양한 반복 방법
        - 기본형   
          `for(요소 변수 in 컬렉션 또는 범위) { 반복할 본문 }`
    
        - downTo 키워드 (숫자를 역순으로 작성)   
            ex) `for(i in 5 downTo 1) { ... }`
          
        - step 키워드 (일정한 숫자만큼 증가)
            ex) `for(i in 1..5 step 2) { ... }`    
          -> 1부터 5까지 반복하되 i가 2씩 증가하는 for문
          
        - downTo와 step을 혼합해 사용하는 것도 가능.
            ex) `for(i in 5 downTo 1 step 2) { ... }`

    ###
   
   > #### 데몬 (Daemon) 프로그램
   > - 도깨비나 유령을 뜻하는 말에서 비롯됨.
   > - 백그라운드에서 실행하면서 종료되지 않고 지속적으로 무엇인가 처리하는 프로그램. 사용자가 직접 제어하지 않고도 특정한 작업을 지속적으로 처리할 수 있음.

<br>

3. 흐름의 중단과 반환
    1. 흐름 제어문
        - `return` : 함수에서 결괏값을 반환하거나 지정된 라벨로 이동한다.
        - `break` : for문이나 while문의 조건식에 상관없이 반복문을 끝낸다.
        - `continue` : for문이나 while문의 본문을 모두 수행하지 않고 다시 조건식으로 넘어간다.
    ###
    2. 예외 처리문
        - `try{..} catch{..}` : try 블록의 본문을 수행하는 도중 예외가 발생하면 catch 블록의 본문을 실행한다.
        - `try{..} catch{..} finally{..}` : 예외가 발생해도 finally 블록 본문은 항상 실행된다.