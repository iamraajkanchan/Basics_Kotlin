fun main() {
//--------------------List and Mutable List------------------------

//    Values in a Mutable List can be changed.
//    A Mutable List is mutable means you can add or remove elements from a Mutable List.
    var numbers: MutableList<Int> = mutableListOf<Int>(1, 3, 4, 5)
//    showMutableListIntValues(numbers)
//    Values in a List cannot be changed once defined
//    A List is immutable means you can't add neither remove elements from a List.
    var teens: List<Int> = listOf<Int>(14, 18, 19)
    numbers.addAll(teens)
//    showMutableListIntValues(numbers)
//    println(numbers.size)

//------------------ Map and Mutable Map----------------------------
    var maleProgrammer = mutableMapOf<Int, String>()
    maleProgrammer.put(3, "Abhishek")
    maleProgrammer.put(4, "Rahul")
    maleProgrammer.put(2, "Dhulaji Pandhare")
    maleProgrammer.put(1, "Ravish Ranjane")
    maleProgrammer.put(5, "Mayur")

    var newProgrammer = mapOf(6 to "Raaj", 6 to "Shivam")
    maleProgrammer.putAll(newProgrammer)
    maleProgrammer.toSortedMap()


    showMutableMapProgrammerValues(maleProgrammer)

    val programName = ArrayList<String>()
    programName.apply {
        add("SmartDrive")
        add("PetroCorp")
        add("SmartFleet")
    }

    var programNameClone = arrayListOf("", "", "")
    programName.forEachIndexed { index, program ->
        when (program) {
            "SmartDrive" -> programNameClone[1] = programName[index]
            "PetroCorp" -> programNameClone[2] = programName[index]
            "SmartFleet" -> programNameClone[0] = programName[index]
        }
    }

    println("Main :: programNameClone : $programNameClone")
    println("Main :: programNameClone : ${programNameClone.size}")
}

fun showMutableListIntValues(list: MutableList<Int>) {
    for (value in list) {
        println(value)
    }
}

fun showMutableMapProgrammerValues(programmers: MutableMap<Int, String>) {
    for (programmer in programmers) {
        println("${programmer.key} - ${programmer.value}")
    }
}

