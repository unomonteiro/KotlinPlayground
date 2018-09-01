fun main(args: Array<String>) {
    for (item in 1..3) {
        println("line")
    }

    for (item in 1..3) {
        println("count: "+item)
    }

    var count=1
    while(count<=5) {
        println("enter the loop")
        // block of code
        if(count==2) {
            println("count:$count")
        }


        count++

    }

    println("loops done")
}