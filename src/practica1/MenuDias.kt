package practica1

class MenuDias {
    private val opcionesDias: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    private val diasHabiles: List<String> = opcionesDias.subList(0, 5)

    fun iniciar(){
        println("Menu de dias: ")
        opcionesDias.forEachIndexed{ index, dia ->
            println((index + 1).toString() + "- "+ dia)
        }
        val diaElegido = this.elegirDia(this.opcionesDias.size)
        this.tipoDeDia(diaElegido)
    }

    private fun elegirDia(maxVal: Int): Int {
        val minVal: Int = 1
        var eleccion: Int? = null

        do {
            print("Elija el dia: ")
            val inputEleccion = readlnOrNull()?.trim()

            if (inputEleccion.isNullOrEmpty() || !inputEleccion.matches(Regex("-?\\d+"))) {
                println("Ingresa un numero entero válido sin letras ni símbolos. Intente nuevamente.")
            }
            else {
                eleccion = inputEleccion.toInt()

                if (eleccion < minVal || eleccion > maxVal){
                    println("El numero ingresado se encuentra fuera del rango.")
                    println("El numero debe encontrarse entre: $minVal y $maxVal")
                    eleccion = null
                }
            }
        } while (eleccion == null)
        return eleccion - 1
    }

    private fun tipoDeDia(indice: Int){
        val diaElegido: String = this.opcionesDias[indice]
        if (diaElegido in diasHabiles){
            println("El dia $diaElegido es un DIA LABORAL")
        }
        else{
            println("El dia $diaElegido es FIN DE SEMANA")
        }
    }
}