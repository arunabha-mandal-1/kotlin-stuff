fun main() {

    /* In Kotlin there are two types of equality:
    Structural equality (== - a check for equals())
    Referential equality (=== - two references point to the same object) */

    // Structural equality
    val name1 = "Arunabha"
    val name2 = "Arunabha"
//    println(name1 == name2)

    // Referential equality
    val surname1 = "Mandal"
    val surname2 = "Mandal"
//    println(surname1 === surname2)

    val user1 = MyUser("Arunabha", "Mandal", 20)
    val user2 = MyUser("Arunabha", "Mandal", 20)

    // Structural equality
//    println(user1==user2)
    println(user1.equals(user2))
    // Above two are same

    // Referential equality
    println(user1 === user2) // Referring different object

    println(user1)

    // Using data class
    val client1 = Client("Samrat", "Mandal", 20)
    val client2 = Client("Samrat", "Mandal", 20)

    println("client1 == client2 ${client1 == client2}") // same inf
    println("client1 === client2 ${client1 === client2}") // diff obj ref
    println(client1)
    println(client2)
}

// wtf is Any class?
// kotlin type system hierarchy?

class MyUser(var fname: String, var lname: String, var age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is MyUser) {
            return ((this.fname == other.fname)
                    && (this.lname == other.lname)
                    && (this.age == other.age))
        }
        return false
    }

    override fun hashCode(): Int {
        // For this simple class, it's enough.
        // If you override equals, you have to override hashcode.
        // If two objects are equal, they must have same hashcode.
        return 0
    }

    override fun toString(): String {
        return "MyUser(fname=${this.fname}, lname=${this.lname}, age=${this.age})"
    }
}

// A function doesn't need any object and is independent, while the method is a function, which is linked with any object.

// All the above written codes are auto-generated in the data class
// equals, hashCode, toString are automatically overridden in data classes
data class Client(var fname: String, var lname: String, var age: Int){
    // If we don't want some property to be included in the overridden functions, we can remove it from primary constructor
    // and move it inside the data class
    var addr = "123 abc"
}
