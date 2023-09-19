fun main(args: Array<String>) {
    var x = 5
    val y = 3.0

    // operands: x, y; operator: +
    var result = x + y
    println("result: $result")

    // In programming, an expression is a value, or anything that executes and ends up being a value.
    // In placeholder, we can only place an expression.
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")


    var p = 5
    var q = 3

    var anotherResult = p + q

    anotherResult += 2
    println("anotherResult: $anotherResult")

    anotherResult -= 2
    println("anotherResult: $anotherResult")

    anotherResult *= 2
    println("anotherResult: $anotherResult")

    anotherResult /= 2
    println("anotherResult: $anotherResult")

    anotherResult %= 2
    println("anotherResult: $anotherResult")

    // Precedence : explore this
    println("3 + 3 * 4 = ${3 + 3 * 4}")
    println("3 + (3 * 4) = ${3 + (3 * 4)}")

    var r = 0
    println("r = ${r++}") // post-increment
    println("r = ${++r}") // pre-increment

    println("r = ${r--}") // post-decrement
    println("r = ${--r}") // pre-decrement

    // Types of comments:
    // end-of-line comment
    /*
    * block comment
    */
}