package utils

import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

class ExecutionTimer {
    // markNow() safely captures the current monotonic time
    @OptIn(ExperimentalTime::class)
    private val startMark = TimeSource.Monotonic.markNow()

    @OptIn(ExperimentalTime::class)
    fun getExecutionTime(): String {
        // elapsedNow() returns a Duration, which automatically formats itself nicely
        return startMark.elapsedNow().toString()
    }
}