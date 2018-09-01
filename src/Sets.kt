fun main(args: Array<String>) {
    var setElement = setOf(1, 2, 3, 11, 44, 44)
    // setElementM.add(77) DOESN'T WORK
    for (element in setElement) {
        println(element)
    }

    var setElementM = mutableSetOf(1, 2, 3, 11, 44, 44)
    setElementM.add(77)
    for (element in setElementM) {
        println(element)
    }
}