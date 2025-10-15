package main.kotlin.chapter2_functional_programming

fun main() {
    val greeting: () -> Unit = ::greet
    greeting()

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
    val op: (Int, Int) -> Int = ::multiply
    println(op(4, 5))

}

fun greet() {
    println("Hello!")
}


