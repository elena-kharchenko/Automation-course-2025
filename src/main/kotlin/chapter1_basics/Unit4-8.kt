package main.kotlin.chapter1_basics

fun main() {
    println("Task 1:")
    ifTask1()
    println("Task 2:")
    ifTask2()
    println("Task 3:")
    whenTask1()
    println("Task 4:")
    whenTask2()
    println("Task 5:")
    forTask1()
    println("Task 6:")
    forTask2()
    println("Task 7:")
    rangeTask1()
    println("Task 8:")
    rangeTask2()
    println("Task 9:")
    arrayTask1()
    println("Task 10:")
    arrayTask2()


}

fun ifTask1() {
    val number = -3

    if (number > 0) {
        println("Number is positive")
    } else if (number < 0) {
        println("Number is negative")
    } else {
        println("Number is zero")
    }
}


fun ifTask2() {
    val number = 7

    if (number % 2 == 0) {
        println("Number is even")
    } else {
        println("Number is odd")
    }
}


fun whenTask1() {
    val grade = 3

    when (grade) {
        5 -> println("Excellent")
        4 -> println("Good")
        3 -> println("Okay")
        2 -> println("Bad")
        1 -> println("Terrible")
        else -> println("Unknown grade")
    }
}

fun whenTask2() {
    val month = 5

    when (month) {
        in 12..12, in 1..2 -> println("Winter")
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Autumn")
        else -> println("Unknown month")
    }
}

fun forTask1() {
    for (i in 1..10) {
        println(i)
    }
}

fun forTask2() {
    for (i in 1..10) {
        println("5 x $i = ${5 * i}")
    }
}

fun rangeTask1() {
    for (i in 2..20 step 2) {
        println(i)
    }
}

fun rangeTask2() {
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun arrayTask1() {
    val names = arrayOf("Tom", "Sam", "Bob")
    for (name in names) {
        println(name)
    }
}

fun arrayTask2() {
    val numbers = arrayOf(6, 13, 1, 8, 25)
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    println("Sum: $sum")
}
