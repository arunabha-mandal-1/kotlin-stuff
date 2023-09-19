fun main(args: Array<String>) {
    val car1 = Car() // instantiation
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1.doors = 4

    println("Car 1 : ${car1.name} ${car1.model} ${car1.color} which has ${car1.doors} doors!!")
    car1.move()
    car1.stop()

    println()
    val car2 = Car() // Object
    car2.name = "Ford"
    car2.model = "Mustang"
    car2.color = "Blue"
    car2.doors = 2

    println("Car 2 : ${car2.name} ${car2.model} ${car2.color} which has ${car2.doors} doors!!")
    car2.move()
    car2.stop()
}

class Car {

    // Properties
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    // Methods
    fun move() {
        println("The car ${name} ${model} is moving")
    }

    fun stop() {
        println("The car ${name} ${model} has stopped")
    }
}