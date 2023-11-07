fun main() {
//    val vehicle = MyVehicle()
}

// You can inherit from a single class, but you can do the same from multiple interfaces.
// You cannot create an instance using abstract class. It can only be inherited.
// You can only declare functions in abstract classes, but you cannot define them.
// They are similar to interfaces but the only difference is that abstract classes can have properties initialized while interfaces can not have.
abstract class MyVehicle {
//    val text = "I love cars!!"

    abstract fun move()
    abstract fun stop()
}

class MyCars(val name: String, var color: String, val engines: Int, val doors: Int): MyVehicle() {
    override fun move() {
        println("${this.name} is moving.")
    }

    override fun stop() {
        println("${this.name} has stopped!!")
    }

}

/*
* Interfaces are used in many places. E.g.: Event handling
* When an api is going to do the implement the function automatically.
* */