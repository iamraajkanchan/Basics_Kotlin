package coroutines

import kotlinx.coroutines.*
import utils.ExecutionTime

class CoroutineScopeExamples {
    suspend fun asyncPrintWorld() = coroutineScope {
        val executionTime = ExecutionTime()
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
            println(executionTime.getExecutionTime())
        }
        println("${Thread.currentThread().name} :: Hello")
    }

    suspend fun syncPrintWorld() = coroutineScope {
        val executionTime = ExecutionTime()
        delay(2000)
        println("${Thread.currentThread().name} :: Delay for 2ms")
        delay(1000)
        println("${Thread.currentThread().name} :: Delay for 1ms")
        delay(4000)
        println("${Thread.currentThread().name} :: Delay for 4ms")
        println(executionTime.getExecutionTime())
        println("${Thread.currentThread().name} :: Hello")
    }
}