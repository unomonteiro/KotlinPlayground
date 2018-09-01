fun main(args: Array<String>) {
    var r = sum(1, 2)
    println(r)
    r = sum(1, 2, 3)
    println(r)
}

fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun sum(n1: Int, n2: Int, n3: Int): Int {
    return n1 + n2 + n3
}
