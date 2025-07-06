package coroutines

import kotlinx.coroutines.*

suspend fun main() = withContext(Dispatchers.Default) {
    println("runBlocking")
    launch {
        delay(2000)
        println("launch: ${this.coroutineContext}")
        println("launch: ${Thread.currentThread().name}")
        println("World!!!")
    }
    println("main block: ${Thread.currentThread().name}")
    println("Hello")
}