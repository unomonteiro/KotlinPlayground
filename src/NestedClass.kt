
class Outer {

    private val name:String?=null

    inner class Nested {
        fun show(){
            println(name)
        }
    }
}

fun main(args: Array<String>) {
    var outer = Outer()
    var nested = outer.Nested()
    nested.show()
}