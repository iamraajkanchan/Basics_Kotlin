package coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    printWorld()
}

suspend fun printWorld() = coroutineScope {
    launch {
        delay(3000)
        println("World!")
    }
    println("Hello")
}