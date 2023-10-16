fun main() {

    // Retrieving single element from our collection
    val numbers = listOf<String>("one", "two", "three", "four", "five")

    println(numbers.elementAt(3)) // Element at position 3
    println(numbers.first()) // First element
    println(numbers.last()) // Last element

    println(numbers.first { it.length > 3 }) // First number of length > 3
    println(numbers.last { it.startsWith("f") }) // Last number starts with 'f'


}