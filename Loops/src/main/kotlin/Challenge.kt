fun main() {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++
        if(isOdd(number)) {
            continue
        }

        evenNumberCounter++
        print("$number ")
    }
    println("\nTotal #even numbers : $evenNumberCounter")
}

fun isEven(number: Int) =  (number % 2 == 0)
fun isOdd(number: Int) = (number % 2 != 0)