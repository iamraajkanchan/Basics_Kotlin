package cheezycode

fun main(args: Array<String>) {
    val gender: String = "Male" // "Female", "Others"
//    var gender2: String = null; // In this case you are assigning a null value to gender2 so the compiler is creating an issue
//    In order to avoid this issue created by compiler it's better to be safe and use the below reference
    val gender2: String? = null;
    var isValid: Boolean? = null;
    if (gender2 != null) {
        gender2.lowercase()
    }
//    To avoid the above if condition you can use.
    println(gender2?.lowercase());
    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    } // Methods under let{} runs when the value of the variable is not null. So because gender2 is null therefore the three
//    println's doesn't run.
    gender.let {
        println("Line 1")
        println("Line 2 $gender")
        println("Line 3 $it")
    } // Methods under let{} runs when the value of the variable is not null.
    val userGender = gender2 ?: "NA"
//    ?: is Elvis operator, it returns the designated value when the assigned variable is null.
    println(userGender)

    val adminGender = gender2?.lowercase()
//    !! is not null asserted operator. If the assigned variable is null then throw an error or otherwise execute the attached method
    println(adminGender) //throws an error
}