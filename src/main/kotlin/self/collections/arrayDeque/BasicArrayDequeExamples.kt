package self.collections.arrayDeque


/**
 * Quality: Dequeue (Both Ends)
 * When to use: If you want to add or remove an element efficiently from a collection then use ArrayDeque
 * Scenario: Normal Queue, but VIP passes can be added to the front.
 * Why use it?: Efficient for both queue and stack operations.
 * */
class BasicArrayDequeExamples {

    private val stringQueue = ArrayDeque<String>()

    fun addFirstOperation(element: String) {
        stringQueue.addFirst(element)
    }

    fun addElementOperation(element: String) {
        stringQueue.add(element)
    }

    fun addLastOperation(element: String){
        stringQueue.addLast(element)
    }

    fun removeFirstElementOperation() {
        stringQueue.removeFirst()
    }

    fun removeLastElementOperation() {
        stringQueue.removeLast()
    }

    fun removeElementByIndexOperation(index: Int) {
        stringQueue.removeAt(index)
    }


    fun getArrayQueue() : ArrayDeque<String> = stringQueue
}