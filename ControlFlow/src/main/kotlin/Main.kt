fun main(args: Array<String>) {
    val alarm = 41

    // Switch case like
//    when (alarm) {
//        12 -> println("The time is $alarm")
//        7 -> println("The time is $alarm")
//        14 -> println("The time is $alarm")
//        else -> println("The time is $alarm")
//    }

    when (alarm) {
        // 12, 7, 14 -> println("The time is $alarm!!")
        in 1..10 -> println("The number is in range 1...10")
        // !in 1..10 -> println("The number is not in range 1...10")
        in 40..80 -> {
            // Use curly braces for multiple statements
            println("The number is in range 40...80")
            println("Welcome")
        }

        else -> println("The time is $alarm")
    }

    val flag1 = 30
    val flagText1 = when (flag1) {
        in 1..10 -> {
            "1 to 10"
        }

        in 20..30 -> {
            "20 to 30"
        }

        30, 40 -> {
            "30 or 40"
        }

        else -> {
            "Not in any range!!"
        }
    }
    println(flagText1)

    // when using boolean
    val flag2 = 50
    val flagText2 = when {
        flag2 < 10 -> "flag2 is less than 10"
        flag2 < 20 -> "flag2 is less than 20"
        flag2 < 30 -> "flag3 is less than 30"
        else -> "Not in our range"
    }

    println(flagText2)
}