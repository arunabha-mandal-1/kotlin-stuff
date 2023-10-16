fun main() {
    // Collection + collection or collection + element
    val numbers = mutableListOf<String>("One", "Two", "Three", "Four", "Five")

    // One previously discussed way
    numbers.add("Six")

    // Using plus operator
    val plusList = numbers + "Seven"

    // Printing both the lists
    println(numbers)
    println(plusList)

    val minusListOne = numbers - "Two"
    val minusListTwo = numbers - mutableListOf<String>("Two", "Four")

    println(minusListOne)
    println(minusListTwo)
}