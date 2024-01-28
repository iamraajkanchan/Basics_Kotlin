package coroutines

import kotlin.time.*

object CalculateExecutionTime {
    private var START_TIME: Long = 0L
    private var END_TIME: Long = 0L
    fun setStartTime() {
        START_TIME = System.currentTimeMillis()
    }

    fun setEndTime() {
        END_TIME = System.currentTimeMillis()
    }

    fun getExecutionTime(): Duration {
        return (END_TIME - START_TIME).toDuration(DurationUnit.MICROSECONDS)
    }
}