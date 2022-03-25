package id.ac.polbeng.Aisya.test_kelas

class PersonB (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}
fun main(){
    val aisya = PersonB("Aisya Anwar", "Putri", 21)
    println("Name : ${aisya.firstName} ${aisya.lastName}")
    println("Age : ${aisya.age}")
}