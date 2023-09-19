fun main(args: Array<String>) {
    var text: String? = null // Nullable variable type

//    text = "Arunabha"

    println(text)

    // safe
    println(text?.length) // null

    // not-null
//    println(text!!.length) // null pointer exception
    println("Arunabha Mandal") // if the above line throws exception, this line won't execute

//    if (text != null) {
//        println(text.length)
//    } else {
//        println("The variable is null.")
//    }

    /*
    * If text is null assign "Some text" to text2 otherwise assign value of text to text2
    */
    val text2 = text ?: "Some text"
    // longer way would be using if-else
    println(text2)
}