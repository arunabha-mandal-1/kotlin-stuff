fun main() {
    // Collection to String
    val numbersStrings = listOf("one", "two", "three", "four")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString)) // Appending listString

    println(numbersStrings.joinToString(separator = " | ", prefix = "Start: ", postfix = " !!"))

    val numbers = (1..100).toList()
    println(numbers)
    println(numbers.joinToString(limit = 20, truncated = "<...>"))


    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })

    // Study about lambda functions in Kotlin
}
