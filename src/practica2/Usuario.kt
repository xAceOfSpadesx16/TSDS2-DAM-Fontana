package practica2

class Usuario (private var nombre : String, private var edad : Int) {

    fun getNombre(): String{
        return this.nombre
    }

    fun setNombre(nombre: String){
        this.nombre = nombre
    }

    fun getEdad(): Int{
        return this.edad
    }

    fun setEdad(nuevaEdad: Int){
        if (nuevaEdad > 0){
            this.edad = nuevaEdad
        } else {
            print("La edad no pudo actualizarse, debe ser mayor a 0")
        }
    }
    fun esMayorDeEdad(): Boolean{
        return  this.edad >= 18
    }

    fun saludar(){
        println("Hola, mi nombre es ${this.nombre}")
    }

}