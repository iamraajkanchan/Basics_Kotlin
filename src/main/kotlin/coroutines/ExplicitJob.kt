package coroutines

import kotlinx.coroutines.*
import java.time.Duration
import kotlin.time.*

suspend fun printWorldExplicitJob() = coroutineScope {
    val firstJob = launch(Dispatchers.Default) {
        delay(2000L)
        println("First Job!")
    }

    val secondJob = launch(Dispatchers.Default) {
        delay(1000L)
        println("Second Job!")
    }
    secondJob.join()
    firstJob.join() // Waits for the second job to complete first.
    println("Jobs Complete")
}