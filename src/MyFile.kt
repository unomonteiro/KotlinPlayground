import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("1 - read\n2 - write\n")
    val operation = readLine()!!.toInt()
    when (operation) {
        1 -> readFromFile()
        2 -> {
            print("write to file:")
            val str = readLine().toString()
            writeToFile(str)
        }
    }
}

fun writeToFile(str:String){
    try {
        val append = true
        val fo= FileWriter("test.txt", append)
        fo.write(str+"\n")
        fo.close()
        println("file written")
    } catch (e: Exception) {
        println(e.message)
    }
}

fun readFromFile() {
    try {
        val fi = FileReader("test.txt")
        var c: Int?
        do {
            c = fi.read()
            print(c.toChar())
        } while (c != -1)
    } catch (e: Exception) {
        println(e.message)
    }
}