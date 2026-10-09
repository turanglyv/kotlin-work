// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Please enter 3 numbers")
        exitProcess(1)
    }
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()
    val s = (a + b + c) / 2
    val area = sqrt(s * (s - a) * (s - b) * (s - c))

    println("Area = %.5f".format(area))
}