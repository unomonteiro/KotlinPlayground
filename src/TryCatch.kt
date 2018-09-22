fun main(args: Array<String>) {
    try {
        var n2:Int = readLine()!!.toInt()
        var div = 100/n2
        println("Div: $div")
    } catch (e: Exception) {
        println(e.message)
    }
    println("app is done")
}