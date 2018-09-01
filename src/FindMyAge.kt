import java.util.*

fun main(args: Array<String>) {

    //input
    print("enter your DOB:")
    var DOB:Int = readLine()!!.toInt()

    //process
    var year = Calendar.YEAR
    var age = 2018 - DOB

    //output
    println("Your age is $age years")

}