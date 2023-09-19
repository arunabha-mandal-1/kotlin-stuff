fun main() {

    var number = 0
    // As long as a certain condition is true
    while (number < 10) {
        print("$number ")
        number++
    }

    var number2 = 10
    println()
    while (number2 < 20) print("${number2++} ")

    // Run at least once even if the cond is false
    println()
    var number3 = 10
    do {
        print("$number3 ")
    }while (number3 < 10)
}