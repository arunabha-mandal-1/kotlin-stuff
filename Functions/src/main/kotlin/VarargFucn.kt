fun main(args: Array<String>) {
    println(sum3(12, 12, 23, 4, 74, 45, 74, 10, 15))
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
    numbers.forEach { println(it) }
}