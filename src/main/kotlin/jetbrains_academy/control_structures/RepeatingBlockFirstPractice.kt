package jetbrains_academy.control_structures
const val D_GRADE = 2
const val C_GRADE = 3
const val B_GRADE = 4
const val A_GRADE = 5
fun main() {
    val numberOfStudents = readln().toInt()
    var aGrade = 0
    var bBrade = 0
    var cGrade = 0
    var dGrade = 0
    repeat(numberOfStudents) {
        when (readln().toInt()) {
            D_GRADE -> dGrade++
            C_GRADE -> cGrade++
            B_GRADE -> bBrade++
            A_GRADE -> aGrade++
        }
    }
    println("$dGrade $cGrade $bBrade $aGrade")
}