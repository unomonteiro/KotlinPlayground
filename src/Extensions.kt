fun ArrayList<String>.swap(index1: Int, index2: Int) {
    var temp = this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, temp)
}

fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("Carlos")
    arrayList.add("Monteiro")
    arrayList.add("Lopes")
    arrayList.swap(1,2)
    println(arrayList)

}