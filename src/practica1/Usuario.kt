package practica1

class Usuario(private val nombre: String, private val edad: Int){

    fun evaluarEdad(){
        if(this.edad < 18){
            println(this.nombre + " es MENOR DE EDAD.")
        }
        else if(this.edad < 65){
            println(this.nombre + " es ADULTO")
        }
        else {
            println(this.nombre + " es un ADULTO MAYOR")
        }
    }


}