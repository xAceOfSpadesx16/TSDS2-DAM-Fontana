package arrays_y_sus_tipos

fun main() {
    /*
    * Ejercicio 0: Suma de Elementos de un Array
        1. Crea un array llamado numeros que contenga los siguientes números enteros: 10, 20, 30, 40, 50.
        2. Crea una variable llamada suma inicializada en 0.
        3. Recorre el array numeros utilizando un bucle for. En cada iteración del bucle, suma el elemento actual a la
        variable suma.
        4. Imprime el valor final de suma.
    */

    val numeros = intArrayOf(10, 20, 30, 40, 50)
    var suma = 0

    for (num in numeros) {
        suma += num
    }
    println("Ejercicio N° 0")
    println("La suma de los elementos del array es: $suma")
    println()

    /*
    Ejercicio 1: Array de Strings (Array<String>)
        1. Crea un array llamado nombres que contenga los siguientes nombres: "Ana", "Pedro", "María", "Luis", "Laura".
        2. Imprime el primer elemento del array.
        3. Imprime el último elemento del array.
        4. Recorre el array nombres utilizando un bucle for e imprime cada nombre.
     */

    val nombres = arrayOf("Ana", "Pedro", "María", "Luis", "Laura")
    println("Ejercicio N° 1")
    println("El primer elemento del array es: ${nombres.first()}")
    println("El ultimo elemento del array es: ${nombres.last()}")

    for (nombre in nombres) {
        println("El nombre es: $nombre")
    }
    println()

    /*
    Ejercicio 2: Array de Enteros (IntArray)
        1. Crea un array llamado edades que contenga las siguientes edades: 25, 30, 22, 28, 35.
        2. Calcula la suma de todas las edades en el array e imprime el resultado.
        3. Encuentra la edad máxima en el array e imprime el resultado.
    */

    val numeros2 = arrayOf(25, 30, 22, 28, 35)
    println("Ejercicio N° 2")
    println("La suma de todas las edades es: ${numeros2.sum()}")
    println("la edad maxima en el array: ${numeros2.maxOrNull()}")
    println()

    /*
    Ejercicio 3: Array de Booleanos (BooleanArray)
        1. Crea un array llamado aprobados que contenga los siguientes valores booleanos: true, false, true, true, false.
        2. Cuenta cuántos valores son true en el array e imprime el resultado.
        3. Verifica si todos los valores en el array son true. Imprime "Todos aprobados" si lo son, o "No todos aprobados"
        si no lo son.
    */

    val aprobados = booleanArrayOf(true, false, true, true, false)
    println("Ejercicio N° 3")
    println("La cantidad de aprobados es: ${aprobados.filter { b -> b }.size}")
    println(if (aprobados.all { b -> b }) "Todos aprobados." else "No todos aprobados.")
    println()

    /*
    Ejercicio 4: Array de Doubles (DoubleArray)
        1. Crea un array llamado alturas que contenga las siguientes alturas en metros: 1.65, 1.70, 1.55, 1.80, 1.75.
        2. Calcula el promedio de las alturas en el array e imprime el resultado.
        3. Encuentra la altura más baja en el array e imprime el resultado.
    */

    val alturas = doubleArrayOf(1.65, 1.70, 1.55, 1.80, 1.75)
    println("Ejercicio N° 4")
    println("El promedio de altura es: ${alturas.average()}")
    println("La menor altura es: ${alturas.minOrNull()}")
}