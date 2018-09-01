abstract class CreditCard() {
    fun creditId():String{
        return "234234234"
    }
    abstract fun newCredit()
}

class UserInfo() : CreditCard() {
    fun getInfo():String {
        return creditId()
    }

    override fun newCredit() {
        println("new card created")
    }

}

fun main(args: Array<String>) {
//    var credit = CreditCard()
//    println(credit.creditId())
    var user = UserInfo()
    println(user.getInfo())
}