fun main() {
    val isPlaying = true
    val score = 80

    // Logical and
    if (isPlaying && score == 100) {
        println("Next level opened!!")
    } else {
        println("Still at the same level :(")
    }

    // Logical or
    val num1 = 5
    val num2 = 4
    if (num1 > 0 || num2 > 0) {
        println("The condition is true!!")
    } else {
        println("The condition is false!!")
    }

    // if-then
    val text = if (num1 > 0 || num2 > 0) {
        println("The condition is true!!")
        "This is textAlpha"
    } else {
        println("The condition is false!!")
        "This is textSigma"
    }
    println("$text")


    var flag1 = true
    val text1 = if (flag1)
        "I am Arunabha"
    else
        "I am Kittu"
    println(text1)

    var flag2 = false
    val text2 = if (flag2) "I am Samrat" else 420
    println(text2)

    // We should always use curly braces.
}