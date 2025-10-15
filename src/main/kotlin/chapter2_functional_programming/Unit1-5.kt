package main.kotlin.chapter2_functional_programming

fun main() {
    great("Lena")
    displayUser("Lena", 32)
    showMessage("This is a homework in chapter 2")
    showMessage("So interesting!")
    printNumbers(3,6,1,9)
    concatStrings("First", "Second", "Third")
    addToGroup("Alex", "Lena", "Peter")
    val result = multiply(7, 8)
    println("The result of multiplication is: $result")
    println(isEven(3))  // false
    println(isEven(12)) // true
    printIfPositive(8) // Output: 8
    printIfPositive(-2) // Output: (nothing)
    println(cube(4))
    checkAndPrint(9) // Output: Valid
    checkAndPrint(-4) // Output: Invalid
    compare(5, 9) // Output: Both less than 10
    compare(9, 15) // Output: Not both less than 10
    show("Hi") // Output: String: Hello
    show(36)   // Output: Int: 36
    println(max(7, 9))
    println(max(3.0, 4.3))
    println(sum(4, 3))
    println(sum(1, 2, 3))

}

fun great(name: String) {
    println("Hello, $name!")
}


fun displayUser(name: String, age: Int) {
    println("Name: $name, Age: $age")
}


fun showMessage(message: String) {
    println(message)
}

fun printNumbers(vararg numbers: Int) {
    for (n in numbers)
        println(n)
}

fun concatStrings(vararg words: String) {
    println(words.joinToString(" "))
}

fun addToGroup(group: String, vararg users: String) {
    println("Group QA: $group")
    for (user in users)
        println(user)
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun isEven(n: Int): Boolean {
    return n % 4 == 0
}


fun printIfPositive(n: Int) {
    if (n <= 0) return
    println(n)
}

fun cube(a: Int) = a * a * a


fun checkAndPrint(n: Int) {
    fun isValid(x: Int) = x > 0
    if (isValid(n))
        println("Valid")
    else
        println("Invalid")
}

fun compare(a: Int, b: Int) {
    fun bothSmall(x: Int, y: Int) = x < 10 && y < 10
    if (bothSmall(a, b))
        println("Both less than 10")
    else
        println("Not both less than 10")
}

fun show(x: String) {
    println("String: $x")
}

fun show(x: Int) {
    println("Int: $x")
}


fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max(a: Double, b: Double): Double {
    return if (a > b) a else b
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}