import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val app = App()
    app.print1()
    app.print2()

    val manager = Manager()
    with(manager) {
        fname = "Arunabha"
        lname = "Mandal"
    }
    with(manager) {
        println(fname)
        println(lname)
    }
}

/*
* Delegation: Delegation controls the allocation of power/authority from an instance to another for any object.
*             It is used in scenarios where inheritance starts to break.
*             e.g.: When we cannot inherit from two classes that's where delegation kicks in.
* */

// Won't work, we cannot inherit from multiple classes.
//class App: FirstDelegate(), SecondDelegate() {}

// Delegation with methods
class App: A by FirstDelegate(), B by SecondDelegate() {
    override fun print1() {
        println("Print 1")
    }

    override fun print2() {
        println("Print 2")
    }
}

interface A {
    fun print1()
}

interface B {
    fun print2()
}

open class FirstDelegate: A {
    override fun print1() {
        println("Print 1 in Class A")
    }
}

open class SecondDelegate: B {
    override fun print2() {
        println("Print 2 in Class B")
    }
}

// Delegation with properties
// Didn't get it...

class Manager{
    var fname by FormatDelegate()
    var lname by FormatDelegate()
}

class FormatDelegate : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>,
    ): String {
        return formattedString
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    ){
        formattedString = value.lowercase()
    }
}