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
    val budi = PersonA("Aisya Anwar", "Putri", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")

}