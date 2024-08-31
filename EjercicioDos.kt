// Definición de la interfaz
interface FizzBuzzInterface {
    fun fizzbuzz(start: Int, end: Int)
}

// Implementación de la clase FizzBuzz
class FizzBuzz : FizzBuzzInterface {
    override fun fizzbuzz(start: Int, end: Int) {
        // Validación de entrada
        if (start < 1 || end < 1 || start > end) {
            throw IllegalArgumentException("Rango de números no válido. Asegúrate de que ambos números sean mayores que 0 y que el inicio sea menor o igual que el final.")
        }

        // Lógica FizzBuzz
        for (number in start..end) {
            when {
                number % 3 == 0 && number % 5 == 0 -> println("FizzBuzz")
                number % 3 == 0 -> println("Fizz")
                number % 5 == 0 -> println("Buzz")
                else -> println(number)
            }
        }
    }
}

// Ejecución del programa
fun main() {
    val fizzBuzzGame = FizzBuzz()

    try {
        // Se puede cambiar el rango aquí
        fizzBuzzGame.fizzbuzz(1, 100)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}