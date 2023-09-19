fun main() {

    // Error
    // val instance1 = Database()

    // Always returns same instance
    val instance2 = Database.getInstance()
    val instance3 = Database.getInstance()

    println(instance2)
    println(instance3)


    // Same obj, println invokes once
    println(DB)
    println(DB)
    println(DB)
}

/*
* Singleton: It's a design pattern in kotlin with which you want to have only one
*            instance of a particular object. And you want to have that instance available
*            globally throughout the program. E.g.: A database, we use this throughout the program.
* */

// Old way
class Database private constructor() {

    // So that we cannot create instance of it.
    companion object {
        private var instance: Database? = null
        fun getInstance(): Database? {
            if(instance == null) {
                // If not initialized
                instance = Database()
            }
            return instance
        }
    }
}

// New way using 'object' keyword
// Always returns same instance
object DB {
    init {
        println("Database Created!!")
    }
}