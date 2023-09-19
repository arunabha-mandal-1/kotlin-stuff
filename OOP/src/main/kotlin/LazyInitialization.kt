fun main() {
    val customer1 = Customer("Arunabha", "Mandal", 20)
    val customer2 = Customer("Kittu", "Mandal", 20)

    // Init block won't be invoked, obj is not initialized
    // When we use this obj, it's going to be initialized
    // Creating objs are expensive
    val customer3 by lazy {
        Customer("Samrat", "Mandal", 25)
    }
    println(customer3.fname)
}

class Customer(var fname: String, var lname: String, var age: Int) {
    init{
        println("User ${this.fname} was created!!")
    }
}