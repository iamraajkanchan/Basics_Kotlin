package self.collections.arrayList


/**
 * Quality: Dynamic List
 * When to use: Frequently add items and access them by index.
 * Scenario: Passengers keep entering the station.
 * Why use it?: Size changes easy to add items and fast random access.
 * */
class BasicArrayListExamples {

    private val stringList = ArrayList<String>()

    fun addElementOperation(element: String) {
        stringList.add(element)
    }

    fun removeElementOperation(element: String) {
        stringList.remove(element)
    }

    fun removeElementByIndex(index: Int) {
        stringList.removeAt(index)
    }

    fun getArrayList() : ArrayList<String> = stringList

}