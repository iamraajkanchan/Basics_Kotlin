fun main() {
    val above70: Boolean = false;
    val knowsProgramming: Boolean = true;

    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)
}