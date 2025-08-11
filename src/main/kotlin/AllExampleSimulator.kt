import common.SingletonClassDemo
import common.Utility
import coroutines.BasicCoroutines
import coroutines.CalculateExecutionTime
import coroutines.CoroutineScopeAndBuilder
import coroutines.CoroutineScopeExamples
import coroutines.printWorldExplicitJob
import interview_practice.dsa.DSAOnString
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.ExperimentalTime
import kotlin.time.TimedValue
import kotlin.time.measureTimedValue

fun main() {
    simulateSingletonClassDemo()
}

suspend fun simulateCoroutineScopeAndBuilder() {
    CalculateExecutionTime.setStartTime()
    val coroutineScopeAndBuilder = CoroutineScopeAndBuilder()
    coroutineScopeAndBuilder.printWorldCoroutineScopeAndBuilder()
    delay(3000L)
    CalculateExecutionTime.setEndTime()
    println("Execution Time: ${CalculateExecutionTime.getExecutionTime()}")
    println("Done")
}

suspend fun simulateCoroutineScopeExamples() {
    val coroutineScopeInstance = CoroutineScopeExamples()
    coroutineScopeInstance.printWorld()
}

fun simulateDSAOnString() {
    val dsaOnString = DSAOnString()
    // println(dsaOnString.reverseString("Raaj"))
    println(dsaOnString.countWordInSentence("I have done this question using Kotlin, I am so awesome"))
}

@OptIn(ExperimentalTime::class)
suspend fun simulateExplicitJob() {
    val res: TimedValue<Unit> = measureTimedValue { printWorldExplicitJob() }
    // println("It took ${res.duration.toComponents { seconds, _ -> seconds }}s to calculate ${res.value}")
    println("It took ${res.duration} to calculate ${res.value}")
}

suspend fun simulateBasicCoroutines() : String {
    val basicCoroutines = BasicCoroutines()
    Utility.printLog(BasicCoroutines::class.java, Thread.currentThread().stackTrace[2], "Waiting for the suspended function to get the value.")
    return basicCoroutines.getValueAfterThreeSeconds();
}


fun simulateSingletonClassDemo() {
    val demo = SingletonClassDemo.getInstance()
    println(demo.name)


}