package coroutines

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BasicCoroutines {
    suspend fun getValueAfterThreeSeconds() : ReceiveChannel<String> = coroutineScope {
        val channel = Channel<String>()
        launch {
            delay(3000)
            channel.send("Raj, you are late by 3 seconds")
            channel.close()
        }
        channel
    }
}