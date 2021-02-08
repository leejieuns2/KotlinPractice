package kotlinInAction.chap06

import java.lang.IllegalArgumentException

/*
* Kotlin In Action
* Chap 06. 코틀린 타입 시스템
*
* 6.1.3. 안전한 호출 연산자 ?.
  -> 널이 될 수 있는 프로퍼티를 다루기 위해 안전한 호출 사용하기
  -> 안전한 호출 연쇄시키기
  -> throw와 엘비스 연산자 함께 사용하기
* */

class Employee(val name: String, val manager: Employee?)

class Address(val streetAddress: String, val zipcode: Int,
                val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    // 여러 안전한 호출 연산자를 연쇄해 사용한다.
    val country = this.company?.address?.country
    return if(country != null) country else "Unknown"
}

fun managerName(employee: Employee) : String? = employee.manager?.name

fun printShippingLabel(person: Person) {
    // 엘비스 연산자를 사용해 주소가 null이면 예외를 발생시킨다.
    val address = person.company?.address ?: throw IllegalArgumentException("No Address")

    // 만약 앞 문장에서 예외가 발생이 안되었다면, 널이 아니라는 의미이므로.
    with(address) {
        println(streetAddress)
        println("$zipcode $city, $country")
    }

}

fun main() {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    val person = Person("Dmitry", null)
    println(person.countryName())

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("Jetbrains", address)
    val person2 = Person("Dmitry", jetbrains)

    printShippingLabel(person2)

    // address가 null이므로 예외 처리됨.
    printShippingLabel(person)
}

/*
*   < 실행 결과 >
*   Da Boss
    null
    Unknown
    Elsestr. 47
    80687 Munich, Germany
    Exception in thread "main" java.lang.IllegalArgumentException: No Address
	    at kotlinInAction.chap06.SaveCallKt.printShippingLabel(SaveCall.kt:34)
* */