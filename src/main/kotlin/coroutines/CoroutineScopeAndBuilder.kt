package coroutines

import kotlinx.coroutines.*
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
        println("Hello")
    }
}

