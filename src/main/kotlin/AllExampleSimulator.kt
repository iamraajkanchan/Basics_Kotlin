import common.SingletonClassDemo
import common.Utility
import coroutines.BasicCoroutines
import coroutines.CalculateExecutionTime
import coroutines.CoroutineScopeAndBuilder
import coroutines.CoroutineScopeExamples
import coroutines.printWorldExplicitJob
import dsa.apna_college.ArrayQuestion
import dsa.apna_college.PatternQuestion
import interview_practice.dsa.DSAOnString
import kotlinx.coroutines.delay
import kotlin.time.ExperimentalTime
import kotlin.time.TimedValue
import kotlin.time.measureTimedValue

fun main() {
    // simulateSingletonClassDemo()
    // simulatePatternQuestionMethods()
    simulateArrayQuestionMethods()
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
    arrayQuestion.reverseArray(arrayOf(1,2,3,4,5,6,7,8,9))
}