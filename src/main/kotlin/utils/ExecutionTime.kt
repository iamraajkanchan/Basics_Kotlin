package utils

import kotlin.time.DurationUnit
import kotlin.time.toDuration

class ExecutionTime {
    private val startTime: Long = System.currentTimeMillis()
    fun getExecutionTime(): String {
        return "Execution Time : ${(System.currentTimeMillis() - startTime).toDuration(DurationUnit.MICROSECONDS).inWholeMilliseconds} ms"
    }
}