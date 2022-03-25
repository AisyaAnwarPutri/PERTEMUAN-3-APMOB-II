package id.ac.polbeng.Aisya.test_kelas

class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }

}

fun main() {
    val aisya = PersonA("Aisya Anwar", "Putri", 21)
    println("Name : ${aisya.firstName} ${aisya.lastName}")
    println("Age : ${aisya.age}")

}