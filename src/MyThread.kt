fun main(args: Array<String>) {
    var t1 = UserThread("t1")
    t1.start()
    var t2 = UserThread("t2")
    t2.start()
    t2.join() // waits for t2 finish
    println("thread running")
}

class UserThread(val dName: String) :Thread() {
    override fun run() {
        // write thread
        var count = 0
        while (count < 10) {
            println("$dName count: $count")
            count++
            try {
                Thread.sleep(1000)
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }
}