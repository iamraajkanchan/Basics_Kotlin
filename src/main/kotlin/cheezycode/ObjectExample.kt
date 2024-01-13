package cheezycode

fun main() {
//    This is also called Singleton Pattern. As you can see no object is needed to access methods of SharingWidget Object.
    SharingWidget.incrementFacebookLikes()
    SharingWidget.incrementFacebookLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.showLikes()

//    Example of Simple Object Expression
    val obj = object {
        var callCount: Int = 0
        var messageCount: Int = 0
        fun showCallAndMessageCounts() = println("Call Count: $callCount, Message Count: $messageCount")
    }
//    Though this object doesn't have a constructor, it can still override the default value of properties
    obj.callCount = 8
    obj.messageCount = 14
    obj.showCallAndMessageCounts()

//    Example of Object Expression with Inheritance
    val obj1 = object : PersonObjectExample("Richard Branson") {
        fun greetUser() = println("Hello $name ")
    }
    obj1.greetUser()

    val obj2 = object : UserBehaviourObjectExample {
        override fun like() {
            println("Record and Increase Likes")
        }

        override fun comment() {
            println("Record and Add Comments")
        }

        override fun subscribe() {
            println("User Subscribed")
        }
    }

    obj2.like()
    obj2.comment()
    obj2.subscribe()
}

// Object is same like a Class. Object can have properties and values but it can't have a object.
// It doesn't make sense to create object of another object.
object SharingWidget {
    private var facebookLikes: Int = 0
    private var twitterLikes: Int = 0
    fun incrementFacebookLikes(): Int = facebookLikes++
    fun incrementTwitterLikes(): Int = twitterLikes++
    fun showLikes() = println("Facebook Likes: $facebookLikes, Twitter Likes: $twitterLikes")
}

// this Class is created to extend to create an anonymous Object
open class PersonObjectExample(nameParam: String) {
    var name: String = nameParam
}

// this Interface is created to implement an anonymous Object
interface UserBehaviourObjectExample {
    fun like()
    fun comment()
    fun subscribe()
}