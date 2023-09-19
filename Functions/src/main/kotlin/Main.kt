fun main(args: Array<String>) {
    sayHello(age = 20)
    sayHello("Kittu", 21)

    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData("Some data")
    } else {
        showMessage()
    }
}

// Generally function name is verb
fun sayHello(name: String = "Arunabha", age: Int) {
    // Parameters are immutable(val)
    // age = 30

    // another way
    var number = age
    number = 30

    println("Hello, $name")
    println("Your age is $age")
}

fun getData(data: String) {
    println("Your data is $data")
}

fun showMessage() {
    println("There is no internet connection :(")
}