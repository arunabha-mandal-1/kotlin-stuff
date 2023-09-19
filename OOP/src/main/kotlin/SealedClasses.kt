import java.lang.Exception

fun main() {
    val success = Result.Success("SUCCESS")
    val progress = Result.Progress("PROGRESS")

    getData(success)
    getData(progress)
}

//enum class Result {
//    SUCCESS,
//    ERROR(ex: Exception) // not possible
//}

fun getData(result: Result) {
    when (result) {
        is Result.Success -> result.showMsg()
        is Result.Error.RecoverableError -> result.showMsg()
        is Result.Error.NonRecoverAbleError -> result.showMsg()
        is Result.Progress -> result.showMsg()
    }
}

sealed class Result(val msg: String) {
    fun showMsg() {
        println("Result: $msg")
    }

    class Success(msg: String) : Result(msg)
    sealed class Error(msg: String) : Result(msg) {
        class RecoverableError(var exception: Exception, msg: String) : Error(msg)
        class NonRecoverAbleError(var exception: Exception, msg: String) : Error(msg)
    }

    class Progress(msg: String) : Result(msg)
}
