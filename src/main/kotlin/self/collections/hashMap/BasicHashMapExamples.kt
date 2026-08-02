package self.collections.hashMap

/**
 * Quality: Key -> Value
 * When to use: Lookup by a unique key.
 * Scenario: Find passenger name using Ticket ID:
 * Why use it?: Very fast key-value lookup.
 * */

class BasicHashMapExamples {

    private val stringHashMap = HashMap<Int, String>()

    fun addElementOperation(index: Int, element: String) {
        stringHashMap[index] = element
    }

    fun removeElementByKeyOperation(index: Int) {
        stringHashMap.remove(index)
    }

    fun removeElementByKeyAndValueOperation(oldIndex: Int, newElement: String) {
        stringHashMap.remove(oldIndex, newElement)
    }

    fun getHashMap(): HashMap<Int, String> = stringHashMap
}