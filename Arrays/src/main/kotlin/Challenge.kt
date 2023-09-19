fun main() {
    /*
    * Create a function which is going to take an array
    * of integers then you need to figure out a way to
    * determine which number is the biggest number in that
    * array then you need to return that number to that function.
    * Do the same thing to find the minimum number in that array.
    *
    * Create a third one which combines the first two ones, and it returns maximum number
    * if you want else returns the minimum.
    * */

    val numbers: Array<Int> = arrayOf(12, 34, 1, 3, 56, 67)
    println("Max in numbers array : ${maxInArray(numbers)}")
    println("Min in numbers array : ${minInArray(numbers)}")

    println("---------------------------------------------")

    println("Max in numbers array : ${minMaxInArray(numbers, true)}")
    println("Min in numbers array : ${minMaxInArray(numbers, false)}")
}

fun maxInArray(numbers: Array<Int>): Int {
    return if(numbers.isNotEmpty()){
        var max = numbers[0]
        for(number in numbers) {
            if(number > max) {
                max = number
            }
        }
        max
    }else {
        Int.MAX_VALUE
    }
}

fun minInArray(numbers: Array<Int>): Int {
    return if(numbers.isNotEmpty()){
        var min = numbers[0]
        for(number in numbers) {
            if(number < min) {
                min = number
            }
        }
        min
    }else {
        Int.MIN_VALUE
    }
}

fun minMaxInArray(numbers: Array<Int>, searchMax: Boolean): Int {
    if(searchMax) {
        return maxInArray(numbers)
    }
    return minInArray(numbers)
}