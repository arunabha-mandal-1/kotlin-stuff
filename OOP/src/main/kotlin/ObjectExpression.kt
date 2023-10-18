fun main() {
    // Method 1
    val clickListener = ClickListener() // Created for login can't be used for any other cases
    val loginBtn = MyButton("Login", 101, clickListener)
    val signUpBtn = MyButton("Sign up", 102, clickListener) // Incorrect, create another clickListener object for this

    // Method 2 : Object expression or anonymous class
    val download = MyButton("Download", 202, object : OnClickListener {
        override fun onClick() {
            println("Download started!!")
        }
    })

    val upload = MyButton("Upload", 203, object : OnClickListener {
        override fun onClick() {
            println("Upload started!!")
        }
    })
}

class MyButton(val text: String, val id: Int, onClickListener: OnClickListener)
interface OnClickListener {
    fun onClick()
}


// Used for method 1
class ClickListener(): OnClickListener {
    override fun onClick() {
        println("Logged in!!")
    }
}