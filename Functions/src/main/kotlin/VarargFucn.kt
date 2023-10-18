fun main(args: Array<String>) {
    println(sum2(12, 12, 23, 4, 74, 45, 74, 10, 15))
    sum3(1, 2, 3, 4, 8, 45, 10)
    printNames("Arunabha", "Kittu", "Samrat", "Kushal", "Jack", "Alex")
}

fun sum1(a: Int, b: Int, c: Int, d: Int): Int {
    return (a + b + c + d)
}

// vararg : to pass indefinite numbers of arguments
fun sum2(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}

fun sum3(vararg numbers: Int) {
    println("Numbers are: ")
    numbers.forEach { println(it) }
}

fun printNames(vararg names: String){
    println("Names are: ")
    names.forEach { println(it) }
}