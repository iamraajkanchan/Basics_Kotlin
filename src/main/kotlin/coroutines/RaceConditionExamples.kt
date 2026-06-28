package coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

private var counter = 0
private var raceConditionMutex = Mutex()

fun main() {
    // getCounterResultFromRunBlocking()
    // getCounterResultFromCoroutineScope()
    // getCounterResultFromGlobalScope()
    getCounterResultFromRunBlockingWithMutex()
}

fun getCounterResultFromCoroutineScope() {
    val methodScope = CoroutineScope(Dispatchers.IO)
    methodScope.launch {
        counterRaceConditionProblem { counter++ }
        println("getCounterResultFromCoroutineScope :: Counter : $counter")
    }
}

/**
 * No Output
 * */

fun getCounterResultFromGlobalScope() {
    GlobalScope.launch {
        counterRaceConditionProblem { counter++ }
        println("getCounterResultFromGlobalScope :: Counter: $counter")
    }
}

/**
 * No Output
 * */

fun getCounterResultFromRunBlocking() {
    runBlocking {
        counterRaceConditionProblem { counter++ }
        println("getCounterResultFromRunBlocking :: Counter : $counter")
    }
}

suspend fun counterRaceConditionProblem(action: suspend () -> Unit) {
    val n = 100
    val k = 1000
    coroutineScope {
        repeat(n) {
            launch(Dispatchers.IO) {
                repeat(k) {
                    action()
                }
            }
        }
    }
}

/**
 * Output: getCounterResultFromRunBlocking :: Counter : 87114
 * */

fun getCounterResultFromRunBlockingWithMutex() {
    runBlocking {
        counterRaceConditionProblem {
            raceConditionMutex.withLock {
                counter++
            }
        }
        println("getCounterResultFromRunBlockingWithMutex :: counter : $counter")
    }
}