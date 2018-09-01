open class Operations(){
//    private var processName: String? = null
//    protected var processName: String? = null
    var processName: String? = null

    fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}

class Multioperations():Operations() {

    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
    fun getName(){
        super.processName
    }
}

fun main(args: Array<String>) {
    var op=Operations()
    var sum = op.sum(10, 15)
    println("sum: " + sum)
    println("process name: " + op.processName)

    var div = op.div(12, 11)
    println("div: " + div)

    //multiOp
    var op2 = Multioperations()
    sum = op2.sum(1, 4)
    println("sum: " + sum)

    var mul = op2.mul(3, 4)
    println("mul: " + mul)

}