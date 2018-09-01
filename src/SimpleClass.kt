class Car(var type: String, model: Int, var price: Double, var milesDrive:Int, owner: String){

    init {
        println("Class created\n" +
                "model: $type\n" +
                "price: $price\n" +
                "milesDrive: $milesDrive\n" +
                "owner: $owner\n")
    }

    fun getCarPrice(): Double {

        return this.price - (this.milesDrive.toDouble()*10)
    }
}


fun main(args: Array<String>) {

    val cCar = Car("Opel",1997, 11111.0, 150, "Carlos")
    println("cCar type: " + cCar.type)
    val mCar = Car("Honda", 2011, 20000.0, 3000, "Carlitos")
    println("mCar type: " + cCar.getCarPrice())

}