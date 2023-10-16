fun main() {
    val numbersStrings = listOf<String>("one", "two", "three", "four", "five", "six")
    println(numbersStrings.slice(1..3))
    println(numbersStrings.slice(0..4 step 2))
    println(numbersStrings.slice(setOf(3, 5, 0)))

    println("\nTake and drop : \n")
    println(numbersStrings.take(3)) // Taking first three numbers.
    println(numbersStrings.takeLast(3)) // Taking last three numbers.
    println(numbersStrings.drop(1)) // Dropping the first number.
    println(numbersStrings.dropLast(5)) // Dropping the last five numbers.

    println("\nTakeWhile and DropWhile: \n")
    println(numbersStrings.takeWhile { !it.startsWith("f") }) // Don't start with 'f' from the beginning
    println(numbersStrings.takeLastWhile { it != "three" }) // Start from last while it does not get "three"
    println(numbersStrings.dropWhile { it.length == 3 }) // Discards while it.length != 3 from first
    println(numbersStrings.dropLastWhile { it.contains("i") }) // Starts from last until it gets a string that does not contain 'i'

    println("\nChunk: \n")
    val numbers = (0..13).toList()
    println(numbers.chunked(4))
    println(numbers.chunked(4){it.sum()}) // Transformation on chunked elements

    // Windowed
    // Returns a list of snapshots of the window of the given size sliding along
    // this collection with the given step, where each snapshot is a list.
    println("\nWindowed: \n")
    val numbersStringTwo = numbersStrings
    println(numbersStringTwo.windowed(4))
    println(numbers.windowed(4))
    println(numbers.windowed(4){it.sum()})
}