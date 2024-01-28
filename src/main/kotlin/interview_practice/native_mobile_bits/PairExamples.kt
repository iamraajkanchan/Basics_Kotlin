package interview_practice.native_mobile_bits

class PairExamples {
    fun simulate() {
        val studentPair = Pair("SSC", "10th")
        println("Student Pair First Value : ${studentPair.first}")
        println("Student Pair Second Value : ${studentPair.second}")

        val (label, standard) = Pair("HSC", 12)
        println(label)
        println(standard)
        println("Label : $label")
        println("Standard : $standard")

        val studentTripe = Triple("John Doe", 12, 125)
        println("Student Tripe First Value : ${studentTripe.first}")
        println("Student Tripe Second Value : ${studentTripe.second}")
        println("Student Tripe third Value : ${studentTripe.third}")

        val (teacherName, classAttend, studentCount) = Triple("Ryan Gosling", 11, 129)
        println("Teacher Name : $teacherName")
        println("Class Attend : $classAttend")
        println("Student Count : $studentCount")
    }
}