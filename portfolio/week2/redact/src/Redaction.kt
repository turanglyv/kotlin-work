// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(text: String, word: String, symbol: Char = 'X'): String {
    val hidden = symbol.toString().repeat(word.length)
    val result = text.replace(word, hidden)

    return result
}
