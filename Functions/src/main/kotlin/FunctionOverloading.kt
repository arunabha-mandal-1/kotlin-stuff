fun main() {
    val max = getMax(11.0, 10.2)
    println(max)
}

// Function overloading: 1. diff datatype 2. diff #parameters of same datatype
private fun getMax(a: Int, b: Int) = if (a > b) a else b
private fun getMax(a: Int, b: Int, c: Int) = if (a>b) (if (a>c) a else c ) else (if (b>c) b else c)
private fun getMax(a: Double, b: Double) = if (a > b) a else b