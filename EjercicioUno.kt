fun main() {
    println("Ingrese la cantidad de números que desea");
    
    // Asegúrate de que la entrada sea válida
    val cantidadInput = readLine()
    var cantidad = 0

    if (cantidadInput != null) {
        try {
            cantidad = cantidadInput.toInt()
        } catch (e: NumberFormatException) {
            println("Por favor, ingrese un número válido.")
            return
        }
    } else {
        println("No se recibió entrada, programa finalizado.")
        return
    }

    var npares = 0
    var nimpares = 0

    for (i in 1..cantidad) {
        println("Ingrese el número $i:")
        val numeroInput = readLine()

        if (numeroInput != null) {
            try {
                val numero = numeroInput.toInt()
                
                if (numero % 5 != 0) { // Chequea solo el número ingresado
                    if (numero % 2 == 0) npares++ else nimpares++
                }
            } catch (e: NumberFormatException) {
                println("Entrada no válida. Debe ingresar un número.")
            }
        } else {
            println("No se recibió entrada, omitiendo...")
        }
    }

    println("En total hay $npares números pares y $nimpares números impares.")
}