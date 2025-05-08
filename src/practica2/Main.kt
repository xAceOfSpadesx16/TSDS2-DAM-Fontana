package practica2

fun main(){
    var edad: Int = Validador.leerEdad()
    val usuario1: Usuario = Usuario("Pepito", edad)
    usuario1.saludar()
    println("${usuario1.getNombre()} tiene ${usuario1.getEdad()} años.")
    println("${usuario1.getNombre()} es ${if(usuario1.esMayorDeEdad()) "Mayor" else "Menor"} de edad")

    edad = Validador.leerEdad()
    usuario1.setEdad(edad)

    println("La nueva edad de ${usuario1.getNombre()} es: ${usuario1.getEdad()}")
}