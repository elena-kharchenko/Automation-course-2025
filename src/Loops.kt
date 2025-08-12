//loops
fun main() {
    println("Task 1:")
    unit6task1()
    println("Task 2:")
    unit6task2()
    println("Task 3:")
    unit6task3()
}

fun unit6task1 (){
    for (i in 1..9) {
        print("$i \t")
    }
    println(" ")
}

fun unit6task2 (){
    for (i in 1..9) {
        val a = i + 1
        print("$a \t")
    }
    println(" ")
}

/*
        (0;0)   (1;0)   (2:0)
(0;0)     1       2       3
(0;1)     4       5       6
(0;2)     7       8       9
 */

fun unit6task3 (){
    for (i in 1..9) {
        for (j in 1..9) {
            print("${i * j} \t")
        }
        println()
    }
}
