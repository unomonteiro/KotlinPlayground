fun main(args: Array<String>) {
    var map = hashMapOf(1 to "Carlos", 2 to "lopes")
    map.put(3, "Sousa")
    println(map.get(3))
    println(map[3])

    var ar = arrayOf(1, 10, 22, 11)
    println(ar[0])

    var list = listOf(11, 22, 23)
    // linked list cannot be changed
    // list[0] = 22
    for (item in list) {
        println(item)
    }

    var mList = mutableListOf(11, 22, 23)
    mList[0] = 22
    for (item in mList) {
        println(item)
    }
}