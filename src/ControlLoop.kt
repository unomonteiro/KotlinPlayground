fun main(args: Array<String>) {
    for (count in 1..6) {
        if (count == 4){
            continue
        }
        println("count:$count")
    }
    println("loop done")

    for (count in 1..10){

        for (count2 in 1..5) {
            println("count:$count")
            if(count2==2){
                break
            }
        }

    }
    println("loop2 done")

    loop@ for (count in 1..10){

        for (count2 in 1..5) {
            println("count:$count")
            if(count2==2){
                break@loop
            }
        }

    }
    println("loop3 done")

}