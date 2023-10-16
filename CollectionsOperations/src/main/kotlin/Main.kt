fun main() {

    // MAPPING

    println("\nMapping: \n")
    val numbers = setOf<Int>(1, 2, 3, 4, 5)

    // Lambda function inside
    println(numbers.map { it * 10 }) // Original one remains same
    println(numbers.map { if (it == 3) it * 100 else it * 10 })
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })

    val numbersMap = mapOf(
        "k1" to 1,
        "k2" to 2,
        "k3" to 3,
        "k4" to 4
    )

    // Either on key or on value
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })

    // ZIPPING

    println("\nZipping: \n")
    val colors = listOf<String>("red", "black", "blue", "white")
    val animals = listOf<String>("fox", "tiger", "wolf", "lion")

    // To create pairs of elements with the same position in both collections
    println(colors.zip(animals))
    println(colors zip animals)
    println(colors.zip(animals) { color, animal ->
        "The ${animal.replaceFirstChar { it.uppercase() }} is $color."
    })

    // Creating pairs
    val numberPairs = listOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4
    )
    println(numberPairs)
    println(numberPairs.unzip())

    // ASSOCIATION
    /*
    * Allows you to build maps from the collection elements and certain values associated with them.
    * */

    println("\nAssociation: \n")
    // Elements of these list are keys and values are going to be produced.
    val myNumbers = listOf("one", "two", "three", "four")
    println(myNumbers.associateWith { it.length }) // value = it.length

    // Here elements of the previous list are going to be values and keys will be generated.
    // If keys are repeated, the last one stays in the map. E.g.: two, three
    println(myNumbers.associateBy { it.first().uppercase() }) // key = it.first().uppercase()

    // Apply transformation on the key and the value
    println(myNumbers.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.length }))

    // FLATTEN

    println("\nFlatten: \n")
    val myNumbersSets = listOf<Set<Int>>(
        setOf(1, 2, 3),
        setOf(4, 5, 6),
        setOf(7, 8, 9)
    )

    // This syntax does only work with arrayOf
    // println(myNumbersSets[2][2]) // 9

    for (myNumberSet in myNumbersSets) {
        for (number in myNumberSet) {
            print("$number ")
        }
        println()
    }
    // 2D > 1D using flatten
    val numbersFlatten = myNumbersSets.flatten()
    println(numbersFlatten)
    println(numbersFlatten[3])
    for(number in numbersFlatten) {
        print("$number ")
    }
}