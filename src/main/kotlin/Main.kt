fun main() {
    println("Введите два числа:")
    val firstNumber = readLine()?.toDoubleOrNull()
    val secondNumber = readLine()?.toDoubleOrNull()

    if (firstNumber != null && secondNumber != null) {
        println("Введите операцию +, -, * или /:")
        val o = readLine().toString()[0]
        var result: Double? = null

        when (o) {
            '+' -> {
                result = firstNumber + secondNumber
            }
            '-' -> {
                result = firstNumber - secondNumber
            }
            '*' -> {
                result = firstNumber * secondNumber
            }
            '/' -> {
                result = firstNumber / secondNumber
            }
            else -> {
                println("Введите правльный оператор")
            }
        }

        if (result != null) {
            println("$firstNumber $o $secondNumber = $result")
        }
    } else {
        print("Введите число")
    }
}