package coroutines

import kotlinx.coroutines.*

class CoroutineScopeExamples {
    suspend fun asyncPrintWorld() = coroutineScope {
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
            println("${CalculateExecutionTime.getExecutionTime().inWholeMilliseconds} ms")
        }
        println("${Thread.currentThread().name} :: Hello")
    }

    suspend fun syncPrintWorld() = coroutineScope {
        CalculateExecutionTime.setStartTime()
        delay(2000)
        println("${Thread.currentThread().name} :: Delay for 2ms")
        delay(1000)
        println("${Thread.currentThread().name} :: Delay for 1ms")
        delay(4000)
        println("${Thread.currentThread().name} :: Delay for 4ms")
        CalculateExecutionTime.setEndTime()
        println("${CalculateExecutionTime.getExecutionTime().inWholeMilliseconds} ms")
        println("${Thread.currentThread().name} :: Hello")
    }
}