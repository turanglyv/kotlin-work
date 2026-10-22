// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val filePath = Path("testt.txt")
    filePath.writeText("Hello World!") 
    filePath.appendText(" I learn kotlin")   // Add your code here

    val contents = filePath.readText()
    println(contents)
}
