package practicaobject

fun main(){
    val descuento = object{
        fun aplicar(precio: Double, porcentaje: Int): Double {
            return precio * (1 - porcentaje / 100.0)
        }
    }

    println("Precio con descuento: ${descuento.aplicar(100.0, 15)}")
}