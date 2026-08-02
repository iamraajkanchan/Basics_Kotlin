package self.collections.priorityQueue

data class MyPriorityTask(val description: String, val priorityLevel: Int) : Comparable<MyPriorityTask> {
    override fun compareTo(other: MyPriorityTask): Int {
        return this.priorityLevel.compareTo(other.priorityLevel)
    }
}
