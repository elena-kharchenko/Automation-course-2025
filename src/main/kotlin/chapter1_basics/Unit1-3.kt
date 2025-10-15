package main.kotlin.chapter1_basics

fun main() {
    assignment1()
    assignment2()
    assignment3()
    assignment4()
    assignment5()
    assignment6()
    assignment7()
    assignment8()
    assignment9()
    assignment10()
    assignment11()
    assignment12()
    assignment13()
    assignment14()
    assignment15()
}

fun assignment1() {
    val daysInWeek = 7
    println("There are $daysInWeek days in a week.")
}

fun assignment2() {
    var userScore = 0
    println("Initial score: $userScore")
    userScore += 10
    println("Final score: $userScore")
}

fun assignment3() {
    val width = 5
    val height = 10
    val area = width * height
    println("The area of the rectangle is: $area")
}

fun assignment4() {
    val pi: Double = 3.14159
    println("The value of Pi is: $pi")
}


fun assignment5() {
    val userName = "Lena"
    println("User: $userName")
}


fun assignment6() {
    val number = 25
    val isEven = number % 5 == 0
    println("Is the number $number even? $isEven")
}


fun assignment7() {
    val firstName = "John"
    val lastName = "Doe"
    val fullName = "$firstName $lastName"
    println("Full name: $fullName")
}


fun assignment8() {
    var balance = 100
    balance = 120
    println("New balance: $balance")
}


fun assignment9() {
    val myAge = 18
    val requiredAge = 21
    val canEnter = myAge >= requiredAge
    println("Can you enter? $canEnter")
}

fun assignment10() {
    val price = 180.0
    val discountPercentage = 10.0
    val finalPrice = price - (price * discountPercentage / 100)
    println("Final price: $finalPrice")
}

fun assignment11() {
    val isUserActive: Boolean = true
    println("User is active: $isUserActive")
}

fun assignment12() {
    val temperature = 20
    println(
        "It's $temperature degrees. ${
            if (temperature > 25) "It is warm." else "It is cold."
        }"
    )
}


fun assignment13() {
    val baskets = 3
    val applesPerBasket = 15
    val extraApples = 7
    val totalApples = baskets * applesPerBasket + extraApples
    println("Total apples: $totalApples")
}


fun assignment14() {
    val hasKey = true
    val knowsPassword = false
    val canOpenDoor = hasKey && knowsPassword
    println("Can open the door? $canOpenDoor")
}


fun assignment15() {
    var messageCount = 99
    messageCount++
    println("New messages: $messageCount")
}
