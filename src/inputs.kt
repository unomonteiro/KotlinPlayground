fun main(args: Array<String>) {

    print("Enter name: ")
    val name = readLine()
    print("Enter age: ")
    val age:Int = readLine()!!.toInt()
    print("Enter job: ")
    var job:String? = readLine()
    print("Enter pi: ")
    var pi:Double= readLine()!!.toDouble()

    println("Output:")
    println("name:" + name)
    println("age:" + age)
    println("job:" + job)
    println("pi:" + pi)
}