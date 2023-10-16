fun main() {

    // Grouping collection elements
    // Takes lambda, returns map

    val numbers = listOf<String>("One", "Two", "Three", "Four", "Five")
    println(numbers.groupBy { it.first().lowercase() })
    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.uppercase() }))

    // Play with code
}