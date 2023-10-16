fun main() {

    // Collection processing
    // Filtering -> takes collection elements and returns boolean value and provides output according to that.

    val numbers = listOf("one", "two", "three", "four")
    val longerThanThree = numbers.filter { it.length > 3 }
    println(longerThanThree)

    val numbersMap = mapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3,
        "key4" to 4,
        "key101" to 101
    )

    // keys end with '1' and value > 100
    val filterMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 } // Filtering both keys and values
    println(filterMap)

    // Using element-position
    val filteredIndex =
        numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) } // For which the predicate in true
    val filteredNot = numbers.filterNot { it.length <= 3 } // For which the predicate is false
    println(filteredIndex)
    println(filteredNot)

    // Filtering given type
    val mixedList = listOf(1, 2, 3, 'a', 'b', 'c', "Sam", false, true)
    println(mixedList.filterIsInstance<Int>()) // Filters integer
    println(mixedList.filterIsInstance<Char>()) // Filters characters

    // PARTITION
    println("\nPartition: \n")
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)

    println("\nTest predicates: \n")
    println(numbers.any { it.endsWith("e") }) // Whether any of the elements ends with 'e' = true
    println(numbers.none { it.endsWith("w") }) // Whether none of the elements ends with 'w' = true
    println(numbers.all { it.length > 1 }) // Whether length of all the elements is greater that 1 = true

}
