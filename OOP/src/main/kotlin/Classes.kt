import java.awt.Stroke

fun main() {
//    val user = User("Arunabha", "Mandal", 20)
//    val friend = User("Kittu", "Mandal", 20)

//    val employee1 = Employee("  Samrat  ")
//    val employee2 = Employee("Babai", "Mandal")

    // Named agrs with PC
//    val worker1 = Worker(age = 56, firstName = "Sam", lastName = "Dob")
    // Default args cannot be used in SC
//    val worker2 = Worker("Kit")

//    val student1 = Student("Arunabha", "Mandal", 20)
//    println(student1.fname)
//    student1.fname = "Kittu"

    val teacher1 = Teacher("Abc", "Def", 45)
//    teacher1.favMovie = "Ragini MMS 2"
    println(teacher1.favMovie)
}

// 1. Initializer block
class User(name: String, var lastName: String, var age: Int) {
    /*
    * If we want more than one line of code to be executed at the time of object is created,
    * we have to use initializer block
    * */
    // Only accept name starts with 'A'
    var name: String

    init {
        if (name.lowercase().startsWith('a')) {
            // only 'name' refers the name parameter
            // name = Name provided e.g.: Kittu
            this.name = name
        } else {
            this.name = "User"
            println("The name ${name} does not start with the letter 'a' or 'A'!")
        }
    }

    // In case user only provides name but doesn't provide other two
}

// 2. Secondary constructor
class Employee(var fname: String, var lname: String, var age: Int) {
    // If employee provides all the properties, primary constructor is called.
    // If employee does not provide any of these three properties, secondary constructor is called.
    // Secondary constructor cannot declare properties, they can only declare parameters.
    // SC needs to call PC
    constructor(fname: String) : this(fname.trim(), "Last_Name", 0) {
        println("${this.fname} user craeted using secondary constructor 1!")

        // To demonstrate the difference
        println(fname)
        println(this.fname)
    }

    constructor(fname: String, lname: String) : this(fname.trim(), lname.trim(), 0) {
        println("${this.fname} user craeted using secondary constructor 2!")
    }

    // If we didn't have secondary constructor, we had to create a class with different no of properties
}

// 3. Constructor parameters default values
// This is more concise than SC
class Worker(var firstName: String, var lastName: String = "Last_Name", var age: Int = 0) {
    // If we want more than one line of code to be eecuted at the time of obj creation, we can use SC in this context.
    init {
        println("The worker ${this.firstName} ${this.lastName} created!!")
    }
}

// 4. Getters and setters are auto generated, it is based on encapsulation.
// Getter > to get a value, setter > to set a value
// They are implicit in kotlin classes
class Student(fname: String, var lname: String, var age: Int) {

    // We've to set getter and setter immediately after we declare a property
    var fname = fname
        // 'field' can only be used inside getter and setter
        get() {
            return "Firstname: $field"
        }
        set(value) {
            println("$value was assigned to fname property!!")
            field = value

            // If we do this, it will call setter gagin and again
            // fname = value
        }

    // setter is similar to this function
//    fun setFirstName(newValue: String) {
//        this.fname = newValue
//    }

    // getter is similar to this function
//    fun getFirstName(): String {
//        return this.fname
//    }
}

// 5. lateinit keyword
class Teacher(var fname: String, var lname: String, var age: Int) {

    // initialize it later
    // to avoid null pointer exception which can cause app crashes
    // uninitialized lateinit also throws runtime error
    // lateinit keyword does not work with primitive datatype
    // only works with classes
    lateinit var favMovie: String
}


