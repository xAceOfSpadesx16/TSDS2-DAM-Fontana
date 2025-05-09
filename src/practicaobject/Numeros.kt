package practicaobject

fun main(){
    val validadorNumero = object{
        fun parOImpar(num: Int){
            println("El numero $num es: ${if(num % 2 == 0) "Par" else "Impar"}")
        }
    }

    validadorNumero.parOImpar(3)
    validadorNumero.parOImpar(4)
}