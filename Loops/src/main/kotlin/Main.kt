fun main(args: Array<String>) {

    // 1 and 10 included
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // 1 included, 10 excluded
    for (i in 1 until 10) {
        print("$i ")
    }
    println()

    // backwards
    for (i in 10 downTo 1){
        print("$i ")
    }
    println()

    // arbitrary step
    for (i in 1 until 10 step 2) {
        print("$i ")
    }
    println()

    for(i in 1..10){
        print("$i ")
    }
    println()
}