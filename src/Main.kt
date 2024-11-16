fun reverseNumberHelper(number: Int, reversed: Int): Int {
    if (number == 0) return reversed
    return reverseNumberHelper(number / 10, reversed * 10 + number % 10)
}

fun reverseNumber(number: Int): Int {
    return reverseNumberHelper(number, 0)
}

fun main() {
    val number = 12345
    val reversed = reverseNumber(number)
    println(reversed)
}
