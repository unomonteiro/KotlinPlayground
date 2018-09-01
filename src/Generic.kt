class UserAdmins<T>(credit: T) {
    init {
        println(credit)
    }
}

class UserThings<T, F>(credit: T, id: F) {

    init {
        println(credit)
    }
}

fun <T> display(process: T){
    println(process)
}

fun main(args: Array<String>) {
    var userAdmin = UserAdmins<String>("Carlos")
    var userAdmin2 = UserAdmins<Int>(11)
    var userAdmin3 = UserAdmins<Double>(11.2)

    var userThings = UserThings<String, Int>("Carlos", 11)
    var userThings2 = UserThings<Int, String>(11, "blah")
    var userThings3 = UserThings<Double, String>(11.2, "string")

    display<Int>(22)
    display<String>("processs")
}

