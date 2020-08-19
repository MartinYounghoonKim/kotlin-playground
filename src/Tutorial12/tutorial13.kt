package Tutorial12

import java.lang.IllegalArgumentException

class Person1 (val id: Int, val name: String, val address: String)

fun main() {
    val person1 = Person1(1, "Martin", "Seoul")
    val person2 = Person1(2, "Martin", "")
//    saveUser(person2)
    saveUser(person1)

    val person3 = Person2(2, "Martin", "")

    save(person3);
}

fun saveUser (user: Person1) {
    fun validate (value: String, fieldName: String) {
        // 내부 함수에서는 외부 함수의 파라미터에 접근이 가능하다.
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : empty $fieldName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
}

class Person2 (val id: Int, val name: String, val address: String)

fun Person2.validate () {
    fun validate (value: String, fieldName: String) {
        // 내부 함수에서는 외부 함수의 파라미터에 접근이 가능하다.
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${id} : empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun save (person2: Person2) {
    person2.validate()
}