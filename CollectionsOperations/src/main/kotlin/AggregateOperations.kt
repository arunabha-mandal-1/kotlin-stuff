fun main() {

    val numbers = listOf<Int>(6, 5, 4, 3, 1, 6, 0)

    println("The sum is ${numbers.sum()}")
    println("The count is ${numbers.count()}")
    println("The average is ${numbers.average()}")
    println("The max value is ${numbers.maxOrNull()}")
    println("The min value is ${numbers.minOrNull()}")
    println("The sum is ${numbers.sumOf { it * 2 }}")
}