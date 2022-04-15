package id.ac.polbeng.Aisya.test_kelas

fun main() {
    //membuat instance dari interface
    var programmer: Human = object : Human {
        override fun think() { // overriding the think method
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}

interface Human {
    fun think()
}