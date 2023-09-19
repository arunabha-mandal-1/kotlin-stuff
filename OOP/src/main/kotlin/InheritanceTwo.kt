fun main() {
    val view = View()
    val button = Button("Login", "Center")
    val roundButton = RoundButton("Continue", "Center-Middle", 20)

    view.draw()
    println()

    button.draw()
    println()

    roundButton.draw()
//    println(roundButton.a)
}

// Parent class
open class View() {
//    val a: Int = 0
    open fun draw() {
        println("Drawing the view.")
    }
}

// Child class of View
open class Button(val text: String, val orientation: String): View() {
    override fun draw() {
        super.draw()

        // Code to create button
        println("Drawing the button!!")
    }
}

// Child class of Button
class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation) {
    override fun draw() {
        super.draw()

        // Code to draw round button
        println("Drawing round button!!")
    }
}