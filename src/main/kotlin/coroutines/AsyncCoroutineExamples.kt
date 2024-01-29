package coroutines

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
            }
        }
        println("AsyncCoroutineExample :: runBlocking :: asyncResult : $asyncResult")
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
            }
        }
        println("AsyncCoroutineExample :: CoroutineScope :: asyncResult : $asyncResult")
    }
}