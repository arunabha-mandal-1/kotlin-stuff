fun main() {
    val isActive = true
    if (!isActive) {
        println("The user is not active!!")
    } else {
        println("The user is active!!")
    }

    val myNumber = 151
    if (myNumber >= 150) {
        println("Greater than or equal to 150.")
    } else if (myNumber > 90) {
        println("Greater than 90.")
    } else {
        println("All conditions failed!!")
    }

    val myAnotherNumber = 100
    if (myAnotherNumber < 150) {
        println("Less than 150.")
    } else if (myAnotherNumber <= 150) {
        println("Less than or equal to 150.")
    } else if (myAnotherNumber != 100) {
        println("Not equal to 100.")
    } else {
        println("All conditions failed!!")
    }
}