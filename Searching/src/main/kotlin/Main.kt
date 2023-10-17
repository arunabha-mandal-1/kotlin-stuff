fun main(args: Array<String>) {

    // Using linear search
    var searchElement1: Int = 10
    val numberList1 = mutableListOf<Int>(12, 4, 5, 23, 10, 56, 6, 7, 8, 0)
//    println(linearSearchCustom(searchElement1, numberList1))

    // Using binary search
    val searchElement2: Int = 3
    val numberList2 = mutableListOf<Int>(1, 2, 3, 4, 5)
//    println(binarySearchCustom(searchElement2, numberList2))

    // In-built
    println(numberList2.binarySearch(3)) // Returns index of that element
}


private fun linearSearchCustom(searchElement: Int, numbers: MutableList<Int>): Int {
    for (number in numbers) {
        if (number == searchElement) {
            return 1
        }
    }
    return -1
}

private fun binarySearchCustom(searchElement: Int, numbers: MutableList<Int>): Int {
    var low: Int = 0
    var high: Int = numbers.size - 1

    while (low <= high) {
        var mid: Int = low + (high - low) / 2
        val cmp = numbers[mid].compareTo(searchElement)

        if(cmp < 0){
            low = mid + 1
        }else if(cmp > 0){
            high = mid - 1
        }else {
            return 1
        }
    }
    return -1
}