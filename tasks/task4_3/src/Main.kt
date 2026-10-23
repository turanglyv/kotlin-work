// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Please enter 3 grades only")
    }

    val a = args[0].toInt()
    val b = args[1].toInt()
    val c = args[2].toInt()

    val average = ((a + b + c) / 3.0).roundToInt()

    val grade = when (average) {
        in 70..100 -> "Distinction"
        in 40..60 -> "Pass"
        in 0..39 -> "Fail"
        else -> "?"
    }

    println("Average = " + average)
    println("Grade = " + grade)
}