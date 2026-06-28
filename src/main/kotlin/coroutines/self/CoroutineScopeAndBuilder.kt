package coroutines.self

import kotlinx.coroutines.*
import utils.ExecutionTimer


class CoroutineScopeAndBuilder {
    suspend fun printWorldCoroutineScopeAndBuilder() = coroutineScope {
        launch {
            delay(2000L)
            println("World 2!")
        }
        launch {
            delay(1000L)
            println("World 1!")
        }
        println("Time Execution : ${ExecutionTimer().getExecutionTime()}")
        println("Hello")
    }
}

