package kotlinInAction.chap06

/*
* Kotlin In Action
* Chap 06. 코틀린 타입 시스템
*
* 6.1.3. 안전한 호출 연산자 ?.
  -> 널이 될 수 있는 프로퍼티를 다루기 위해 안전한 호출 사용하기
  -> 안전한 호출 연쇄시키기
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

fun main() {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    val person = Person("Dmitry", null)
    println(person.countryName())
}

/*
*   < 실행 결과 >
*   Da Boss
    null
    Unknown
* */