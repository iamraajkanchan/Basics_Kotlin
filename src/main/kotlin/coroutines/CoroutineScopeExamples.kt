package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val coroutineScopeInstance = CoroutineScopeExamples()
    coroutineScopeInstance.printWorld()
}

class CoroutineScopeExamples {
    suspend fun printWorld() = coroutineScope {
        CalculateExecutionTime.setStartTime()
        launch(Dispatchers.Default) {
            delay(2000)
            println("${Thread.currentThread().name} :: Delay for 2ms")
        }
        launch(Dispatchers.Default) {
            delay(1000)
            println("${Thread.currentThread().name} :: Delay for 1ms")
        }
        launch(Dispatchers.Default) {
            delay(4000)
            println("${Thread.currentThread().name} :: Delay for 4ms")
            CalculateExecutionTime.setEndTime()
            println("${CalculateExecutionTime.getExecutionTime().inWholeMilliseconds}ms")
        }
        println("${Thread.currentThread().name} :: Hello")
    }
}