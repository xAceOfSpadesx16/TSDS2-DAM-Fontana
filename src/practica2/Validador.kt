package practica2

object Validador {

    fun leerEdad():Int{
        /*
        * Solicita al usuario ingresar una edad por consola
        * Verifica que el valor ingresado sea una cadena de caracteres de digitos
        * y si el valor ingresado es mayor a 0
        */
        do {
            print("ingrese su edad: ")
            val ingreseEdad = readln()
            val esDigito = this.stringDigitsNotNull(ingreseEdad)
            if(esDigito) {
                val edad = ingreseEdad.toInt()
                val noCero = this.mayorCero(edad)
                if (!noCero) {
                    println("El valor ingresado debe ser mayor a 0")
                } else {
                    return edad
                }
            } else {
                println("El valor ingresado debe ser un numero.")
            }
        }while(true)
    }

    private fun stringDigitsNotNull(valor: String?): Boolean {
        /* Retorna true si el valor es un string que contiene digitos numericos */
        return (!valor.isNullOrEmpty() || valor!!.matches(Regex("-?\\d+")))
    }

    private fun mayorCero(valor: Int): Boolean {
        return valor > 0
    }
}