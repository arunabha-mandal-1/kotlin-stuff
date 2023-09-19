fun main() {
    val car = Cars("BMW", "Red", 1, 4)
    val plane = Planes("Boeing", "White and Blue", 4, 4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

// Parent class : consists common functions and properties
// 'open' to make it inheritable
open class Vehicle(val name: String, val color: String) {
    open fun move() {
        println("$name is moving...")
    }

    open fun stop() {
        println("$name has stopped!!")
    }
}

// Child classes
class Cars(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {}

class Planes(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color){
    override fun move() {
        flying()
        super.move()
    }
    fun flying(){
        println("The plane ${this.name} is flying >>")
    }
}

