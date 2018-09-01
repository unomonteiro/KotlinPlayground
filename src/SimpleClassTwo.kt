class CarTwo(){
    var type: String?=null
    var model: Int?=null
    var price: Double?=null
    var milesDrive:Int?=null
    var owner: String?=null

    constructor(type: String, model: Int, price: Double,
                milesDrive: Int, owner: String) : this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    constructor(owner: String) : this() {
        this.owner = owner
    }


    fun getCarPrice(): Double {

        return this.price!! - (this.milesDrive!!.toDouble()*10)
    }
}


fun main(args: Array<String>) {

    val cCar = CarTwo("Opel",1997, 11111.0, 150, "Carlos")
    println("cCar type: " + cCar.type)
    val mCar = CarTwo("Honda", 2011, 20000.0, 3000, "Carlitos")
    println("mCar type: " + cCar.getCarPrice())

}