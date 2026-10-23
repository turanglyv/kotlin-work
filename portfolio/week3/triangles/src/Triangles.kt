import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(t: Triangle): Boolean {
    val a = t.first
    val b = t.second
    val c = t.third

    return (a + b > c) && (a + c > b) && (b + c > a)
}

fun triangleArea(t: Triangle): Double {
if(isValidTriangle(t)==false){
            throw IllegalArgumentException("False")
        }
    val a = t.first
    val b = t.second
    val c = t.third

    val p = (a + b + c) / 2
    val area = sqrt(p * (p - a) * (p - b) * (p - c))

    return area
}