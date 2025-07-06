package coroutines

import kotlinx.coroutines.delay

class CoroutineBasics {
    suspend fun getValueAfterThreeSeconds() : String {
        delay(3000)
        return "Raj, you are late by 3 seconds"
    }
}