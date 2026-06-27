package coroutines

import kotlinx.coroutines.*
import utils.ExecutionTime
import utils.ExecutionTimer
import java.util.concurrent.TimeUnit
import kotlin.time.DurationUnit
import kotlin.time.toDuration


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

