package coroutines

import kotlinx.coroutines.*
import java.time.Duration
import kotlin.time.*

@OptIn(ExperimentalTime::class)
suspend fun main() = withContext(Dispatchers.Default) {
    val res: TimedValue<Unit> = measureTimedValue { printWorldExplicitJob() }
    // println("It took ${res.duration.toComponents { seconds, _ -> seconds }}s to calculate ${res.value}")
    println("It took ${res.duration} to calculate ${res.value}")
}

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