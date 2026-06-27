import common.SingletonClassDemo
import coroutines.BasicCoroutines
import coroutines.CoroutineScopeAndBuilder
import coroutines.CoroutineScopeExamples
import coroutines.printWorldExplicitJob
import dsa.practice.arrays.ArrayQuestion
import dsa.apna_college.PatternQuestion
import interview_practice.dsa.DSAOnString
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import utils.ExecutionTime
import kotlin.time.ExperimentalTime
import kotlin.time.TimedValue
import kotlin.time.measureTimedValue

fun main() {
    val coroutineScope = CoroutineScope(Dispatchers.IO)
    // coroutineScope.launch { simulateCoroutineScopeExamples() } // This line is not working
    runBlocking { simulateCoroutineScopeExamples() } // This line is working
}

suspend fun simulateCoroutineScopeAndBuilder() {
    val executionTime = ExecutionTime()
    val coroutineScopeAndBuilder = CoroutineScopeAndBuilder()
    coroutineScopeAndBuilder.printWorldCoroutineScopeAndBuilder()
    delay(3000L)
    println(executionTime.getExecutionTime())
    println("Done")
}

suspend fun simulateCoroutineScopeExamples() {
    val coroutineScopeInstance = CoroutineScopeExamples()
    coroutineScopeInstance.asyncPrintWorld()
    //coroutineScopeInstance.syncPrintWorld()
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

@OptIn(DelicateCoroutinesApi::class)
fun simulateBasicCoroutines()  {
    val basicCoroutines = BasicCoroutines()
    GlobalScope.launch {
        val resultChannel = basicCoroutines.getValueAfterThreeSeconds()
        println("Raj Kanchan Logcat :: simulateBasicCoroutines :: resultChannel : ${resultChannel.consumeAsFlow().flowOn(
            Dispatchers.IO).collect {
                println(it)
        }}")
    }
    Thread.sleep(4000)
}


fun simulateSingletonClassDemo() {
    val demo = SingletonClassDemo.getInstance()
    println(demo.name)
}

fun simulatePatternQuestionMethods() {
    val patterns = PatternQuestion()
    // patterns.printSquarePatternWithSameElement(4)
    // patterns.printSquarePatternWithDifferentElement(3)
    // patterns.printTrianglePatternWithSameElementInAscendingOrder(4)
    patterns.printTrianglePatternWithSameElementInDescendingOrder(4)
}


fun simulateArrayQuestionMethods() {
    val arrayQuestion = ArrayQuestion()
    // arrayQuestion.swapElementOfArray(arrayOf(1,2,3,4,5,6,7,8,9))
    // println("${arrayQuestion.findSmallestElementInArray(arrayOf(1,2,3,4,5,6,7,8,9))}")
    // println("${arrayQuestion.findLargestElementInArray(arrayOf(1,2,3,4,5,6,7,8,9))}")
    // arrayQuestion.reverseArray(arrayOf(1,2,3,4,5,6,7,8,9))
    val result = arrayQuestion.findMaxSumOfConsecutiveBinaryElements(arrayOf(1,0,1,1,0,1,1,1,0))
    println(result)
}