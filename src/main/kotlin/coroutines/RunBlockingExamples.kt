package coroutines

import kotlinx.coroutines.*

fun main() {
    val runBlockingInstance = RunBlockingExamples()
    runBlockingInstance.testRunBlockingSynchronously()
    runBlockingInstance.testRunBlockingAsynchronously()
}

class RunBlockingExamples {

    fun testRunBlockingSynchronously() {
        println("RunBlockingExamples :: Synchronous Execution")
        runBlocking {
            launch(Dispatchers.Default) {
                printDoWorld("Synchronous Execution")
            }
        }
        println("Synchronous Execution :: main Block: ${Thread.currentThread().name}")
        println("Synchronous Execution :: Hello")
    }

    fun testRunBlockingAsynchronously() {
        println("RunBlocking :: Asynchronous Execution")
        runBlocking {
            launch(Dispatchers.Default) {
                printDoWorld("Asynchronous Execution")
            }
            println("Asynchronous Execution :: main Block: ${Thread.currentThread().name}")
            println("Asynchronous Execution :: Hello")
        }
    }

    private suspend fun printDoWorld(methodName: String) {
        println("$methodName :: doWorld: ${Thread.currentThread().name}")
        delay(2000)
        println("$methodName :: World!")
    }
}
