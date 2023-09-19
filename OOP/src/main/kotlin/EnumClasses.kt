import java.awt.DisplayMode

fun main() {
//    println(Directions.NORTH)
//    println(Directions.SOUTH)
//    println(Directions.EAST)
//    println(Directions.WEST)

//    for (direction in Directions.values()) {
//        println(direction)
//    }

//    println("${Directions.NORTH.name}, ${Directions.NORTH.direction}, ${Directions.NORTH.distance}")

//    Directions.WEST.printData()

//    val direction = Directions.EAST

    // Value can come from a db or anywhere
    val direction = Directions.valueOf("east".uppercase())
    when(direction) {
        Directions.EAST -> println("the dircetion is east.")
        Directions.WEST -> println("the dircetion is west.")
        Directions.NORTH -> println("the dircetion is north.")
        Directions.SOUTH -> println("the dircetion is south.")
    }

    Directions.EAST.distance = 85
    println(Directions.EAST.distance)

}

// Enum : When we want to create fix set of values.
enum class Directions(var direction: String, var distance: Int) {
    // Instances of this class
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 30),
    WEST("west", 40);

    fun printData() {
        println("Direction: ${direction} and Distance: ${distance}")
    }
}