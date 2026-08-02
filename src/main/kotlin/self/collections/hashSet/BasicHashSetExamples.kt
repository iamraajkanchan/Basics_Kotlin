package self.collections.hashSet

/**
 * Quality: Unique Values
 * When to use: Store unique values.
 * Scenario: A QR ticket should not be scanned twice. Duplicates should be ignored.
 * */
class BasicHashSetExamples {

    private val stringSet = HashSet<String>()

    fun addElementOperation(element: String) {
        stringSet.add(element)
    }

    fun removeElementOperation(element: String){
        stringSet.remove(element)
    }

    /*
    * This operation is not available for a Set
    * */

    @Deprecated("This operation doesn't work on a set!")
    fun removeElementByIndexOperation(index: Int) {

    }


    fun getHashSet(): HashSet<String> = stringSet
}