package jetbrains_academy.functions

fun main(args: Array<String>) {
    for (index in args.indices) {
        println("Argument $index: ${args[index]}. It has ${args[index].length} characters")
    }
}