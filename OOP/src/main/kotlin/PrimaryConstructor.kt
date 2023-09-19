fun main(args: Array<String>) {
    val car1 = MyCar("  Tesla", "S Plaid", "Red", 4) // instantiation

    println("Car 1 : ${car1.name} ${car1.model} ${car1.color} which has ${car1.doors} doors!!")
    car1.move()
    car1.stop()

    println()

    val car2 = MyCar("Ford", "Mustang", "Blue", 2) // Object

    println("Car 2 : ${car2.name} ${car2.model} ${car2.color} which has ${car2.doors} doors!!")
    car2.move()
    car2.stop()
}

// Parameter -> Property
class MyCar(name: String, var model: String, var color: String, var doors: Int) {

    // If we want to do something with the parameter, we can declare the property here
    var name = name.trim()

    // Methods
    fun move() {
        println("The car ${name} ${model} is moving")
    }

    fun stop() {
        println("The car ${name} ${model} has stopped")
    }
}