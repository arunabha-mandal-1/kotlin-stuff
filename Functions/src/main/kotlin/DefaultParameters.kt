fun main() {
    sendMsg("Kit", "I'm good!!")
    sendMsg("Sam")
    sendMsg()
    sendMsg(msg = "I'm not good!!")
    sendMsg(
        msg = ":(",
        name = "Alexa"
    )
}

fun sendMsg(name: String = "User", msg: String = sendText()) {
    println("$name: $msg")
}

// Single body expression function
fun sendText(): String = "Some Text!!"