// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU")
    println()
    println("(a) Margherita")
    println("(b) Four cheese")
    println("(c) Seafood")
    println("(d) Napalotena")
    println()

    println("Please choose pizza: ")
    val choice = readln().lowercase()

    val message = if (choice.length == 1 && choice[0] in 'a'..'d') {
        "Your order accepted!"
    } else {
        "Invalid choice"
    }
    println(message)
}
