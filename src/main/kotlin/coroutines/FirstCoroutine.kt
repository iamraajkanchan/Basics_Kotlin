package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
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