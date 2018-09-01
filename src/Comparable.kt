import java.util.*


class Person(var name:String, var age:Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }

}

fun main(args: Array<String>) {
    /*var listOfNames = ArrayList<String>()
    listOfNames.add("carlos")
    listOfNames.add("lopes")
    listOfNames.add("sousa")
    listOfNames.add("menezes")
    println("before sort")
    for (name in listOfNames) {
        println(name)
    }
    Collections.sort(listOfNames)
    println("after sort")
    for (name in listOfNames) {
        println(name)
    }*/


    var listOfPersons = ArrayList<Person>()
    listOfPersons.add(Person("carlos", 34))
    listOfPersons.add(Person("duarte", 27))
    listOfPersons.add(Person("elia", 21))

    println("before sort")
    for (person in listOfPersons) {
        println(person.name)
        println(person.age)
    }
    Collections.sort(listOfPersons)
    println("\nafter sort")
    for (person in listOfPersons) {
        println(person.name)
        println(person.age)
    }
}
