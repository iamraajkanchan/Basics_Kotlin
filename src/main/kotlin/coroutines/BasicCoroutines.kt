package coroutines

import kotlinx.coroutines.delay

class BasicCoroutines {
    suspend fun getValueAfterThreeSeconds() : String {
        delay(3000)
        return "Raj, you are late by 3 seconds"
    }
}