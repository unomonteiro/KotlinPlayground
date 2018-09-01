
fun main(args: Array<String>) {
    printEvenNumbersFromOneToHundred()
}

fun printEvenNumbersFromOneToHundred() {
    for (number in 1..100) {
        if (number % 2 == 0) print(number.toString() + " ")
    }
}

fun isNumberEvenOrOdd() {
    print("Insert number:")
    var x:Int = readLine()!!.toInt()
    if (x % 2 == 0) println("$x is even")
    else println("$x number is odd")

}

fun swapNumbers() {
    var x = 10
    var y = 20

    x = x+y
    y = x-y
    x = x-y
}

fun swapNumnersA() {
    // swap two numbers without using x temporary variable
    var x = 1
    var y = 2

    x = y.also { y = x }

    println("x: " + x) // print x
    println("y: " + y) // print y

}