fun main() {
    val max = getMax(12, 13)
    println("Max = $max")
}

private fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max // stops execution here
}

fun getMin(a: Int, b: Int) = if (a < b) a else b