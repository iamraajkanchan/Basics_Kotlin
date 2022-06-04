package jetbrains_academy.control_structures

fun main() {
    var balance = readln().toInt()
    val expenses = readln().split(' ')
    var sumOfExpenses = 0
    var lastExpense = 0
    for (expense in expenses) {
        lastExpense = expense.toInt()
        while (balance > 0) {
            balance -= lastExpense
            break
        }
        sumOfExpenses += lastExpense
    }
    if (balance >= 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
    if (balance < sumOfExpenses) {
        println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $lastExpense.")
    }
}