package id.ac.polbeng.Aisya.test_kelas

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int

    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val aisya = PersonD("Aisya Anwar", "Putri", 21)
    println("Name : ${aisya.firstName} ${aisya.lastName}")
    println("Age : ${aisya.age}")
}