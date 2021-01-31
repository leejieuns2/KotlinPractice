package kotlinInAction.chap03

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) {
            // User의 프로퍼티를 직접 사용할 수 있다.
            throw IllegalArgumentException ("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "name")
    validate(address, "address")
}

fun saveUser(user: User) {
    // 확장함수를 호출한다.
    user.validateBeforeSave()
}