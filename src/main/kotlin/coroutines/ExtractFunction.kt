package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        doWorld()
    }
    println("main Block: ${Thread.currentThread().name}")
    println("Hello")
}

suspend fun doWorld() {
    // delay(2000)
    println("doWorld: ${Thread.currentThread().name}")
    println("World!")
}
