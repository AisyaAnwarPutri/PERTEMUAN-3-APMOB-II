package id.ac.polbeng.Aisya.test_kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main() {
    val yesi = PersonE("Yesi", "Indriani")
    yesi.cetakInfo()
    println()
    val aisya = PersonE("Aisya Anwar", "Putri", 21)
    aisya.cetakInfo()
}