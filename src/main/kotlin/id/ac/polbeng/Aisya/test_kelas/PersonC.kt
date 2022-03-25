package id.ac.polbeng.Aisya.test_kelas

class PersonC (var firstName: String, var lastName: String, var age: Int) {}

fun main() {
    val aisya = PersonC("Aisya Anwar", "Putri", 21)
    println("Name : ${aisya.firstName} ${aisya.lastName}")
    println("Age : ${aisya.age}")
}