package practicaobject

fun main(){

    val rectangulo = object {
        val base: Int = 10;
        val altura: Int = 20;

        fun calcularArea(): Int {
            return base * altura
        }
    }

    println("Calculando el area de un rectangulo.")
    println("Base: ${rectangulo.base}")
    println("Altura: ${rectangulo.altura}")
    println("El area del rectangulo es: ${rectangulo.calcularArea()} cm2")
}