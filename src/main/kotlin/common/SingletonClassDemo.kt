package common

class SingletonClassDemo private constructor() {

    val name = "Test"

    companion object {
        @JvmStatic
        fun getInstance() : SingletonClassDemo {
            return SingletonClassDemo()
        }
    }
}
