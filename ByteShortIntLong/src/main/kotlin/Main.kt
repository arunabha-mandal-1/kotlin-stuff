fun main() {
    // Integer 32 bits
    // type inference : it can detect type of the variable by the value assigned to it
    var number: Int = 20
    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE

    println("Int max value is $maxIntegerValue")
    println("Int min value is $minIntegerValue")

    // max limit crossed
    //number = 2147483648
    number = 2147483647

    // Byte 8 bits
    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE

    println("Byte max value is $myMaxByteValue")
    println("Byte min value is $myMinByteValue")

    // Short 16 bits
    val myMaxShortValue: Short = Short.MAX_VALUE
    val myMinShortValue: Short = Short.MIN_VALUE

    println("Short max value is $myMaxShortValue")
    println("Short min value is $myMinShortValue")

    // Long 64 bits
    val myMaxLongValue: Long = Long.MAX_VALUE
    val myMinLongValue: Long = Long.MIN_VALUE

    println("Long max value is $myMaxLongValue")
    println("Long min value is $myMinLongValue")

    val myNumber = 28 // default type integer though it's less than 127
    val myNumber1 = 45L // long
    val myNumber2 = 4587521245454241351
}