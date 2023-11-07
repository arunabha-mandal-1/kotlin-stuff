import javax.lang.model.element.Name

fun main() {
    val tesla = Tesla("S", "Black")
    tesla.startEngine()
}

/*
* Interface: Interfaces are used when you want to have a commonly used behaviour shared
*            among different classes, but you don't want to provide the actual code that
*            goes inside the class which is going to implement that interface, but you just
*            want to define the name and parameter of the function. The actual code that goes
*            inside the functions that you define inside are particular to each object that
*            implements that specific interface.
* */

//You can declare properties in interfaces.
// A property declared in an interface can either be abstract or provide implementations for accessors.
// Properties declared in interfaces can't have backing fields, and therefore accessors declared in interfaces can't reference them

// Interfaces cannot have constructor
interface Engine {
    fun startEngine()
}

// Anonymous obj??

// They start the engines in different way, overridden is a must.
class AllCar(val name: String, val color: String) : Engine {
    // You must override the function(s)
    override fun startEngine() {
        println("The car ${this.name} is starting the engine!")
    }
}

class Truck(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("The truck ${this.name} is starting the engine!")
    }
}

class Plane(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("The plane ${this.name} is starting the engine!")
    }
}

class Tesla(val model: String, var color: String) : Engine{
    override fun startEngine() {
        println("The Tesla ${this.model} is starting the engine!")
    }
}