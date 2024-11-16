package coroutines

import common.Utility
import kotlinx.coroutines.*

fun main() {
    val instance = AsyncCoroutineExamples()
    instance.simpleAsyncExampleWithRunBlocking()
    instance.simpleAsyncExampleWithCoroutineScope()
}

class AsyncCoroutineExamples {

    fun simpleAsyncExampleWithRunBlocking() {
        var asyncResult = 0
        runBlocking {
            withContext(Dispatchers.IO) {
                val asyncTask = async {
                    delay(1000)
                    3
                }
                asyncResult = asyncTask.await()
                println("AsyncCoroutineExample :: runBlocking :: withContext : $asyncResult :: on ${Thread.currentThread().name}")
                Utility.printLog(AsyncCoroutineExamples::class.java, Thread.currentThread().stackTrace[2], "asyncResult :: $asyncResult")
            }
        }
        println("AsyncCoroutineExample :: runBlocking :: asyncResult : $asyncResult")
        Utility.printLog(AsyncCoroutineExamples::class.java, Thread.currentThread().stackTrace[2], "asyncResult :: $asyncResult")
    }

    fun simpleAsyncExampleWithCoroutineScope() {
        var asyncResult = 0
        CoroutineScope(Dispatchers.IO).launch {
            withContext(Dispatchers.IO) {
                val asyncTask = async {
                    delay(1000)
                    3
                }
                asyncResult = asyncTask.await()
                println("AsyncCoroutineExample :: CoroutineScope :: withContext : $asyncResult :: on ${Thread.currentThread().name}")
                Utility.printLog(AsyncCoroutineExamples::class.java, Thread.currentThread().stackTrace[2], "asyncResult :: $asyncResult")
            }
        }
        println("AsyncCoroutineExample :: CoroutineScope :: asyncResult : $asyncResult")
        Utility.printLog(AsyncCoroutineExamples::class.java, Thread.currentThread().stackTrace[2], "asyncResult :: $asyncResult")
    }
}