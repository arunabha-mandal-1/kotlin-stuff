fun main() {

    val numbers = mutableListOf<Int>(2, 5, 1, 40, 20, 100, 60)
    numbers.sorted().forEach { print("$it ") }
    println()

    val laptops = mutableListOf<Laptop>(
        Laptop("Dell", 2018, 2, 1000),
        Laptop("HP", 2023, 8, 800),
        Laptop("Apple", 2022, 3, 1500)
    )

    // Laptops are not comparable
    // laptops.sortedBy { it.year }.forEach{ println(it.brand) }

    // After making, it comparable
    laptops.sorted().forEach { println(it) }

    println("\nSorted by ram: \n")
    laptops.sortedWith(ComparatorRam()).forEach { println(it) }

    println("\nSorted by year: \n")
    laptops.sortedWith(ComparatorYear()).forEach { println(it) }

    println("\nUsing lambda: \n")
    laptops.sortedWith(compareBy { it.price }).forEach { println(it) }

    println("\nUsing sortBy: \n")
    laptops.sortedBy { it.price }.forEach { println(it) }

    println("\nUsing sortedWith: \n")
    laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price }).forEach { println(it) }
}

// Make it comparable
data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        // What makes Laptops comparable
        return if (this.price > other.price) {
            println("In if statement, swapping ${this.brand} with ${other.brand}.")
            1
        } else if (this.price < other.price) {
            println("In if statement, swapping ${this.brand} with ${other.brand}")
            -1
        } else {
            0
        }
    }
}

// Order by any parameter
class ComparatorRam : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.ram > laptop2.ram) 1
        else if (laptop1.ram < laptop2.ram) -1
        else 0
    }

}

// Order by year
class ComparatorYear : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.year > laptop2.year) 1
        else if (laptop1.year < laptop2.year) -1
        else 0
    }
}