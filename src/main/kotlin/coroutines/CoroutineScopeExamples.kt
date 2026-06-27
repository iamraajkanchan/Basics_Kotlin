package coroutines

import kotlinx.coroutines.*
import utils.ExecutionTime

class CoroutineScopeExamples {
    suspend fun asyncPrintWorld() {
        val executionTime = ExecutionTime()
        coroutineScope {
            launch(Dispatchers.Default) {
                delay(2000)
                println("${Thread.currentThread().name} :: Delay of 2 ms")
            }
            launch(Dispatchers.Default) {
                delay(1000)
                println("${Thread.currentThread().name} :: Delay of 1 ms")
            }
            launch(Dispatchers.Default) {
                delay(4000)
                println("${Thread.currentThread().name} :: Delay of 4 ms")
            }
            println("${Thread.currentThread().name} :: Hello from asyncPrintWorld")
        }
        println(executionTime.getExecutionTime())
    }

    /**
     * Function call
     * fun main() {
     *     runBlocking { simulateCoroutineScopeExamples() } // This line is working
     * }
     * suspend fun simulateCoroutineScopeExamples() {
     *     val coroutineScopeInstance = CoroutineScopeExamples()
     *     coroutineScopeInstance.asyncPrintWorld()
     * }
     * Output
     * main :: Hello from asyncPrintWorld
     * DefaultDispatcher-worker-2 :: Delay of 1 ms
     * DefaultDispatcher-worker-2 :: Delay of 2 ms
     * DefaultDispatcher-worker-2 :: Delay of 4 ms
     * Execution Time : 4 ms
     * */

    suspend fun syncPrintWorld() = coroutineScope {
        val executionTime = ExecutionTime()
        delay(2000)
        println("${Thread.currentThread().name} :: Delay of 2 ms")
        delay(1000)
        println("${Thread.currentThread().name} :: Delay of 1 ms")
        delay(4000)
        println("${Thread.currentThread().name} :: Delay of 4 ms")
        println("${Thread.currentThread().name} :: Hello from syncPrintWorld")
        println(executionTime.getExecutionTime())
    }

    /**
     * Function Call
     * fun main() {
     *     runBlocking { simulateCoroutineScopeExamples() } // This line is working
     * }
     * suspend fun simulateCoroutineScopeExamples() {
     *     val coroutineScopeInstance = CoroutineScopeExamples()
     *     coroutineScopeInstance.syncPrintWorld()
     * }
     * Output
     * main :: Delay of 2 ms
     * main :: Delay of 1 ms
     * main :: Delay of 4 ms
     * main :: Hello from syncPrintWorld
     * Execution Time : 7 ms
     * */
}