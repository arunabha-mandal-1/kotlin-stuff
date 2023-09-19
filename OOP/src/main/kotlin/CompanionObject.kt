fun main() {
//    val calculator = Calculator()
//    val result = calculator.sum(10, 20)
//    println(result)

    // Use sum func without creating Calculator obj
    // In this case we did not create Calculator obj, still we used sum function
    val result = Calculator.sum(10, 20)
    println(result)

    println(Calculator.max)

    // Just like this is using companion obj, we didn't create Int obj
    println(Int.MAX_VALUE)
}

class Calculator() {
    companion object {
        // Class variables or class functions, they belong to class itself
        val max = 1000
        fun sum(a: Int, b: Int) = (a + b)
    }
    var abc = 10
}