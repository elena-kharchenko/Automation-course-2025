//August 12

fun main(){
    great()
    task1()
    task2()
    task3()
    task4()
    task5()
    task6()
    task7()
    task8()
    task9()
    task10()
    task11()
    sayBye()
}

fun great() {
    println("Hello you")
}

fun sayBye(){
    println("Goodbye")
}

// if statement
fun task1() {
    println("Task 1:")
    val a = 10
    if (a == 10) {
        println("It's true a = $a")
    }
}

// if...else statement
fun task2() {
    println("Task 2:")
    val a = 10
    if (a == 10)
        println("It's true a = $a")
    else
        println("Doesn't equal to 10")
}


// multiple options else if
fun task3() {
    println("Task 3:")
    val a = 14
    if (a == 10) {
        println("a is equal to 10")
    } else {
        println("a has an unknown value")
    }
}


// returning the value grom if
fun task4() {
    println("Task 4:")
    val a = 10
    val b = 20
    val c = if (a > b) a else b
    println("C is $c")

}


// When expression with else
fun task5() {
    println("Task 5:")
    val a = 10
    when(a) {
        1 -> println("a is 1")
        2 -> println("a is 2")
        else -> println("a is neither 1 or 2")
    }
}

// When expression
fun task6() {
    println("Task 6:")
    val isEnabled = true
    when(isEnabled) {
        false -> println("a is 1")
        true -> println("a is 2")
    }
}


// Multiple actions for one value
fun task7() {
    println("Task 7:")
    var a = 10
    when(a) {
        10 -> {
            println("a was 10")
            a = a + 1
        }

        11 -> {
            println("a was 11")
            a = a + 2
        }

        else -> {
            println("a is neither 10 or 11")
        }
    }
    println("The new answer is $a")
}

//Grouping several values
fun task8() {
    println("Task 8:")
    val a = 15
    when (a) {
        10,20 -> println("a is 10 or 20")
        else -> println("a is neither 10 or 20")
    }
}

// Checking ranges
fun task9() {
    println("Task 9:")
    val a = 0
    when (a) {
        0 -> println("a is 0")
        in 1..10 -> {
            println("a is in between 1..10")
        }
        in 11..20 -> {
            println("a is in between 11..20")
        }
        else -> println("a is outside the range")
    }

}


//returning value
fun task10() {
    println("Task 10:")
    val day = 2
    val dayOfWeek: String = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Unknown"
    }
    println(dayOfWeek)
}

//dynamic values and calculations
fun task11() {
    val a = 10
    val b = 20

    when (a + b) {
        20 -> println("a + b = 20")
        30 -> println("a + b = 30")
        else -> println("a is neither 20 or 30")
    }
}