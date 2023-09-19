fun main(args: Array<String>) {

    // Type inference also works here
    val names: Array<String> = arrayOf("Kittu", "Tutul", "Samrat", "Kushal")
    val mixedElements = arrayOf(12, 34, 1, 23, 4, "Arunabha", 'b') // Mixing types

    names[0] = "Alex" // Arrays are mutable in kotlin
    println("First element in names : ${names[0]}")
    println("Size of names array is ${names.size}")

    println("Names are: ")
    for (name in names) {
        println(name)
    }

    println("Elements are: ")
    for (element in mixedElements) {
        if (element is String) println(element)
    }
}