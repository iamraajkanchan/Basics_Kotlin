package common

object Utility {
    private const val APPLICATION_TAG: String = "KotlinTutorials"
    fun <T> printLog(klass: Class<T>, element: StackTraceElement, message: String) {
        println("$APPLICATION_TAG :: ${klass.simpleName} :: Line Number :: ${element.lineNumber} :: ${element.methodName} :: $message")
    }
}