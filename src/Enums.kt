enum class Direction{
    NORTH, SOUTH, EASY,WEST
}

fun main(args: Array<String>) {
    var userdirect=Direction.NORTH

    if (userdirect == Direction.NORTH) {
        println("he went to north")
    } else {
        println("don't know where he went")
    }
}