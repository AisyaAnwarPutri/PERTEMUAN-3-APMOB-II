package id.ac.polbeng.Aisya.test_kelas

fun main() {
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Aisya")
    greeter.greet("Yesi Indriani")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Anwar"))

}
