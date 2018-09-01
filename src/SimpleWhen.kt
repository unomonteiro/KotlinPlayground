fun main(args: Array<String>) {
    var x = 10
    when (x) {
        1,2 -> println("value is 1 or 2")
        in 10..30 -> println("value is between 10 and 30")
        !in 10..30 -> println("value is NOT between 10 and 30")
        else -> {
            println("unknown value")
        }

    }
}