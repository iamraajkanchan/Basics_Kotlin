package jetbrains_academy.lists

fun main() {
    val mutable3DList = mutableListOf(
        mutableListOf(
            mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0)
        ),
        mutableListOf(
            mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0)
        ),
        mutableListOf(
            mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0), mutableListOf<Int>(0, 0, 0)
        )
    )
    println(mutable3DList.joinToString())
}