package self.collections.priorityQueue

/**
 * Quality: By Priority
 * When to use: Highest (or lowest) priority item should be processed first.
 * Scenario: Hospital emergency: Critical>Moderate>Normal
 * Why use it?: Elements are ordered by priority.
 * For Integer, natural order means ascending numerical order (1 before 2).
 * For String, natural order means lexicographical order (alphabetical, based on Unicode values).
 * * Capital letters come before lowercase letters ("Apple" before "apple").
 * * Alphabetical order determines priority ("apple" comes before "banana").
 * What if you want a different priority rule, like sorting by string length or reverse alphabetical order?
 * * You can pass a custom Comparator when creating the queue:
 * * * Priority by String length (Shortest First)
 * ==============================================================================
 * val pqByLength = PriorityQueue<String>(compareBy { it.length })
 * pqByLength.add("Elephant")
 * pqByLength.add("Cat")
 * pqByLength.add("Giraffe")
 * ==============================================================================
 * * * Reverse Alphabetical Order (Z to A)
 * ==============================================================================
 * val pqReverse = PriorityQueue<String>(compareByDescending { it })
 * pqReverse.add("Apple")
 * pqReverse.add("Banana")
 * println(pqReverse.poll()) // Prints "Banana"
 * println(pqByLength.poll()) // Prints "Cat"
 * ==============================================================================
 * PriorityQueue<T> works on any class T in Kotlin as long as:
 * T implements the Comparable interface (like Int, String, Double, etc.), OR
 * You supply a custom Comparator when initializing the queue.
 * ==============================================================================
 * data class Task(
 *     val title: String,
 *     val priorityLevel: Int // 1 = High, 2 = Medium, 3 = Low
 * ) : Comparable<Task> {
 *
 *     // 2. Define how two Task objects are compared
 *     override fun compareTo(other: Task): Int {
 *         return this.priorityLevel.compareTo(other.priorityLevel)
 *     }
 * }
 *
 * fun main() {
 *     // PriorityQueue automatically uses Task's compareTo method
 *     val taskQueue = PriorityQueue<Task>()
 *
 *     taskQueue.add(Task("Update documentation", priorityLevel = 3))
 *     taskQueue.add(Task("Fix crashing bug in production", priorityLevel = 1))
 *     taskQueue.add(Task("Review pull request", priorityLevel = 2))
 *
 *     println("Processing tasks by priority:")
 *     while (taskQueue.isNotEmpty()) {
 *         val task = taskQueue.poll()
 *         println("• Priority ${task.priorityLevel}: ${task.title}")
 *     }
 * }
 * */
class BasicPriorityQueueExamples {
}