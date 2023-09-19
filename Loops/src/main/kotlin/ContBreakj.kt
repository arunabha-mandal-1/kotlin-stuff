fun main() {

    // continue : skips
    // works with for and while
    var number1 = 0
    while (number1 < 10) {
        number1 ++
        if (number1 in 3..7) continue
        print("$number1 ")
    }

    // break : breaks
    // works with for and while
    println()
    var number2 = 0
    while (number2 < 10) {
        number2++
        if(number2 == 5) break
        print("$number2 ")
    }

    // nested loops : while and for

    // labeled break and continue
    // we cannot target inner loop from an outer loop
    println("\nLabeled break and continue : ")
    var number3 = 0
    outerLoop@ while (number3 < 10) {
        number3++
        println(number3)

        var i =0
        while (i < 5) {
//            if(i==0) break@outerLoop
            i++
            println("***$i")
        }
    }
}