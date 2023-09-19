fun main(args: Array<String>) {
    // List, Set, Map -> mutable and immutable

    // Immutable list
    val names = listOf<String>("Arunabha", "Samrat", "Kushal")
    println(names[0])

    // Mutable list > List will grow and shrink
    val surnames = mutableListOf<String>("Mandal", "Biswas", "Panda")
    surnames.add(0, "Das")
    surnames.add("Sarkar")
    surnames.remove("Panda")
    surnames.removeAt(0)
    println(surnames)

    // Set : Every element's unique
    // Immutable set
    val companies = setOf<String>("Google", "IBM", "Google", "Amazon")
    println(companies)

    // Mutable set
    val friends = mutableSetOf<String>("Alex", "Jack", "Sparrow", "Jack")
    println(friends)
    friends.add("Arunabha")
    friends.add("Alex")
    println(friends)

    val user1 = User("Name 1")
    val user2 = User("Name 2")
    val user3 = User("Name 3")
    val user4 = User("Name 4")
    val user5 = User("Name 5")
    val user6 = User("Name 6")
    val user7 = User("Arunabha")
    val user8 = User("Arunabha")
    // Here user7 and user8 are different

    val users = mutableSetOf<User>(user1, user2, user3, user4, user5, user6, user6, user7, user8)
    users.forEach{ print(it.name + ", ") }
    println()

    val employee1 = Employee("Employee 1")
    val employee2 = Employee("Employee 2")
    val employee3 = Employee("Employee 3")
    val employee4 = Employee("Employee 4")
    val employee5 = Employee("Employee 5")
    val employee6 = Employee("Employee 6")
    val employee7 = Employee("Kittu")
    val employee8 = Employee("Kittu")
    // Here emp7 and emp8 are same due to data class

    val employees = mutableSetOf<Employee>(employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8)
    employees.forEach{ print(it.name + ", ") }
    println()

    println(employee7 == employee8)

    // Maps : Want to store key value pairs, we cannot have duplicate key

    // Immutable map
    val students = mapOf<Int, String>(1 to "Arunabha", 2 to "Kittu", 3 to "Samrat")
    println(students)
    println(students[1])

    // Mutable list
    val teachers = mutableMapOf<Int, String>(1 to "Jayanta", 2 to "Sumit", 3 to "Indra")
    teachers.forEach { t, u ->
        println("$t : $u")
    }
    teachers[5] = "Basudev"
    teachers.remove(2)
    println(teachers)
}

class User(val name: String)
data class Employee(val name: String)