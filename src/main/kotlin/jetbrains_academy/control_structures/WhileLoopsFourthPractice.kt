package jetbrains_academy.control_structures


fun main() {
    var input = readln().toInt()
    while (input > 1) {
        print("$input ")
        if (input % 2 == 0) {
            input /= 2
        } else if (input == 1) {
            break
        } else {
            input = input * 3 + 1
        }
    }
    println(input)
}