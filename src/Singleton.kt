class Singleton {
    var name:String?=null
    private constructor() {
        println("instance is createdd")
    }

    companion object {
        val instance:Singleton by lazy { Singleton() }
    }
}

fun main(args: Array<String>) {

    var s1 = Singleton.instance
    s1.name = "hello"
    println(s1.name)

    var s2 = Singleton.instance
    println(s2.name)

}